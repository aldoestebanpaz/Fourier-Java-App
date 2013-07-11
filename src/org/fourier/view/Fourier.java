/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fourier.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import org.fourier.other.FFT;
import org.fourier.other.FourierCanvas;
import org.fourier.other.PlayThread;
import org.fourier.other.View;

/**
 *
 * @author ViPeR
 */
public class Fourier extends javax.swing.JFrame implements ComponentListener,
        MouseMotionListener, MouseListener {

    /**
     * Creates new form Fourier
     */
    public Fourier() {
        initComponents();
    }
    
    public PlayThread playThread;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        soundCheck = new javax.swing.JCheckBox();
        magPhaseCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        termBar = new javax.swing.JScrollBar();
        freqBar = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        sineButton = new javax.swing.JButton();
        cosineButton = new javax.swing.JButton();
        triangleButton = new javax.swing.JButton();
        sawtoothButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        noiseButton = new javax.swing.JButton();
        phaseButton = new javax.swing.JButton();
        clipButton = new javax.swing.JButton();
        resampleButton = new javax.swing.JButton();
        quantizeButton = new javax.swing.JButton();
        rectButton = new javax.swing.JButton();
        fullRectButton = new javax.swing.JButton();
        highPassButton = new javax.swing.JButton();
        blankButton = new javax.swing.JButton();
        about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Series de Fourier");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 650));
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        soundCheck.setText("Sonido");
        soundCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                soundCheckItemStateChanged(evt);
            }
        });

        magPhaseCheck.setText("Vista Manitudes/Fases");
        magPhaseCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                magPhaseCheckItemStateChanged(evt);
            }
        });

        jLabel1.setText("Términos");

        jLabel2.setText("Frecuencia");

        termBar.setMinimum(1);
        termBar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        termBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                termBarAdjustmentValueChanged(evt);
            }
        });

        freqBar.setMaximum(500);
        freqBar.setMinimum(-100);
        freqBar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        freqBar.setValue(251);
        freqBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                freqBarAdjustmentValueChanged(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(3, 4));

        sineButton.setText("Seno");
        sineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sineButtonActionPerformed(evt);
            }
        });
        jPanel2.add(sineButton);

        cosineButton.setText("Coseno");
        cosineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosineButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cosineButton);

        triangleButton.setText("Triángulo");
        triangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleButtonActionPerformed(evt);
            }
        });
        jPanel2.add(triangleButton);

        sawtoothButton.setText("Diente de Sierra");
        sawtoothButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sawtoothButtonActionPerformed(evt);
            }
        });
        jPanel2.add(sawtoothButton);

        squareButton.setText("Cuadrada");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });
        jPanel2.add(squareButton);

        noiseButton.setText("Ruido");
        noiseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noiseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(noiseButton);

        phaseButton.setText("Fase");
        phaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(phaseButton);

        clipButton.setText("Acortar");
        clipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clipButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clipButton);

        resampleButton.setText("Reenzamblar");
        resampleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resampleButtonActionPerformed(evt);
            }
        });
        jPanel2.add(resampleButton);

        quantizeButton.setText("Cuantificar");
        quantizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantizeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(quantizeButton);

        rectButton.setText("Rectificar");
        rectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectButtonActionPerformed(evt);
            }
        });
        jPanel2.add(rectButton);

        fullRectButton.setText("Rectificación Completa");
        fullRectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullRectButtonActionPerformed(evt);
            }
        });
        jPanel2.add(fullRectButton);

        highPassButton.setText("Filtro Pasa Alto");
        highPassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highPassButtonActionPerformed(evt);
            }
        });
        jPanel2.add(highPassButton);

        blankButton.setText("Limpiar");
        blankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blankButtonActionPerformed(evt);
            }
        });
        jPanel2.add(blankButton);

        about.setText("Acerca de ...");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(magPhaseCheck)
                            .addComponent(soundCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(termBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(freqBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(about)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(soundCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(magPhaseCheck))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(termBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(freqBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(about))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void triangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleButtonActionPerformed
        // TODO add your handling code here:
        doTriangle();
	cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_triangleButtonActionPerformed

    private void sineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sineButtonActionPerformed
        // TODO add your handling code here:
        doSine();
	cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_sineButtonActionPerformed

    private void cosineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosineButtonActionPerformed
        // TODO add your handling code here:
        doCosine();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_cosineButtonActionPerformed

    private void rectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtonActionPerformed
        // TODO add your handling code here:
        doRect();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_rectButtonActionPerformed

    private void fullRectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullRectButtonActionPerformed
        // TODO add your handling code here:
        doFullRect();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_fullRectButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        // TODO add your handling code here:
        doSquare();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_squareButtonActionPerformed

    private void highPassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highPassButtonActionPerformed
        // TODO add your handling code here:
        doHighPass();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_highPassButtonActionPerformed

    private void noiseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noiseButtonActionPerformed
        // TODO add your handling code here:
        doNoise();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_noiseButtonActionPerformed

    private void phaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaseButtonActionPerformed
        // TODO add your handling code here:
        doPhaseShift();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_phaseButtonActionPerformed

    private void blankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blankButtonActionPerformed
        // TODO add your handling code here:
        doBlank();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_blankButtonActionPerformed

    private void sawtoothButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sawtoothButtonActionPerformed
        // TODO add your handling code here:
        doSawtooth();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_sawtoothButtonActionPerformed

    private void clipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clipButtonActionPerformed
        // TODO add your handling code here:
        doClip();
        cv.repaint();
        quantizeCount = 0;
        resampleCount = 0;
    }//GEN-LAST:event_clipButtonActionPerformed

    private void quantizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantizeButtonActionPerformed
        // TODO add your handling code here:
        doQuantize();
        cv.repaint();
        resampleCount = 0;
    }//GEN-LAST:event_quantizeButtonActionPerformed

    private void resampleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resampleButtonActionPerformed
        // TODO add your handling code here:
        doResample();
        cv.repaint();
        quantizeCount = 0;
    }//GEN-LAST:event_resampleButtonActionPerformed

    private void soundCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_soundCheckItemStateChanged
        // TODO add your handling code here:
        if (soundCheck.isSelected() && playThread == null) {
	    playThread = new PlayThread(this);
	    playThread.start();
	}
        cv.repaint();
    }//GEN-LAST:event_soundCheckItemStateChanged

    private void magPhaseCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_magPhaseCheckItemStateChanged
        // TODO add your handling code here:
        handleResize();
	cv.repaint();
    }//GEN-LAST:event_magPhaseCheckItemStateChanged

    private void termBarAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_termBarAdjustmentValueChanged
        // TODO add your handling code here:
        System.out.print(((JScrollBar) evt.getSource()).getValue() + "\n");
        updateSound();
        cv.repaint();
    }//GEN-LAST:event_termBarAdjustmentValueChanged

    private void freqBarAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_freqBarAdjustmentValueChanged
        // TODO add your handling code here:
        System.out.print(((JScrollBar) evt.getSource()).getValue() + "\n");
        freqAdjusted = true;
        updateSound();
        cv.repaint();
    }//GEN-LAST:event_freqBarAdjustmentValueChanged

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        About dialog = new About(this, true);
//        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//            @Override
//            public void windowClosing(java.awt.event.WindowEvent e) {
//                System.exit(0);
//            }
//        });
        dialog.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    public static final int sampleCount = 1024;
    public static final double halfSampleCountFloat = sampleCount/2;
    
    void doSawtooth() {
	int x;
	for (x = 0; x != sampleCount; x++)
	    func[x] = (x-sampleCount/2) / halfSampleCountFloat;
	func[sampleCount] = func[0];
	transform();
    }

    void doTriangle() {
	int x;
	for (x = 0; x != halfSampleCount; x++) {
	    func[x] = (x*2-halfSampleCount) / halfSampleCountFloat;
	    func[x+halfSampleCount] =
		((halfSampleCount-x)*2-halfSampleCount) / halfSampleCountFloat;
	}
	func[sampleCount] = func[0];
	transform();
    }

    void doSine() {
	int x;
	for (x = 0; x != sampleCount; x++) {
	    func[x] = Math.sin((x-halfSampleCount)*step);
	}
	func[sampleCount] = func[0];
	transform();
    }

    void doCosine() {
	int x;
	for (x = 0; x != sampleCount; x++) {
	    func[x] = Math.cos((x-halfSampleCount)*step);
	}
	func[sampleCount] = func[0];
	transform();
    }

    void doRect() {
	int x;
	for (x = 0; x != sampleCount; x++)
	    if (func[x] < 0)
		func[x] = 0;
	func[sampleCount] = func[0];
	transform();
    }

    void doFullRect() {
	int x;
	for (x = 0; x != sampleCount; x++)
	    if (func[x] < 0)
		func[x] = -func[x];
	func[sampleCount] = func[0];
	transform();
    }

    void doHighPass() {
	int i;
	int terms = termBar.getValue();
	for (i = 0; i != terms; i++)
	    if (magcoef[i] != 0) {
		magcoef[i] = 0;
		break;
	    }
	doSetFunc();
    }
    
    void doSquare() {
	int x;
	for (x = 0; x != halfSampleCount; x++) {
	    func[x] = -1;
	    func[x+halfSampleCount] = 1;
	}
	func[sampleCount] = func[0];
	transform();
    }

    void doNoise() {
	int x;
	int blockSize = 3;
	for (x = 0; x != sampleCount/blockSize; x++) {
	    double q = Math.random() *2 - 1;
	    int i;
	    for (i = 0; i != blockSize; i++)
		func[x*blockSize+i] = q;
	}
	func[sampleCount] = func[0];
	transform();
    }
    
    void doPhaseShift() {
	int i;
	int sh = sampleCount/20;
	double copyf[] = new double[sh];
	for (i = 0; i != sh; i++)
	    copyf[i] = func[i];
	for (i = 0; i != sampleCount-sh; i++)
	    func[i] = func[i+sh];
	for (i = 0; i != sh; i++)
	    func[sampleCount-sh+i] = copyf[i];
	func[sampleCount] = func[0];
	transform();
    }

    void doBlank() {
	int x;
	for (x = 0; x <= sampleCount; x++)
	    func[x] = 0;
	for (x = 0; x != termBar.getValue(); x++)
	    mutes[x] = solos[x] = false;
	transform();
    }
    
    void doResample() {
	int x, i;
	if (resampleCount == 0)
	    resampleCount = 32;
	if (resampleCount == sampleCount)
	    return;
	for (x = 0; x != sampleCount; x += resampleCount) {
	    for (i = 1; i != resampleCount; i++)
		func[x+i] = func[x];
	}
	func[sampleCount] = func[0];
	transform();
	resampleCount *= 2;
    }

    double origFunc[];
    void doQuantize() {
	int x;
	if (quantizeCount == 0) {
	    quantizeCount = 8;
	    origFunc = new double[sampleCount];
	    System.arraycopy(func, 0, origFunc, 0, sampleCount);
	}
	for (x = 0; x != sampleCount; x++) {
	    func[x] = Math.round(origFunc[x]*quantizeCount)/
		(double) quantizeCount;
	}
	func[sampleCount] = func[0];
	transform();
	quantizeCount /= 2;
    }
    
    void doClip() {
	int x;
	double mult = 1.2;
	for (x = 0; x != sampleCount; x++) {
	    func[x] *= mult;
	    if (func[x] > 1)
		func[x] = 1;
	    if (func[x] < -1)
		func[x] = -1;
	}
	func[sampleCount] = func[0];
	transform();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton blankButton;
    private javax.swing.JButton clipButton;
    private javax.swing.JButton cosineButton;
    private javax.swing.JScrollBar freqBar;
    private javax.swing.JButton fullRectButton;
    private javax.swing.JButton highPassButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox magPhaseCheck;
    private javax.swing.JButton noiseButton;
    private javax.swing.JButton phaseButton;
    private javax.swing.JButton quantizeButton;
    private javax.swing.JButton rectButton;
    private javax.swing.JButton resampleButton;
    private javax.swing.JButton sawtoothButton;
    private javax.swing.JButton sineButton;
    private javax.swing.JCheckBox soundCheck;
    private javax.swing.JButton squareButton;
    private javax.swing.JScrollBar termBar;
    private javax.swing.JButton triangleButton;
    // End of variables declaration//GEN-END:variables

    public JScrollBar getTermBar() {
        return termBar;
    }

    public JCheckBox getSoundCheck() {
        return soundCheck;
    }

    void updateSound() {
	if (playThread != null)
	    playThread.soundChanged();
    }
    
    void handleResize() {
        Dimension d = winSize = cv.getSize();
	if (winSize.width == 0)
	    return;
	dbimage = cv.createImage(d.width, d.height);
	int margin = 20;
	int pheight = (d.height-margin*2)/3;
	viewFunc = new View(0, 0, d.width, pheight);
	int y = pheight + margin*2;
	viewMag = new View(0, y, d.width, pheight);
	if (magPhaseCheck.isSelected()) {
	    viewMag.ymult *= 1.6;
	    viewMag.midy += (int) viewMag.ymult/2;
//	    logCheck.enable();
	} else {
//	    logCheck.disable();
//	    logCheck.setState(false);
	}
	y += pheight;
	viewPhase = new View(0, y, d.width, pheight);
	int pmy = viewPhase.midy + (int) viewPhase.ymult + 10;
	int h = (d.height-pmy)/2;
	//System.out.println("height " + h);
	viewMutes = new View(0, pmy, d.width, h);
	viewSolos = new View(0, pmy+h, d.width, h);
	//System.out.println(viewMutes + " " + viewSolos + " " +d.height);
    }
    
    FourierCanvas cv;
    int selectedCoef;
    int maxTerms = 160;
    public double magcoef[];
    public double phasecoef[];
    public boolean mutes[], solos[];
    double func[];
    Random random;
    FFT fft;
    NumberFormat showFormat;
    
    public void init() {
	selectedCoef = -1;
	magcoef = new double[maxTerms];
	phasecoef = new double[maxTerms];
	mutes = new boolean[maxTerms];
	solos = new boolean[maxTerms];
	func = new double[sampleCount+1];
	random = new Random();
	fft = new FFT(sampleCount);
	
	cv = new FourierCanvas(this);
	cv.addComponentListener(this);
	cv.addMouseMotionListener(this);
	cv.addMouseListener(this);
	jPanel1.add(cv);
    
	//main.add(new Label("http://www.falstad.com"));
	cv.setBackground(Color.black);
	cv.setForeground(Color.lightGray);
	showFormat = DecimalFormat.getInstance();
	showFormat.setMaximumFractionDigits(5);

	doSawtooth();
	
        setSize(800, 640);
        handleResize();
        Dimension x = getSize();
        Dimension screen = getToolkit().getScreenSize(); //Obtiene el tamaño de la pantalla
        setLocation((screen.width  - x.width)/2,
                    (screen.height - x.height)/2);
    }
    
    public int dfreq0;
    public final int playSampleCount = 16384;
    public double getFreq() {
	// Obtiene la frecuencia aproximada desde el slider (Escala Logaritmica)
	double freq = 27.5*Math.exp(freqBar.getValue()*.004158883084*2);
	// Obtiene desplazamineto del array de FFT para la frecuencia dada (as close as possible;
	// it can't be exact because we use an FFT to generate the wave, and so the
	// frequency choices must be integer multiples of a base frequency)
	dfreq0 = ((int)(freq*(double) playSampleCount/rate))*2;
	// get exact frequency being played
	return rate*dfreq0/(playSampleCount*2.);
    }
    
    void centerString(Graphics g, String s, int y) {
	FontMetrics fm = g.getFontMetrics();
        g.drawString(s, (winSize.width-fm.stringWidth(s))/2, y);
    }
    
    double showMag(int n) {
	double m = magcoef[n];
	if (n == 0)
	    return m;
	m = Math.log(m)/6.+1;
	//System.out.println(magcoef[i] + " " + m);
	return (m < 0) ? 0 : m;
    }
    
    public static final int halfSampleCount = sampleCount/2;
    Image dbimage;
    public static final double pi = 3.14159265358979323846;
    static final double step = 2 * pi / sampleCount;
    public final int rate = 22050;
    boolean freqAdjusted;
    public boolean hasSolo;
    
    public void updateFourier(Graphics realg) {
	if (winSize == null || winSize.width == 0 || dbimage == null)
	    return;
	Graphics g = dbimage.getGraphics();
	Color gray1 = new Color(76,  76,  76);
	Color gray2 = new Color(127, 127, 127);
	g.setColor(cv.getBackground());
	g.fillRect(0, 0, winSize.width, winSize.height);
	g.setColor(cv.getForeground());
	int i;
	int ox = -1, oy = -1;
	int midy = viewFunc.midy;
	int periodWidth = viewFunc.periodWidth;
	double ymult = viewFunc.ymult;
	for (i = -1; i <= 1; i++) {
	    g.setColor((i == 0) ? gray2 : gray1);
	    g.drawLine(0,             midy+(i*(int) ymult),
		       winSize.width, midy+(i*(int) ymult));
	}
	for (i = 2; i <= 4; i++) {
	    g.setColor((i == 3) ? gray2 : gray1);
	    g.drawLine(periodWidth*i/2, midy-(int) ymult,
		       periodWidth*i/2, midy+(int) ymult);
	}
	g.setColor(Color.white);
	if (!(dragging && selection != SEL_FUNC)) {
	    for (i = 0; i != sampleCount+1; i++) {
		int x = periodWidth * i / sampleCount;
		int y = midy - (int) (ymult * func[i]);
		if (ox != -1) {
		    g.drawLine(ox, oy, x, y);
		    g.drawLine(ox+periodWidth, oy,   x+periodWidth,   y);
		    g.drawLine(ox+periodWidth*2, oy, x+periodWidth*2, y);
		}
		ox = x;
		oy = y;
	    }
	}
	int terms = termBar.getValue();
	if (!(dragging && selection == SEL_FUNC)) {
	    g.setColor(Color.red);
	    ox = -1;
	    for (i = 0; i != sampleCount+1; i++) {
		int x = periodWidth * i / sampleCount;
		int j;
		double dy = 0;
		for (j = 0; j != terms; j++) {
		    dy += magcoef[j] * Math.cos(
                        step*(i-halfSampleCount)*j+phasecoef[j]);
		}
		int y = midy - (int) (ymult * dy);
		if (ox != -1) {
		    g.drawLine(ox, oy, x, y);
		    g.drawLine(ox+periodWidth, oy,   x+periodWidth,   y);
		    g.drawLine(ox+periodWidth*2, oy, x+periodWidth*2, y);
		}
		ox = x;
		oy = y;
	    }
	}
	int texty = viewFunc.height+10;
	if (selectedCoef != -1) {
	    g.setColor(Color.yellow);
	    ox = -1;
	    double phase = phasecoef[selectedCoef];
	    int x;
	    double n = selectedCoef*2*pi/periodWidth;
	    int dx = periodWidth/2;
	    double mag = magcoef[selectedCoef];
	    if (!magPhaseCheck.isSelected()) {
		if (selection == SEL_MAG) {
		    mag *= -Math.sin(phase);
		    phase = -pi/2;
		} else {
		    mag *= Math.cos(phase);
		    phase = 0;
		}
	    }
	    ymult *= mag;
	    if (!dragging) {
		for (i = 0; i != sampleCount+1; i++) {
		    x = periodWidth * i / sampleCount;
		    double dy = Math.cos(
			    step*(i-halfSampleCount)*selectedCoef+phase);
		    int y = midy - (int) (ymult * dy);
		    if (ox != -1) {
			g.drawLine(ox, oy, x, y);
			g.drawLine(ox+periodWidth, oy,   x+periodWidth,   y);
			g.drawLine(ox+periodWidth*2, oy, x+periodWidth*2, y);
		    }
		    ox = x;
		    oy = y;
		}
	    }
	    if (selectedCoef > 0) {
		int f = (int) (getFreq() * selectedCoef);
		centerString(g, f +
			     ((f > rate/2) ? " Hz (Filtrado)" : " Hz"),
			     texty);
	    }
	    if (selectedCoef != -1) {
		String harm;
		if (selectedCoef == 0)
		    harm = showFormat.format(mag) + "";
		else {
		    String funcion = "coseno";
		    if (!magPhaseCheck.isSelected() && selection == SEL_MAG)
			funcion = "seno";
		    if (selectedCoef == 1)
			harm = showFormat.format(mag) + " " + funcion + "(x";
		    else
			harm = showFormat.format(mag) +
			    " " + funcion + "(" + selectedCoef + "x";
		    if (!magPhaseCheck.isSelected() || phase == 0)
			harm += ")";
		    else {
			harm += (phase < 0) ? " - " : " + ";
			harm += showFormat.format(Math.abs(phase)) + ")";
		    }
//		    if (logCheck.getState()) {
//			showFormat.setMaximumFractionDigits(2);
//			harm += "   (" +
//			    showFormat.format(20*Math.log(mag)/Math.log(10)) +
//			    " dB)";
//			showFormat.setMaximumFractionDigits(5);
//		    }
		}
		centerString(g, harm, texty+15);
	    }
        }
	if (selectedCoef == -1 && freqAdjusted) {
	    int f = (int) getFreq();
	    g.setColor(Color.yellow);
	    centerString(g, f + " Hz", texty);
	}
	freqAdjusted = false;
	int termWidth = getTermWidth();
	
	ymult = viewMag.ymult;
	midy = viewMag.midy;
	g.setColor(Color.white);
	if (magPhaseCheck.isSelected()) {
	    centerString(g, "Magnitudes", viewMag.labely);
	    centerString(g, "Fases", viewPhase.labely);
	    g.setColor(gray2);
	    g.drawLine(0, midy, winSize.width, midy);
	    g.setColor(gray1);
	    g.drawLine(0, midy-(int)ymult, winSize.width, midy-(int) ymult);
	    int dotSize = termWidth-3;
	    for (i = 0; i != terms; i++) {
		int t = termWidth * i + termWidth/2;
		int y = midy - (int) (showMag(i)*ymult);
		g.setColor(i == selectedCoef ? Color.yellow : Color.white);
		g.drawLine(t, midy, t, y);
		g.fillOval(t-dotSize/2, y-dotSize/2, dotSize, dotSize);
	    }
	    
	    ymult = viewPhase.ymult;
	    midy = viewPhase.midy;
	    for (i = -2; i <= 2; i++) {
		g.setColor((i == 0) ? gray2 : gray1);
		g.drawLine(0,             midy+(i*(int) ymult)/2,
			   winSize.width, midy+(i*(int) ymult)/2);
	    }
	    ymult /= pi;
	    for (i = 0; i != terms; i++) {
		int t = termWidth * i + termWidth/2;
		int y = midy - (int) (phasecoef[i]*ymult);
		g.setColor(i == selectedCoef ? Color.yellow : Color.white);
		g.drawLine(t, midy, t, y);
		g.fillOval(t-dotSize/2, y-dotSize/2, dotSize, dotSize);
	    }
	} else {
	    centerString(g, "Senos", viewMag.labely);
	    centerString(g, "Cosenos", viewPhase.labely);
	    g.setColor(gray2);
	    g.drawLine(0, midy, winSize.width, midy);
	    g.setColor(gray1);
	    g.drawLine(0, midy-(int)ymult, winSize.width, midy-(int) ymult);
	    g.drawLine(0, midy+(int)ymult, winSize.width, midy+(int) ymult);
	    int dotSize = termWidth-3;
	    for (i = 1; i != terms; i++) {
		int t = termWidth * i + termWidth/2;
		int y = midy + (int) (magcoef[i]*Math.sin(phasecoef[i])*ymult);
		g.setColor(i == selectedCoef ? Color.yellow : Color.white);
		g.drawLine(t, midy, t, y);
		g.fillOval(t-dotSize/2, y-dotSize/2, dotSize, dotSize);
	    }
	    
	    ymult = viewPhase.ymult;
	    midy = viewPhase.midy;
	    for (i = -2; i <= 2; i += 2) {
		g.setColor((i == 0) ? gray2 : gray1);
		g.drawLine(0,             midy+(i*(int) ymult)/2,
			   winSize.width, midy+(i*(int) ymult)/2);
	    }
	    for (i = 0; i != terms; i++) {
		int t = termWidth * i + termWidth/2;
		int y = midy - (int) (magcoef[i]*Math.cos(phasecoef[i])*ymult);
		g.setColor(i == selectedCoef ? Color.yellow : Color.white);
		g.drawLine(t, midy, t, y);
		g.fillOval(t-dotSize/2, y-dotSize/2, dotSize, dotSize);
	    }
	}
	double basef = getFreq();
	if (viewMutes.height > 8) {
	    Font f = new Font("SansSerif", 0, viewMutes.height);
	    g.setFont(f);
	    FontMetrics fm = g.getFontMetrics();
	    for (i = 1; i != terms; i++) {
		if (basef*i > rate/2)
		    break;
		int t = termWidth * i + termWidth/2;
		int y = viewMutes.y + fm.getAscent();
		g.setColor(i == selectedCoef ? Color.yellow : Color.white);
		if (hasSolo && !solos[i])
		    g.setColor(Color.gray);
		String pm = "-";
		if (mutes[i])
		    pm = "M";
		int w = fm.stringWidth(pm);
		g.drawString(pm, t-w/2, y);
		y = viewSolos.y + fm.getAscent();
		pm = "-";
		if (solos[i])
		    pm = "S";
		w = fm.stringWidth(pm);
		g.drawString(pm, t-w/2, y);
	    }
	}
	realg.drawImage(dbimage, 0, 0, this);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        handleResize();
	cv.repaint(100); //100ms maximos antes de repaint
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
        cv.repaint();
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }

    double getMagValue(double m) {
	//if (!logCheck.getState())
	    return m;
//	if (m == 0)
//	    return 0;
//	return Math.exp(6*(m-1));
    }
    
    void editMag(int x, int y) {
	if (selectedCoef == -1)
	    return;
	double ymult = viewMag.ymult;
	double midy = viewMag.midy;
	double coef = -(y-midy) / ymult;
	if (magPhaseCheck.isSelected()) {
	    if (selectedCoef > 0) {
		if (coef < 0)
		    coef = 0;
		coef = getMagValue(coef);
	    } else if (coef < -1)
		coef = -1;
	    if (coef > 1)
		coef = 1;
	    if (magcoef[selectedCoef] == coef)
		return;
	    magcoef[selectedCoef] = coef;
	} else {
	    int c = selectedCoef;
	    if (c == 0)
		return;
	    double m2 =  magcoef[c]*Math.cos(phasecoef[c]);
	    if (coef > 1)  coef = 1;
	    if (coef < -1) coef = -1;
	    double m1 = coef;
	    magcoef[c] = Math.sqrt(m1*m1+m2*m2);
	    phasecoef[c] = Math.atan2(-m1, m2);
	}
	updateSound();
	cv.repaint();
    }

    void editFunc(int x, int y) {
	if (dragX == x) {
	    editFuncPoint(x, y);
	    dragY = y;
	} else {
	    // need to draw a line from old x,y to new x,y and
	    // call editFuncPoint for each point on that line.  yuck.
	    int x1 = (x < dragX) ? x : dragX;
	    int y1 = (x < dragX) ? y : dragY;
	    int x2 = (x > dragX) ? x : dragX;
	    int y2 = (x > dragX) ? y : dragY;
	    dragX = x;
	    dragY = y;
	    for (x = x1; x <= x2; x++) {
		y = y1+(y2-y1)*(x-x1)/(x2-x1);
		editFuncPoint(x, y);
	    }
	}
    }
    
    void editFuncPoint(int x, int y) {
	int midy = viewFunc.midy;
	int periodWidth = viewFunc.periodWidth;
	double ymult = viewFunc.ymult;
	int lox = (x % periodWidth) * sampleCount / periodWidth;
	int hix = (((x % periodWidth)+1) * sampleCount / periodWidth)-1;
	double val = (midy - y) / ymult;
	if (val > 1)
	    val = 1;
	if (val < -1)
	    val = -1;
	for (; lox <= hix; lox++)
	    func[lox] = val;
	func[sampleCount] = func[0];
	cv.repaint();
    }

    void editPhase(int x, int y) {
	if (selectedCoef == -1)
	    return;
	double ymult = viewPhase.ymult;
	double midy = viewPhase.midy;
	double coef = -(y-midy) / ymult;
	if (magPhaseCheck.isSelected()) {
	    coef *= pi;
	    if (coef < -pi)
		coef = -pi;
	    if (coef > pi)
		coef = pi;
	    if (phasecoef[selectedCoef] == coef)
		return;
	    phasecoef[selectedCoef] = coef;
	} else {
	    int c = selectedCoef;
	    double m1 = -magcoef[c]*Math.sin(phasecoef[c]);
	    if (coef > 1)  coef = 1;
	    if (coef < -1) coef = -1;
	    double m2 = coef;
	    magcoef[c] = Math.sqrt(m1*m1+m2*m2);
	    phasecoef[c] = Math.atan2(-m1, m2);
	    updateSound();
	}
	cv.repaint();
    }

    void editMutes(MouseEvent e, int x, int y) {
	if (e.getID() != MouseEvent.MOUSE_PRESSED)
	    return;
	if (selectedCoef == -1)
	    return;
	mutes[selectedCoef] = !mutes[selectedCoef];
	cv.repaint();
    }
    
    void editSolos(MouseEvent e, int x, int y) {
	if (e.getID() != MouseEvent.MOUSE_PRESSED)
	    return;
	if (selectedCoef == -1)
	    return;
	solos[selectedCoef] = !solos[selectedCoef];
	int terms = termBar.getValue();
	hasSolo = false;
	int i;
	for (i = 0; i != terms; i++)
	    if (solos[i]) {
		hasSolo = true;
		break;
	    }
	cv.repaint();
    }
    
    int selection;
    static final int SEL_MUTES = 4;
    static final int SEL_SOLOS = 5;
    static final int SEL_MAG = 2;
    boolean dragging;
    static final int SEL_FUNC = 1;
    View viewFunc;
    int dragX, dragY;
    static final int SEL_PHASE = 3;
    View viewMag, viewPhase, viewMutes, viewSolos;
    Dimension winSize;
    static final int SEL_NONE = 0;
    int quantizeCount, resampleCount;
    
    void edit(MouseEvent e) {
	if (selection == SEL_NONE)
	    return;
	int x = e.getX();
	int y = e.getY();
	switch (selection) {
	case SEL_MAG:       editMag(x, y); break;
	case SEL_FUNC:      editFunc(x, y); break;
	case SEL_PHASE:     editPhase(x, y); break;
	case SEL_MUTES:     editMutes(e, x, y); break;
	case SEL_SOLOS:     editSolos(e, x, y); break;
	}
	quantizeCount = resampleCount = 0;
    }
    
    int getTermWidth() {
	int terms = termBar.getValue();
	int termWidth = winSize.width / terms;
	int maxTermWidth = winSize.width/30;
	if (termWidth > maxTermWidth)
	    termWidth = maxTermWidth;
	if (termWidth > 12)
	    termWidth = 12;
	termWidth &= ~1;
	return termWidth;
    }
    
    void doSetFunc() {
	int i;
	double data[] = new double[sampleCount*2];
	int terms = termBar.getValue();
	for (i = 0; i != terms; i++) {
	    int sgn = (i & 1) == 1 ? -1 : 1;
	    data[i*2]   =  sgn*magcoef[i]*Math.cos(phasecoef[i]);
	    data[i*2+1] = -sgn*magcoef[i]*Math.sin(phasecoef[i]);
	}
	fft.transform(data, true);
	for (i = 0; i != sampleCount; i++)
	    func[i] = data[i*2];
	func[sampleCount] = func[0];
	updateSound();
    }
    
    void transform() {
	int x, y;
	double data[] = new double[sampleCount*2];
	int i;
	for (i = 0; i != sampleCount; i++)
	    data[i*2] = func[i];
	fft.transform(data, false);
	double epsilon = .00001;
	double mult = 2./sampleCount;
	for (y = 0; y != maxTerms; y++) {
	    double acoef =  data[y*2  ]*mult;
	    double bcoef = -data[y*2+1]*mult;
	    if ((y & 1) == 1)
		acoef = -acoef;
	    else
		bcoef = -bcoef;
	    //System.out.println(y + " " + acoef + " " + bcoef);
	    if (acoef < epsilon && acoef > -epsilon) acoef = 0;
	    if (bcoef < epsilon && bcoef > -epsilon) bcoef = 0;
	    if (y == 0) {
		magcoef[0] = acoef / 2;
		phasecoef[0] = 0;
	    } else {
		magcoef[y] = Math.sqrt(acoef*acoef+bcoef*bcoef);
		phasecoef[y] = Math.atan2(-bcoef, acoef);
	    }
	    // System.out.print("phasecoef " + phasecoef[y] + "\n");
	}
	updateSound();
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        dragging = true;
	edit(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
	int y = e.getY();
	dragX = x;
        dragY = y;
	int oldCoef = selectedCoef;
	selectedCoef = -1;
	selection = 0;
	int oldsel = selection;
	if (viewFunc.contains(x, y))
	    selection = SEL_FUNC;
	else {
	    int termWidth = getTermWidth();
	    selectedCoef = x/termWidth;
	    if (selectedCoef > termBar.getValue())
		selectedCoef = -1;
	    if (selectedCoef != -1) {
		if (viewMag.contains(x, y))
		    selection = SEL_MAG;
		else if (viewMutes.contains(x, y))
		    selection = SEL_MUTES;
		else if (viewSolos.contains(x, y))
		    selection = SEL_SOLOS;
		else if (viewPhase.contains(x, y))
		    selection = SEL_PHASE;
	    }
	}
	if (selectedCoef != oldCoef || oldsel != selection)
	    cv.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2 && selectedCoef != -1 &&
	    selection != SEL_MUTES && selection != SEL_SOLOS) {
	    int i;
	    for (i = 0; i != termBar.getValue(); i++) {
		phasecoef[i] = 0;
		if (selectedCoef != i)
		    magcoef[i] = 0;
	    }
	    magcoef[selectedCoef] = 1;
	    if (!magPhaseCheck.isSelected())
		phasecoef[selectedCoef] = (selection == SEL_MAG) ? -pi/2 : 0;
	    doSetFunc();
	    cv.repaint();
	}
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseMoved(e);
	if ((e.getModifiers() & MouseEvent.BUTTON3_MASK) != 0 &&
	    selectedCoef != -1) {
	    termBar.setValue(selectedCoef+1);
	    cv.repaint();
	}
	if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) == 0)
	    return;
	dragging = true;
	edit(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) == 0)
	    return;
	dragging = false;
	if (selection == SEL_FUNC)
	    transform();
	else if (selection != SEL_NONE)
	    doSetFunc();
	cv.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
