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
    
    public Cuadrilateros() {
        
    }
    
     public void validarCoordenadas(String coorde1, String coorde2, String coorde3,String coorde4) {
        if (coorde1.equals("") || coorde2.equals("") || coorde3.equals("")|| coorde4.equals("")) {
            setMensaje("Las Coordenadas no pueden ser vacias");
        }else{
            setCoorde1(coorde1);
            setCoorde2(coorde2);
            setCoorde3(coorde3);
            this.coorde4 = coorde4;
        }
    }

}
