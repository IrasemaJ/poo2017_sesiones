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
public class Circulo implements FigurasG{
    
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void quieSoy() {
        System.out.println("Hola soy un circulo");
    }

    @Override
    public double getArea() {
        return PI*radio*radio;
    }
    
}
