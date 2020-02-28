/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author David Márquez Clase para manejar los metodos del rectangulo y
 * extiende de la clase padre Cuadrilateros
 */
public class Rectangulo extends Cuadrilateros {

    /**
     * Constructor principal de la clase
     *
     * @param coorde1 almacena la coordenada 1
     * @param coorde2 almacena la coordenada 2
     * @param coorde3 almacena la coordenada 3
     * @param coorde4 almacena la coordenada 4
     */
    public Rectangulo(String coorde1, String coorde2, String coorde3, String coorde4) {
        super(coorde1, coorde2, coorde3, coorde4);
    }

    /**
     * Metodo para imprimir la informacion de area y el perimetro del rectangulo
     */
    @Override
    public void imprimirInfo() {
        if (separarCoordenadas() == true && getLado1() != getLado2()) {
            setMensajePerimetro("Perimetro " + getPerimetro());
            setMensajeArea("Area " + getArea());
        } else {
            setMensaje("No es un rectangulo");
        }
    }

    /**
     * Metodo para hallar el perimetro del rectangulo
     */
    @Override
    public void hallarPerimetro() {
        setPerimetro((getLado2() * 2) + (getLado1() * 2));
    }

}
