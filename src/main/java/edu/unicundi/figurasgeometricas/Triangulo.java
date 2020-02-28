/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author David Márquez
 * Clase para manejar los metodos del triangulo y extiende de la clase padre FigurasGeometricas
 */
public class Triangulo extends FiguraGeometrica {
    /**
     * Variable para guardar el semiperimetro
     */
    private double semiperimetro;
    
    /**
     * Constructor del metodo
     * @param coorde1 almacena la coordenada 1
     * @param coorde2 almacena la coordenada 2
     * @param coorde3 almacena la coordenada 3
     */
    public Triangulo(String coorde1, String coorde2, String coorde3) {
        super(coorde1, coorde2, coorde3);
    }
    /**
     * Metodo para validar que tipo de triangulo es (escaleno, isosceles, equilatero)
     */
    public void validarTipoTriangulo() {
        
        if (separarCoordenadas() == true) {
            if (getLado1() == getLado2() && getLado2() == getLado3() && getLado3() == getLado1()) {
                setMensaje("Es equilatero");
            } else if (getLado1() == getLado2() && getLado2() != getLado3()
                    || getLado1() == getLado3() && getLado3() != getLado2()
                    || getLado2() == getLado3() && getLado3() != getLado1()) {
                setMensaje("Es isosceles");
            } else {
                setMensaje("Es escaleno");
            }
        }
        
    }
    /**
     * Metodo para hallar el perimetro del triangulo
     */
    @Override
    public void hallarPerimetro() {
        setPerimetro(getLado1() + getLado2() + getLado3());
    }
    /**
     * Metodo para imprimir la informacion de area y el perimetro del triangulo
     */
    @Override
    public void imprimirInfo() {
        if (separarCoordenadas() == true) {
            setMensajePerimetro("Perimetro " + getPerimetro());
            setMensajeArea("Area " + getArea());
        } else {
            setMensaje("No es un triangulo");
        }
    }
    /**
     * Metodo para hallar el area del triangulo por la formula de Heron
     */
    @Override
    public void hallarArea() {
        this.semiperimetro = getPerimetro() / 2;
        setArea(Math.sqrt(this.semiperimetro * (this.semiperimetro - getLado1()) * (this.semiperimetro - getLado2()) * (this.semiperimetro - getLado3())));
    }
    
}
