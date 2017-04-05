/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Itzel
 */
public class Triangulo implements FigurasG{
    
    protected double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override //sobre escribir del metodo abstracto que esta en el padre
    public void quieSoy() {
        //metodo concreto ( esta sobre escrito )
        System.out.println("Hola, soy un triangulo");
    }

    @Override //anotaciones
    public double getArea() {
        //metodo concreto ( esta sobre escrito )
        return(base*altura)/2;
    }
    

    
    
}
