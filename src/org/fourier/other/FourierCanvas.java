/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fourier.other;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import org.fourier.view.Fourier;

/**
 *
 * @author ViPeR
 */
public class FourierCanvas extends Canvas {
    
    Fourier pg;
    
    public FourierCanvas(Fourier p) {
	pg = p;
    }
    
    @Override
    public Dimension getPreferredSize() {
	return new Dimension(300,400);
    }
    
    @Override
    public void update(Graphics g) {
	pg.updateFourier(g);
    }
    
    @Override
    public void paint(Graphics g) {
	pg.updateFourier(g);
    }
};
