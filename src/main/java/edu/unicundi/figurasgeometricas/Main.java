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
        VistaFiguras figuras = new VistaFiguras();
        figuras.setVisible(true);

        Cuadrado cuadrado = new Cuadrado("-1,3", "2,3", "2,1", "-1,3");
        cuadrado.separarCoordenadas();
        cuadrado.hallarArea();
        cuadrado.hallarPerimetro();
        cuadrado.imprimirInfo();

        Rectangulo rectangulo = new Rectangulo("-1,3", "2,3", "2,1", "-1,3");
        rectangulo.separarCoordenadas();
        rectangulo.hallarArea();
        rectangulo.hallarPerimetro();
        rectangulo.imprimirInfo();

    }
}
