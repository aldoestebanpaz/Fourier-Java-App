/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fourier.other;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.fourier.view.Fourier;

/**
 *
 * @author ViPeR
 */
public class PlayThread extends Thread {
    
    Fourier fourier;

    public PlayThread(Fourier fourier) {
        this.fourier=fourier;
    }
	public void soundChanged() { changed = true; }
	boolean changed;
        @Override
	public void run() {
	    
	    // this lovely code is a translation of the following, using
	    // reflection, so we can run on JDK 1.1:
	    
	    // AudioFormat format = new AudioFormat(rate, 8, 1, true, true);
	    // DataLine.Info info =
	    //           new DataLine.Info(SourceDataLine.class, format);
	    // SourceDataLine line = null;
	    // line = (SourceDataLine) AudioSystem.getLine(info);
	    // line.open(format, playSampleCount);
	    // line.start();

	    Object line;
	    Method wrmeth;
	    try {
		Class afclass = Class.forName("javax.sound.sampled.AudioFormat");
		Constructor cstr = afclass.getConstructor(
		    new Class[] { float.class, int.class, int.class,
				  boolean.class, boolean.class });
		Object format = cstr.newInstance(new Object[]
		    { new Float(fourier.rate), new Integer(16), new Integer(1),
		      new Boolean(true), new Boolean(true) });
		Class ifclass = Class.forName("javax.sound.sampled.DataLine$Info");
		Class sdlclass =
		    Class.forName("javax.sound.sampled.SourceDataLine");
		cstr = ifclass.getConstructor(
		    new Class[] { Class.class, afclass });
		Object info = cstr.newInstance(new Object[]
		    { sdlclass, format });
		Class asclass = Class.forName("javax.sound.sampled.AudioSystem");
		Class liclass = Class.forName("javax.sound.sampled.Line$Info");
		//Class dlclass = Class.forName("javax.sound.sampled.DataLine");
                Method glmeth = asclass.getMethod("getLine",
						  new Class[] { liclass });
		line = glmeth.invoke(null, new Object[] {info} );
		Method opmeth = sdlclass.getMethod("open",
			  new Class[] { afclass, int.class });
		opmeth.invoke(line, new Object[] { format,
			  new Integer(4096) });
		Method stmeth = sdlclass.getMethod("start");
		stmeth.invoke(line);
		byte b[] = new byte[1];
		wrmeth = sdlclass.getMethod("write",
			  new Class[] { b.getClass(), int.class, int.class });
	    } catch (Exception e) {
		e.printStackTrace();
		fourier.playThread = null;
		return;
	    }
	    
	    FFT playFFT = new FFT(fourier.playSampleCount);
	    double playfunc[] = null;
	    byte b[] = null;
	    int offset = 0;

	    while (fourier.getSoundCheck().isSelected()) {
		if (playfunc == null || changed) {
		    playfunc = new double[fourier.playSampleCount*2];
		    int i;
		    int terms = fourier.getTermBar().getValue();
		    double bstep = 2*fourier.pi*fourier.getFreq()/fourier.rate;
		    double mx = .2;
		    changed = false;
		    for (i = 1; i != terms; i++) {
			if (fourier.hasSolo && !fourier.solos[i])
			    continue;
			if (fourier.mutes[i])
			    continue;
			int dfreq = fourier.dfreq0*i;
			if (dfreq >= fourier.playSampleCount)
			    break;
			int sgn = (i & 1) == 1 ? -1 : 1;
			playfunc[dfreq]   =  sgn*fourier.magcoef[i]*Math.cos(fourier.phasecoef[i]);
			playfunc[dfreq+1] = -sgn*fourier.magcoef[i]*Math.sin(fourier.phasecoef[i]);
		    }
		    playFFT.transform(playfunc, true);
		    for (i = 0; i != fourier.playSampleCount; i++) {
			double dy = playfunc[i*2];
			if (dy > mx)  mx = dy;
			if (dy < -mx) mx = -dy;
		    }
		    
		    b = new byte[fourier.playSampleCount*2];
		    double mult = 32767/mx;
		    for (i = 0; i != fourier.playSampleCount; i++) {
			short x = (short) (playfunc[i*2]*mult);
			b[i*2] = (byte) (x/256);
			b[i*2+1] = (byte) (x & 255);
		    }
		}

		try {
		    int ss = 4096;
		    if (b!=null && offset >= b.length)
			offset = 0;
		    wrmeth.invoke(line, new Object[] { b, new Integer(offset),
						       new Integer(ss) });
		    offset += ss;
		} catch (Exception e) {
		    e.printStackTrace();
		    break;
		}
	    }
	    fourier.playThread = null;
	}
}
