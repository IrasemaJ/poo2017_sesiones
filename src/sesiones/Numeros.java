/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

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
        Numeros ac;
        ac = new Numeros();
        
        //para ejecutar a los metodos de la clase se necesita una instancia u objeto.
        ac.reservaPrimeList(1000);
        ac.reservaPerfectNatualList(3000);
        ac.llenarPrimeList();
        
        
    }
    
    
    
    
}
