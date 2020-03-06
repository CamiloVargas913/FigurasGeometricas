/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para manejar los metodos de las figuras geometricas
 *
 * @author Camilo Vargas
 */
public abstract class FiguraGeometrica implements IOperaciones {

    /**
     * Variable para almacenar el valor del lado 1
     */
    private double lado1;
    /**
     * Variable para almacenar el valor del lado 1 de la figura
     */
    private double lado2;
    /**
     * Variable para almacenar el valor del lado 1 de la figura
     */
    private double lado3;
    /**
     * Variable para almacenar el valor del area de la figura
     */
    private double area;
    /**
     * Variable para almacenar el valor del perimetro de la figura
     */

    private double perimetro;
    /**
     * Variable para almacenar el valor de la coordenada 1 de la figura
     */
    private String coorde1;
    /**
     * Variable para almacenar el valor de la coordenada 2 de la figura
     */
    private String coorde2;
    /**
     * Variable para almacenar el valor de la coordenada 3 de la figura
     */
    private String coorde3;

    /**
     * Variable para almacenar el valor del mensaje de la informacion de la
     * figura
     */
    private String mensaje;

    /**
     * Variable para almacenar el valor de las coordenadas en x y y de la figura
     */
    private int coordenadas[][] = new int[3][3];
    /**
     * Variable para almacenar el valor de las coordenadas en x de la figura
     */
    private int coordx[] = new int[4];
    /**
     * Variable para almacenar el valor de las coordenadas en y de la figura
     */
    private int coordy[] = new int[4];
    /**
     * Variable para almacenar el valor del color de la figura
     */
    private Color colores;

    /**
     * Contructor de la clase
     *
     * @param coorde1 almacena el valor de la coordenada1
     * @param coorde2 almacena el valor de la coordenada2
     * @param coorde3 almacena el valor de la coordenada3
     */
    public FiguraGeometrica(String coorde1, String coorde2, String coorde3) {
        this.coorde1 = coorde1;
        this.coorde2 = coorde2;
        this.coorde3 = coorde3;
        this.colores = new Color(0, 0, 0);

    }

    /**
     * Metodo para imprimir la informacion de area y el perimetro del triangulo
     */
    public void imprimirInfo() {
        mensaje = "Su Perimetro es: " + getPerimetro() + " Su Area es: " + getArea();
    }

    /**
     * Metodo para obtener las coordenadas del eje x
     *
     * @return coordx
     */
    public int[] getCoordx() {
        return coordx;
    }

    /**
     * Metodo para establecer el valor de las coordenadas del eje x
     *
     * @param coordx Almacena el valor de las coordenadas en x
     */
    public void setCoordx(int[] coordx) {
        this.coordx = coordx;
    }

    /**
     * Metodo para obtener las coordenadas del eje y
     *
     * @return coordy
     */
    public int[] getCoordy() {
        return coordy;
    }

    /**
     * Metodo para establecer el valor de las coordenadas del eje y
     *
     * @param coordy Almacena el valor de las coordenadas en y
     */
    public void setCoordy(int[] coordy) {
        this.coordy = coordy;
    }

    /**
     * Metodo para obetener el valor del lado 3
     *
     * @return lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Metodo para establecer el valor del lado 3
     *
     * @param lado3 almacena el valor del lado 3
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Metodo para obtener el valor del mensaje
     *
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Metodo para establecer el valor del mensaje
     *
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Metodo para obtener las coordenadas en x y y de la figura
     *
     * @return coordenadas
     */
    public int[][] getCoordenadas() {
        return coordenadas;
    }

    /**
     * Metodo para establecer el valor las coordenadas de la figura
     *
     * @param coordenadas Almacena el valor de las coordenadas en x y y
     */
    public void setCoordenadas(int[][] coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Metodo para obtener el lado1 de la figura
     *
     * @return lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Metodo para establecer el valor del lado1 de la figura
     *
     * @param lado1 almacena el valor del lado1
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Metodo para obtener el area de la figura
     *
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * Metodo para obtener el lado2 de la figura
     *
     * @return lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Metodo para establecer el valor del lado2 de la figura
     *
     * @param lado2 almacena el valor del lado2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Metodo para establecer el valor del area de la figura
     *
     * @param area almacena el valor del area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Metodo para obtener el perimetro de la figura
     *
     * @return mensajeArea
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Metodo para establecer el valor del perimetro de la figura
     *
     * @param perimetro
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * Metodo para obtener el valor del color
     *
     * @return colores
     */
    public Color getColores() {
        return colores;
    }

    /**
     * Metodo para establecer el valor del color
     *
     * @param colores
     */
    public void setColores(Color colores) {
        this.colores = colores;
    }

    /**
     * Metodo para obtener la coordenada1 de la figura
     *
     * @return mensajeArea
     */
    public String getCoorde1() {
        return coorde1;
    }

    /**
     * Metodo para establecer el valor la coordenada 1 de la figura
     *
     * @param coorde1 almacena el valor de la coordenada1
     */
    public void setCoorde1(String coorde1) {
        this.coorde1 = coorde1;
    }

    /**
     * Metodo para obtener la coordenada2 de la figura
     *
     * @return mensajeArea
     */
    public String getCoorde2() {
        return coorde2;
    }

    /**
     * Metodo para establecer el valor la coordenada 2 de la figura
     *
     * @param coorde2 almacena el valor de la coordenada2
     */
    public void setCoorde2(String coorde2) {
        this.coorde2 = coorde2;
    }

    /**
     * Metodo para obtener la coordenada3 de la figura
     *
     * @return mensajeArea
     */
    public String getCoorde3() {
        return coorde3;
    }

    /**
     * Metodo para establecer el valor la coordenada 3 de la figura
     *
     * @param coorde3 almacena el valor de la coordenada1
     */
    public void setCoorde3(String coorde3) {
        this.coorde3 = coorde3;
    }

}
