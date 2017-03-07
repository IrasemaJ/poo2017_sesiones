/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varios;

import java.util.Scanner;
/**
 *
 * @author Itzel
 */
public class SwitchCase {
    
    public static void main(String[] args) {
        int opcion = 0;
        Scanner s = new Scanner(System.in);
        opcion = s.nextInt();
        
        switch(opcion){ //solo funciona con enteros
            case 1:
                System.out.println("Tecleaste 1");
                break; // solo termina lo que esta dentro del bloque {}
            case 2:
                System.out.println("Tecleaste2");
                break;
            case 3:
                System.out.println("Tecleaste2");
                break;
            default:
                System.out.println("otro");
                break;
        }
                
    }
    
}
