/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAbstractas;

/**
 *
 * @author Itzel
 */
public class Estatica {
    
    public static double value;
    public int entero;
    
    public static double getValue(){
        
        return value;
    }
    
    public int entero(){
        
        System.out.println(Estatica.value);
        return entero;
    }
    
    public static void main(String[] args) {
        
        Estatica.value = 22.0;
        System.out.println("El valor es " + Estatica.getValue());
    }
    
/* los metodos solo pueden acceder a atributos estaticos */
    
}
