/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author David Márquez Clase para manejar los metodos del cuadrado y extiende
 * de la clase Cuadrilateros
 */
public class Cuadrado extends Cuadrilateros {

    /**
     * Constructor principal de la clase
     *
     * @param coorde1 Almacena la coordenada 1
     * @param coorde2 Almacena la coordenada 2
     * @param coorde3 Almacena la coordenada 3
     * @param coorde4 Almacena la coordenada 4
     */
    public Cuadrado(String coorde1, String coorde2, String coorde3, String coorde4) {
        super(coorde1, coorde2, coorde3, coorde4);

    }

    /**
     * Metodo para imprimir la informacion de area y perimetro del cuadrado
     */
    @Override
    public void imprimirInfo() {
        if (separarCoordenadas() == true && getLado1() == getLado2()) {
            setMensajePerimetro("Perimetro " + getPerimetro());
            setMensajeArea("Area " + getArea());
        }else{
           setMensaje("No es un cuadrado");
        }

    }

}
