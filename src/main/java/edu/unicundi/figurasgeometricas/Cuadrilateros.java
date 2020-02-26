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
public class Cuadrilateros extends FiguraGeometrica {

    private String coorde4;
    
    public Cuadrilateros(String coorde1,String coorde2,String coorde3,String coorde4) {
        super(coorde1,coorde2,coorde3);
        this.coorde4 = coorde4;
    }

}
