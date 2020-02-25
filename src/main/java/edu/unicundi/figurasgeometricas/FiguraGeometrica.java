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
    private int  area;
    private int perimetro;
    private String color;
    private int coorde1;
    private int coorde2;
    private int coorde3;
    
    
    public void hallarArea(int lado1){
        this.area = lado1*4;
        
    }
    public void hallarPerimetro(int lado1){
        this.perimetro = lado1*4;
    }
    public void pintar(){
        
    }
    
}
