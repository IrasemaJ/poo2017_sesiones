/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolRecursividad;

/**
 *
 * @author Itzel
 */
public class Factorial {
    
        public int calcFactorial(int value){
        
        //caso base
        if(value == 1){
            return 1;
        }
        else{
            return value*calcFactorial(value-1);
        }
        
    }
    
    public static void main(String[] args) {
        Factorial a = new Factorial();
        int temp = a.calcFactorial(5);
        System.out.println(temp);
                
    }
}
