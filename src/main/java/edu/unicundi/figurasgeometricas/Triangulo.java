/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Márquez Clase para manejar los metodos del triangulo y extiende
 * de la clase padre FigurasGeometricas
 */
public class Triangulo extends FiguraGeometrica {

    /**
     * Variable para guardar el semiperimetro
     */
    private double semiperimetro;
    private String tipo;

    /**
     * Constructor del metodo
     *
     * @param coorde1 almacena la coordenada 1
     * @param coorde2 almacena la coordenada 2
     * @param coorde3 almacena la coordenada 3
     */
    public Triangulo(String coorde1, String coorde2, String coorde3) {
        super(coorde1, coorde2, coorde3);
    }

    /**
     * Metodo para validar que tipo de triangulo es (escaleno, isosceles,
     * equilatero)
     */
    public void validarTipoTriangulo() {

        if (separarCoordenadas() == true) {
            if (getLado1() == getLado2() && getLado2() == getLado3() && getLado3() == getLado1()) {
                this.tipo = "Es equilatero";
            } else if (getLado1() == getLado2() && getLado2() != getLado3()
                    || getLado1() == getLado3() && getLado3() != getLado2()
                    || getLado2() == getLado3() && getLado3() != getLado1()) {
                this.tipo = "Es isosceles";
            } else {
                this.tipo = "Es escaleno";
            }
        }

    }

    /**
     * Metodo para imprimir la informacion del triangulo
     */
    @Override
    public void imprimirInfo() {
        setMensaje("Su Perimetro es: " + String.format("%.2f",getPerimetro()) + " Su Area es: " + String.format("%.2f",getArea()) + " Tipo: " + this.tipo);
    }

    /**
     * Metodo para hallar el perimetro del triangulo
     */
    @Override
    public void hallarPerimetro() {
        setPerimetro(getLado1() + getLado2() + getLado3());
    }

    /**
     * Metodo para hallar el area del triangulo por la formula de Heron
     */
    @Override
    public void hallarArea() {
        this.semiperimetro = getPerimetro() / 2;
        setArea(Math.sqrt(this.semiperimetro * (this.semiperimetro - getLado1()) * (this.semiperimetro - getLado2()) * (this.semiperimetro - getLado3())));
    }

    /**
     * Metodo para convertir las coordenadas cartesianas y se ajusten al plano
     * dibujado
     */
    @Override
    public void convertirCoordenadasPlano() {
        for (int i = 0; i < getCoordenadas().length; i++) {
            if (this.getCoordenadas()[0][i] >= 0) {
                this.getCoordenadas()[0][i] = ((this.getCoordenadas()[0][i] * 10) + 250);
            } else {
                this.getCoordenadas()[0][i] = (250 + (this.getCoordenadas()[0][i] * 10));
            }

            if (this.getCoordenadas()[1][i] < 0) {
                this.getCoordenadas()[1][i] = (250 + (Math.abs(this.getCoordenadas()[1][i] * 10)));
            } else {
                this.getCoordenadas()[1][i] = (250 - Math.abs(this.getCoordenadas()[1][i] * 10));
            }
        }

        getCoordx()[0] = this.getCoordenadas()[0][0];
        getCoordx()[1] = this.getCoordenadas()[0][1];
        getCoordx()[2] = this.getCoordenadas()[0][2];

        getCoordy()[0] = this.getCoordenadas()[1][0];
        getCoordy()[1] = this.getCoordenadas()[1][1];
        getCoordy()[2] = this.getCoordenadas()[1][2];

        //setCoordx(getCoordx());
        //setCoordy(getCoordy());
    }

    /**
     * Metodo para validar las coordenadas cartesianas ingresadas
     *
     * @return boolean
     */
    @Override
    public boolean validarCoordenadas() {
        //validacion eje y
        int x1, x2, x3, y1, y2, y3;
        int sumay = 0, sumax = 0;
        x1 = this.getCoordenadas()[0][0] - this.getCoordenadas()[0][2];
        x2 = this.getCoordenadas()[0][0] - this.getCoordenadas()[0][1];
        x3 = this.getCoordenadas()[0][1] - this.getCoordenadas()[0][2];
        y1 = this.getCoordenadas()[1][2] - this.getCoordenadas()[1][0];
        y2 = this.getCoordenadas()[1][0] - this.getCoordenadas()[1][1];
        y3 = this.getCoordenadas()[1][1] - this.getCoordenadas()[1][2];

        setLado1(Math.sqrt(Math.abs(x1) * Math.abs(x1) + Math.abs(y1) * Math.abs(y1)));
        setLado2(Math.sqrt(Math.abs(x2) * Math.abs(x2) + Math.abs(y2) * Math.abs(y2)));
        setLado3(Math.sqrt(Math.abs(x3) * Math.abs(x3) + Math.abs(y3) * Math.abs(y3)));
        for (int i = 0; i < this.getCoordenadas().length; i++) {
            sumax += this.getCoordenadas()[0][i];
            sumay += this.getCoordenadas()[1][i];
        }
        if (sumax != sumay) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para separar las coordenadas y guardarlas en un array
     *
     * @return boolean
     */
    @Override
    public boolean separarCoordenadas() {
        if (getCoorde1().equals("") || getCoorde2().equals("") || getCoorde3().equals("")) {
            setMensaje("Las Coordenadas no pueden ser vacias");
        } else {
            String[] parte1 = getCoorde1().split(",");
            String[] parte2 = getCoorde2().split(",");
            String[] parte3 = getCoorde3().split(",");
            // coordenadas de x 
            this.getCoordenadas()[0][0] = Integer.parseInt(parte1[0]);
            this.getCoordenadas()[0][1] = Integer.parseInt(parte2[0]);
            this.getCoordenadas()[0][2] = Integer.parseInt(parte3[0]);
            // coordenadas de Y 
            this.getCoordenadas()[1][0] = Integer.parseInt(parte1[1]);
            this.getCoordenadas()[1][1] = Integer.parseInt(parte2[1]);
            this.getCoordenadas()[1][2] = Integer.parseInt(parte3[1]);
            return validarCoordenadas();
        }
        return false;
    }

}
