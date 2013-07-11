/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fourier.other;

import java.awt.Rectangle;

/**
 *
 * @author ViPeR
 */
public class View extends Rectangle {
	public View(int x, int y, int w, int h) {
	    super(x, y, w, h);
	    midy = y+h/2;
	    ymult = .6 * h/2;
	    periodWidth = w/3;
	    labely = midy - 5 - h*3/8;
	}
	public int midy, labely;
	public double ymult;
	public int periodWidth;
}
