/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesExtractas;

/**
 *
 * @author Itzel
 */
public abstract class FigurasG {
    
    //no tienen instancias
    //constante en mayusculas con el final
    //en las clases abstractas puedo colocar atributos normales o constantes
    public static final double  PI= 3.1416;//static no se cambial el valor de la variable
    protected double area; //este es un atributo normal
    
    //clase abstracta pude tener metodos abstractos
    public abstract double getArea(); //metodo sin cuerpo es abstracto
    
    //clase abstracta puede tener metodo normal
    public double getPi(){
        return PI;
    }
    
    //metodo parcialmemte implementado
    public void quienSoy(){
        
        System.out.println("Soy una figura geometrica");
    }
    
    //si son interfaces se vulven constantes las variables y con asbtracta se pueden hacer las dos
    //constantes y variables
    
    
}
