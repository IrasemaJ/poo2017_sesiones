/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author Itzel
 */
public class Factorial {
    
    public int calculoFactorial(int value)
    {
        //caso base
        if(value == 1)
        {
            return 1;
        }
        else //paso recursivo
        {
            return value * calculoFactorial(value-1);
        }
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int temp = f.calculoFactorial(5);
        System.out.println("El factorial es " + temp);
    }
    
}
