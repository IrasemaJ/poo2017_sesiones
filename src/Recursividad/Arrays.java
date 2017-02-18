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
public class Arrays {
    
    private int[] container = {1,2,3,4,5,6};
    
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
        if(f == val){
            return f;
        }
        int temp = f/2;  //se divide a la mitad (no redondea)
        if(container[temp] > val){
            return binarySearch(++i, temp, val);
        }
        if(container[temp] == val){
            return temp;
        }
        else{
            return binarySearch(temp+1, f, val);
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arrays a = new Arrays();
        int pos = a.binarySearch(0, 6, 6);
        System.out.println("El numero esta en la posicion: " + pos);
    }
}
