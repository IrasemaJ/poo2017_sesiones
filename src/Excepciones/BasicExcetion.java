/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import com.sun.corba.se.impl.io.TypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Itzel
 */
public class BasicExcetion {
    
    public static void main(String[] args) {
        int num=0;
        int arreglo[] = new int []{1,2,3,4,5};
        
        while(true){
            try{
                System.out.println("ESCRIBE NUM DEL 1 L 10");
                Scanner s = new Scanner(System.in);
                num = s.nextInt();
                System.out.println("posicion 5" + arreglo[5]);
                break; //rompe el while 
            }
            catch(InputMismatchException e){
                System.out.println("excepción atrapada");
            }
            catch(TypeMismatchException e){
                System.out.println("Valor incorrecto");
                System.out.println("Intenta de nuevo");
            }
            catch(IndexOutOfBoundsException a){
                System.out.println("esta fuera de los alcances");
                System.out.println(a.toString());
            }
            finally{ //siempre se ejecuta 
                System.out.println("Este es el final");
            }
        }
        System.out.println("el numero es " + num);
    }
}
