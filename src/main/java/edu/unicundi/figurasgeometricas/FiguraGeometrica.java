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
public class FiguraGeometrica {

    private double lado1, lado2, lado3;
    private double area;
    private double perimetro;
    private int sumax, sumay;
    private String color;
    private String coorde1;
    private String coorde2;
    private String coorde3;
    private String mensaje;
    private int coordenadas[][] = new int[3][3];

    public FiguraGeometrica(String coorde1, String coorde2, String coorde3) {
        this.coorde1 = coorde1;
        this.coorde2 = coorde2;
        this.coorde3 = coorde3;
    }

    public void hallarArea() {
        this.area = lado1 * lado2;
    }

    public void hallarPerimetro() {
        this.perimetro = lado1 * 4;
    }

    public void imprimirInfo() {
        
        System.out.println("Perimetro " + getPerimetro());
        System.out.printf("Area: %.2f ", getArea());
    }

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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getArea() {
        return area;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCoorde1() {
        return coorde1;
    }

    public void setCoorde1(String coorde1) {
        this.coorde1 = coorde1;
    }

    public String getCoorde2() {
        return coorde2;
    }

    public void setCoorde2(String coorde2) {
        this.coorde2 = coorde2;
    }

    public String getCoorde3() {
        return coorde3;
    }

    public void setCoorde3(String coorde3) {
        this.coorde3 = coorde3;
    }

}
