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
    private double coordenadas[][] = new double[4][4];
    private double sumax, sumay;

    public Cuadrilateros() {

    }

    public boolean separarCoordenadas(String coorde1, String coorde2, String coorde3, String coorde4) {
        if (coorde1.equals("") || coorde2.equals("") || coorde3.equals("") || coorde4.equals("")) {
            setMensaje("Las Coordenadas no pueden ser vacias");
        } else {
            String[] parte1 = coorde1.split(",");
            String[] parte2 = coorde2.split(",");
            String[] parte3 = coorde3.split(",");
            String[] parte4 = coorde4.split(",");
            // coordenadas de x 
            this.coordenadas[0][0] = Double.parseDouble(parte1[0]);
            this.coordenadas[0][1] = Double.parseDouble(parte2[0]);
            this.coordenadas[0][2] = Double.parseDouble(parte3[0]);
            this.coordenadas[0][3] = Double.parseDouble(parte4[0]);
            // coordenadas de Y 
            this.coordenadas[1][0] = Double.parseDouble(parte1[1]);
            this.coordenadas[1][1] = Double.parseDouble(parte2[1]);
            this.coordenadas[1][2] = Double.parseDouble(parte3[1]);
            this.coordenadas[1][3] = Double.parseDouble(parte4[1]);
            validarCoordenadas();
        }
        return validarCoordenadas();
    }

    public boolean validarCoordenadas() {
//validacion eje y
        if (this.coordenadas[1][0] == this.coordenadas[1][1] ) {
            sumay = (Math.abs(this.coordenadas[1][0] - this.coordenadas[1][2]));
        }else{
            sumay = (Math.abs(this.coordenadas[1][0] - this.coordenadas[1][1]));
        }
        //validacion eje x
        if (this.coordenadas[0][0] == this.coordenadas[0][1] ) {
            sumax = (Math.abs(this.coordenadas[0][0] - this.coordenadas[0][2]));
        }else{
            sumax = (Math.abs(this.coordenadas[0][0] - this.coordenadas[0][1]));
        }

        //Validacion del cuadrado en el eje x
        if (Math.abs(this.coordenadas[0][0] - this.coordenadas[0][1])
                == Math.abs(this.coordenadas[0][2] - this.coordenadas[0][3])
                && Math.abs(this.coordenadas[1][0] - this.coordenadas[1][1])
                == Math.abs(this.coordenadas[1][2] - this.coordenadas[1][3])) {
            return true;
        } else {
            return false;
        }
    }

    public String getCoorde4() {
        return coorde4;
    }

    public void setCoorde4(String coorde4) {
        this.coorde4 = coorde4;
    }

    public double[][] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double[][] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public double getSumax() {
        return sumax;
    }

    public void setSumax(double sumax) {
        this.sumax = sumax;
    }

    public double getSumay() {
        return sumay;
    }

    public void setSumay(double sumay) {
        this.sumay = sumay;
    }

}
