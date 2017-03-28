/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajadores;

/**
 *
 * @author Itzel
 */
public class Main {
    
    public static void main(String[] args) {
        
        Titular t = new Titular("ARIEL", "GARCIA", 3);
        t.print();
        
        Externo v = new Externo("JOSE", "GARZA", 2);
        v.print();
    }
}
