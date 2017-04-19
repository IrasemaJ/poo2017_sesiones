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
public class Test {
    
    public static void main(String[] args) {
        Figura [] arreglo = new Figura[2];
        Circulo c = new Circulo(22.0);
        Triangulo t = new Triangulo(12.0, 2.0);
        
        arreglo[0] = t;
        arreglo[1] = c;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("El area es: " + arreglo[i].getArea());
        }
    }
}
