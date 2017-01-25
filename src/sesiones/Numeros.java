/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;
import java.lang.Math;
/**
 *
 * @author Itzel
 */
public class Numeros {
    
    //atributos
    private int[] primeList;
    private int[] perfectNaturalList; //arreglos
    
    //metodos
    public int[] getNPrimos(int num){
        
        return null;
    }
    
    public int getPrimeN(int num){
        
        return 0;
    }
    
    public int max(int num, int num2) {
        if( num > num2)
        {
            return num;
        }
        else
        {
            return num2;
        }
    }
    
    public int min(int num, int num2) {
       if( num < num2)
        {
            return num;
        }
        else
        {
            return num2;
        } 
    }
    
    public double potencia (double num, double potencia){
        
        return Math.pow(num, potencia);
    }
    
    public int valorAbsoluto(int num){
        if(num < 0)
        {
            return (num * -1);
        }
        else
        {
            return num;
        }
    }
    
    public double raizCuadrada(double num){
        
        return Math.sqrt(num);
    }
    
    public void reservaPrimeList(int num){
        
        primeList = new int[num];
         
    }
    
    public void reservaPerfectNatualList(int num){
        
        perfectNaturalList = new int[num]; //reserva espacio
        
    }
    
    public void llenarPrimeList(){
        
        System.out.println("El tamaño de primeList es " + primeList.length);
        //buscar cuantos espacios tiene
    }
    
    public static void main(String[] args) {
        //crear instancia 
        //Numeros ac = new Numeros();
        /*
        Numeros ac;
        ac = new Numeros();
        
        //para ejecutar a los metodos de la clase se necesita una instancia u objeto.
        ac.reservaPrimeList(1000);
        ac.reservaPerfectNatualList(3000);
        ac.llenarPrimeList();
        */
        
        Numeros eje;
        eje = new Numeros ();
        
        eje.max(2, 5);
        eje.min(1, 3);
        double temporal = eje.raizCuadrada(92);
        
        System.out.println("El resultado es: " + temporal);
        
        double temp = eje.potencia(8, 22);
        System.out.println("La potencia es: " + temp);
        
        
        
    }
    
    
    
    
}
