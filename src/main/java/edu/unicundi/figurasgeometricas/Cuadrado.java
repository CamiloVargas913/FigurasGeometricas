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
public class Cuadrado extends Cuadrilateros {

    public Cuadrado() {
        
        if (separarCoordenadas("-1,3", "1,3", "1,1", "-1,1") == true && getSumax() == getSumay()) {
            System.out.println("Es cuadrado");
        }else{
            System.out.println("No es cuadrado");
        }
    }

}
