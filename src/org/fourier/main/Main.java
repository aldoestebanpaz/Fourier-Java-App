/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fourier.main;

import org.fourier.view.Fourier;

/**
 *
 * @author ViPeR
 */
public class Main {
    public static void main(String args[]){
        Fourier fourier = new Fourier();
        fourier.init();
        System.out.println("Comenzando...");
        fourier.setVisible(true);
        System.out.println("Aplicación inicializada...");
        fourier.setVisible(true);
    }
}
