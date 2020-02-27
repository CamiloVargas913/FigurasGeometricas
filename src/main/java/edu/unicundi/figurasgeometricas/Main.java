/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author PROFESIONAL
 */
public class Main {
    public static void main(String[] args) {
//        VistaFiguras figuras = new VistaFiguras();
//        figuras.setVisible(true);

        Cuadrado cua = new Cuadrado();
        cua.separarCoordenadas("1,1", "0.5,1", "1,0.5", "0,0");
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.separarCoordenadas("1,1", "0.5,1", "1,0.5", "0,0");
       // System.out.println(cua.getMensaje());
    }
}
