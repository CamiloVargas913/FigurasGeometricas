/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 * Clase para manejar los metodos de las figuras geometricas
 *
 * @author Camilo Vargas
 */
public class FiguraGeometrica {

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
     * Variable para almacenar el valor de la suma de las coordenadas del eje x
     * de la figura
     */
    private int sumax;
    /**
     * Variable para almacenar el valor de la suma de las coordenadas del eje y
     * de la figura
     */
    private int sumay;
    /**
     * Variable para almacenar el valor del color de la figura
     */
    private String color;
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
     * Variable para almacenar el valor del mensaje del area de la figura
     */
    private String mensajeArea;
    /**
     * Variable para almacenar el valor del mensaje de la informacion de la
     * figura
     */
    private String mensaje;
    /**
     * Variable para almacenar el valor del mensaje del perimetro de la figura
     */
    private String mensajePerimetro;
    /**
     * Variable para almacenar el valor de las coordenadas en x y y de la figura
     */
    private int coordenadas[][] = new int[3][3];
    /**
     * Variable para almacenar el valor de las coordenadas en x de la figura
     */
    private int coordx[];
    /**
     * Variable para almacenar el valor de las coordenadas en y de la figura
     */
    private int coordy[];

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
        this.mensaje = "";
        this.mensajeArea = "";
        this.mensajePerimetro = "";

    }

    /**
     * Metodo para hallar el area de la figura (cuadrado, rectangulo)
     */
    public void hallarArea() {
        this.area = lado1 * lado2;
    }

    /**
     * Metodo para hallar el perimetro de la figura (cuadrado)
     */
    public void hallarPerimetro() {
        this.perimetro = lado1 * 4;
    }

    /**
     * Metodo para imprimir la informacion del area y perimetro de la figura
     */
    public void imprimirInfo() {

        System.out.println("Perimetro " + getPerimetro());
        System.out.printf("Area: %.2f ", getArea());
    }

    /**
     * Metodo para separar las coordenadas de la figura y llenar el vector
     * coordenadas
     *
     * @return boolean
     */
    public boolean separarCoordenadas() {
        if (getCoorde1().equals("") || getCoorde2().equals("") || getCoorde3().equals("")) {
            setMensaje("Las Coordenadas no pueden ser vacias");
        } else {
            String[] parte1 = getCoorde1().split(",");
            String[] parte2 = getCoorde2().split(",");
            String[] parte3 = getCoorde3().split(",");
            // coordenadas de x 
            this.coordenadas[0][0] = Integer.parseInt(parte1[0]);
            this.coordenadas[0][1] = Integer.parseInt(parte2[0]);
            this.coordenadas[0][2] = Integer.parseInt(parte3[0]);
            // coordenadas de Y 
            this.coordenadas[1][0] = Integer.parseInt(parte1[1]);
            this.coordenadas[1][1] = Integer.parseInt(parte2[1]);
            this.coordenadas[1][2] = Integer.parseInt(parte3[1]);
            return validarCoordenadas();
        }
        return false;
    }

    /**
     * Metodo para validar un patron respecto a las coordenadas de la figura y
     * asi saber que tipo de figura es
     *
     * @return boolean
     */
    public boolean validarCoordenadas() {
        //validacion eje y
        int x1, x2, x3, y1, y2, y3;
        x1 = this.coordenadas[0][0] - this.coordenadas[0][2];
        x2 = this.coordenadas[0][0] - this.coordenadas[0][1];
        x3 = this.coordenadas[0][1] - this.coordenadas[0][2];
        y1 = this.coordenadas[1][2] - this.coordenadas[1][0];
        y2 = this.coordenadas[1][0] - this.coordenadas[1][1];
        y3 = this.coordenadas[1][1] - this.coordenadas[1][2];

        setLado1(Math.sqrt(Math.abs(x1) * Math.abs(x1) + Math.abs(y1) * Math.abs(y1)));
        setLado2(Math.sqrt(Math.abs(x2) * Math.abs(x2) + Math.abs(y2) * Math.abs(y2)));
        setLado3(Math.sqrt(Math.abs(x3) * Math.abs(x3) + Math.abs(y3) * Math.abs(y3)));
        for (int i = 0; i < this.coordenadas.length; i++) {
            sumax += this.coordenadas[0][i];
            sumay += this.coordenadas[1][i];
        }
        if (sumax != sumay) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para convertir las coordenadas para pintarlas en un plano
     * cartesiano en pixeles
     */
    public void convertirCoordenadasPlano() {
        //corde[1][3] = ;

        for (int i = 0; i < this.coordenadas.length; i++) {
            if (this.coordenadas[0][i] >= 0) {
                this.coordenadas[0][i] = ((this.coordenadas[0][i] * 10) + 250);
            } else {
                this.coordenadas[0][i] = (250 + (this.coordenadas[0][i] * 10));
            }

            if (this.coordenadas[1][i] < 0) {
                this.coordenadas[1][i] = (250 + (Math.abs(this.coordenadas[1][i] * 10)));
            } else {
                this.coordenadas[1][i] = (250 - Math.abs(this.coordenadas[1][i] * 10));
            }
        }

        this.coordx[0] = this.coordenadas[0][0];
        this.coordx[1] = this.coordenadas[0][1];
        this.coordx[2] = this.coordenadas[0][2];
        this.coordy[0] = this.coordenadas[1][0];
        this.coordy[1] = this.coordenadas[1][1];
        this.coordy[2] = this.coordenadas[1][2];

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
     * @param mensaje Almacena el valor del mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Metodo para obtener el mensaje del area de la figura
     *
     * @return mensajeArea
     */
    public String getMensajeArea() {
        return mensajeArea;
    }

    /**
     * Metodo para establecer el mensaje del area de la figura
     *
     * @param mensajeArea Almacena el valor del mensaje del area de la figura
     */
    public void setMensajeArea(String mensajeArea) {
        this.mensajeArea = mensajeArea;
    }

    /**
     * Metodo para obtener el mensaje del area de la figura
     *
     * @return mensajeArea
     */
    public String getMensajePerimetro() {
        return mensajePerimetro;
    }

    /**
     * Metodo para establecer el valor del mensaje del perimetro de la figura
     *
     * @param mensajePerimetro Almcacena el valor del mensaje del perimetro
     */
    public void setMensajePerimetro(String mensajePerimetro) {
        this.mensajePerimetro = mensajePerimetro;
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
     * Metodo para obtener el color de la figura
     *
     * @return mensajeArea
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo para establecer el color de la figura
     *
     * @param color almacena el valor del color
     */
    public void setColor(String color) {
        this.color = color;
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
