/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author user
 */
public class Rectangulo extends Cuadrilateros {

    public Rectangulo(String coorde1, String coorde2, String coorde3, String coorde4) {
        super(coorde1, coorde2, coorde3, coorde4);
    }

    @Override
    public void imprimirInfo() {
        if (separarCoordenadas() == true && getLado1() != getLado2()) {
            System.out.println("Perimetro " + getPerimetro());
            System.out.println("Area " + getArea());
        } else {
            System.out.println("No es un rectangulo");
        }
    }

    @Override
    public void hallarPerimetro() {
        setPerimetro((getLado2() * 2) + (getLado1() * 2));
    }

}
