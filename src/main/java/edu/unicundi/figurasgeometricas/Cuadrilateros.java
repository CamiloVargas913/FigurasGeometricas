/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 * Clase para manejar los metodos de Cuadrilateros y hereda de FiguraGeometrica
 *
 * @author David Márquez
 */
public class Cuadrilateros extends FiguraGeometrica {

    /**
     * Variable para guardar la coordenada4
     */
    private String coorde4;
    /**
     * Variable que almacena un vector de todas las coordenadas del eje x
     */
    private int coordx[] = new int[4];
    /**
     * Variable que almacena un vector de todas las coordenadas del eje y
     */
    private int coordy[] = new int[4];
    /**
     * Variable que almacena un vector de todas las coordenadas del eje x y y
     */
    private int coordenadas[][] = new int[4][4];

    /**
     * Constructor principal de la clase
     *
     * @param coorde1 Almacena la coordenada 1
     * @param coorde2 Almacena la coordenada 2
     * @param coorde3 Almacena la coordenada 3
     * @param coorde4 Almacena la coordenada 4
     */
    public Cuadrilateros(String coorde1, String coorde2, String coorde3, String coorde4) {
        super(coorde1, coorde2, coorde3);
        this.coorde4 = coorde4;
    }

    @Override
    public void hallarArea() {
        setArea(getLado1()* getLado2());
    }

    @Override
    public void hallarPerimetro() {
        setPerimetro(getLado1()*4);
    }

    /**
     * Metodo para separar las coordenadas con el metodo split y almacenarlas en
     * el vector coordenadas
     *
     * @return boolean
     */
    @Override
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
            return validarCoordenadas();
        }
        return false;
    }

    /**
     * Metodo para validar que las coordenadas coincidan a un patron y asi saber
     * si es un cuadrado o no
     *
     * @return
     */
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

    /**
     * Metodo para convertir las coordenadas a coordenadas de un plano
     * cartesiano en pixeles
     */
    @Override
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
        this.coordx[3] = this.coordenadas[0][3];

        this.coordy[0] = this.coordenadas[1][0];
        this.coordy[1] = this.coordenadas[1][1];
        this.coordy[2] = this.coordenadas[1][2];
        this.coordy[3] = this.coordenadas[1][3];

        setCoordx(this.coordx);
        setCoordy(this.coordy);
    }

    /**
     * Metodo para obtener la coordenada 4
     *
     * @return coordenada 4
     */
    public String getCoorde4() {
        return coorde4;
    }

    /**
     * Metodo para establecer el valor de la coordenada 4
     *
     * @param coorde4 Almacena el valor de la coordenada 4
     */
    public void setCoorde4(String coorde4) {
        this.coorde4 = coorde4;
    }

    /**
     * Metodo para obtener las coordenadas del array
     *
     * @return coordenadas
     */
    public int[][] getCoordenadas() {
        return coordenadas;
    }

    /**
     * Metodo para establecer el valor de las coordenadas del vector
     *
     * @param coordenadas almacena las coordenadas
     */
    public void setCoordenadas(int[][] coordenadas) {
        this.coordenadas = coordenadas;
    }

}
