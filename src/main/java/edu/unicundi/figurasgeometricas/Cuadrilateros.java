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
    private int coordenadas[][] = new int[4][4];

    public Cuadrilateros(String coorde1, String coorde2, String coorde3, String coorde4) {
        super(coorde1, coorde2, coorde3);
        this.coorde4 = coorde4;
    }

    public boolean separarCoordenadas() {
        if (getCoorde1().equals("") || getCoorde2().equals("") || getCoorde3().equals("") || this.coorde4.equals("")) {
            setMensaje("Las Coordenadas no pueden ser vacias");
        } else {
            String[] parte1 = getCoorde1().split(",");
            String[] parte2 = getCoorde2().split(",");
            String[] parte3 = getCoorde3().split(",");
            String[] parte4 = this.coorde4.split(",");
            // coordenadas de x 
            this.coordenadas[0][0] = Integer.parseInt(parte1[0]);
            this.coordenadas[0][1] = Integer.parseInt(parte2[0]);
            this.coordenadas[0][2] = Integer.parseInt(parte3[0]);
            this.coordenadas[0][3] = Integer.parseInt(parte4[0]);
            // coordenadas de Y 
            this.coordenadas[1][0] = Integer.parseInt(parte1[1]);
            this.coordenadas[1][1] = Integer.parseInt(parte2[1]);
            this.coordenadas[1][2] = Integer.parseInt(parte3[1]);
            this.coordenadas[1][3] = Integer.parseInt(parte4[1]);
            validarCoordenadas();
        }
        return validarCoordenadas();
    }

    public boolean validarCoordenadas() {
        //validacion eje y
        if (this.coordenadas[1][0] == this.coordenadas[1][1]) {
            setLado2(Math.abs(this.coordenadas[1][0] - this.coordenadas[1][2]));
        } else {
            setLado2(Math.abs(this.coordenadas[1][0] - this.coordenadas[1][1]));
        }
        //validacion eje x
        if (this.coordenadas[0][0] == this.coordenadas[0][1]) {
            setLado1(Math.abs(this.coordenadas[0][0] - this.coordenadas[0][2]));
        } else {
            setLado1(Math.abs(this.coordenadas[0][0] - this.coordenadas[0][1]));
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

    public int[][] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[][] coordenadas) {
        this.coordenadas = coordenadas;
    }
}
