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
public class Main {
    
    public static void main(String[] args) {
        Triangulo t = new Triangulo(12.0, 3.0);
        t.quieSoy();        
        System.out.println("El area es: " + t.getArea());
        
        System.out.println("PI es: " + FigurasG.PI);
        
    }
}
