/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Itzel
 */
public class Circulo implements Figura  {

    protected double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public double getArea() {
        return PI*radio*radio;
    }
 
}
