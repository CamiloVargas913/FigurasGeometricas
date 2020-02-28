/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author user
 */
public class Triangulo extends FiguraGeometrica {
    
    private double semiperimetro;
    
    public Triangulo(String coorde1, String coorde2, String coorde3) {
        super(coorde1, coorde2, coorde3);
    }
    
    public void validarTipoTriangulo() {
        
        if (separarCoordenadas() == true) {
            if (getLado1() == getLado2() && getLado2() == getLado3() && getLado3() == getLado1()) {
                System.out.println("Es equilatero");
            } else if (getLado1() == getLado2() && getLado2() != getLado3()
                    || getLado1() == getLado3() && getLado3() != getLado2()
                    || getLado2() == getLado3() && getLado3() != getLado1()) {
                System.out.println("Es isosceles");
            } else {
                System.out.println("Es escaleno");
            }
        }
        
    }
    
    @Override
    public void hallarPerimetro() {
        setPerimetro(getLado1() + getLado2() + getLado3());
    }
    
    @Override
    public void imprimirInfo() {
        if (separarCoordenadas() == true) {
            System.out.println("Perimetro " + getPerimetro());
            System.out.println("Area " + getArea());
        } else {
            System.out.println("No es un triangulo");
        }
    }
    
    @Override
    public void hallarArea() {
        this.semiperimetro = getPerimetro() / 2;
        setArea(Math.sqrt(this.semiperimetro * (this.semiperimetro - getLado1()) * (this.semiperimetro - getLado2()) * (this.semiperimetro - getLado3())));
    }
    
}
