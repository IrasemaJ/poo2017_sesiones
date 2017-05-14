/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;
import java.util.Scanner;

/**
 *
 * @author Itzel
 */
public class Arrays {
    
    private int[] container;
    private int size;
    
    public int getSize() {
        return size;
    }
    
    public Arrays(int size){
        
        this.size = size;
        container = new int[size];
        
        Scanner s;  //instancia de scaner
        s = new Scanner(System.in); // sistema. entrada
        for (int i = 0; i < size; i++) {
            container[i] = s.nextInt(); // lo guarda en
        }

    }
    
    public int find(int value, int i){
        
        if(value == container[i]){
             
           return i;
        }
        if(i == container.length-1 ){
                
           return -1;
        }
        return find(value, i+1); //recursividad (se llama la misma funcion)
    }
    
    int binarySearch(int i, int f, int val){
        
        if(container[i] == val){
            return i;
        }
        if(i == f){
            return -1;
        }
        int temp = f/2;  //se divide a la mitad (no redondea)
        if(container[temp] > val){
            return binarySearch(i, temp, val);
        }
        else{
            return binarySearch(temp, f, val);
        }
    }
    
    int binarySearch2(int i, int f, int val){

        if(container[i] == val){

            return i;
        }
        if(i == f){

            return -1;
        }
        if(f == val){

            return f;
        }
        int temp = f/2;  //se divide a la mitad (no redondea)
        if(container[temp] > val){
            
            return binarySearch2(++i, temp, val);
        }
        if(container[temp] == val){

            return temp;
        }
        else{

            return binarySearch2(temp+1, f, val);
        }

    }
    
    int binarySearch3(int i, int f, int val){
        
        if(container[i] == val){
            return i;
        }
        if(i == f){
            return -1;
        }
        int temp = (f + i)/2;  //se divide a la mitad (no redondea)
        if(container[temp] > val){
            return binarySearch3(i, temp, val);
        }
        else{
            return binarySearch3(temp, f, val);
        }
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arrays a = new Arrays(10);
        int val = 7;
        int pos = a.binarySearch(0, a.getSize(), val);
        System.out.println("numero" + val + " esta en la posición " + pos);
    }
}
