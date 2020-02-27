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

    private int lado1;
    private int area;
    private int perimetro;
    private String color;
    private String coorde1;
    private String coorde2;
    private String coorde3;
    private String mensaje;

    public FiguraGeometrica() {
        
    }

    public int hallarArea(int lado1) {
        this.area = lado1 * lado1;

        return this.area;
    }

    public void hallarPerimetro(int lado1) {
        this.perimetro = lado1 * 4;
    }

//    public void validarCoordenadas(String coorde1, String coorde2, String coorde3) {
//        if (coorde1.equals("") || coorde2.equals("") || coorde3.equals("")) {
//            this.mensaje = "Las Coordenadas no pueden ser vacias";
//        }else{
//            this.coorde1 = coorde1;
//            this.coorde2 = coorde2;
//            this.coorde3 = coorde3;
//        }
//    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
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
