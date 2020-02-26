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
    
    int coordenadas[][] =new int[4][4];
    int sumax;
    int sumay;
    public Cuadrado() {
        
    }
    
    public void validarCoordenadas(String coorde1, String coorde2, String coorde3,String coorde4) {
        if (coorde1.equals("") || coorde2.equals("") || coorde3.equals("")|| coorde4.equals("")) {
            setMensaje("Las Coordenadas no pueden ser vacias");
        }else{
            // coordenadas de x 
            this.coordenadas[0][0] = 0;
            this.coordenadas[0][1] = 3;
            this.coordenadas[0][2] = 3;
            this.coordenadas[0][3] = 0;
            // coordenadas de Y 
            this.coordenadas[1][0] = 0;
            this.coordenadas[1][1] = 0;
            this.coordenadas[1][2] = 3;
            this.coordenadas[1][3] = 3;
             
             //setCoordenadas(this.coordenadas);
             
             for (int i = 0; i < this.coordenadas.length; i++) {
                 sumax+=this.coordenadas[0][i];
                 sumay+=this.coordenadas[1][i];
                 
            }
             if(sumax == sumay){
                 System.out.println("Es un cuadrado");
             }else{
                 System.out.println("no es un cuadrado");
             }
             System.out.println(this.sumax);
             System.out.println(this.sumay);
             
            
        }
    }
    
   
}
