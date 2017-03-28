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
public class Persona {
    
    protected String name;
    protected String apellido;
    protected int horas;

    public Persona(String name, String apellido, int horas) {
        this.name = name;
        this.apellido = apellido;
        this.horas = horas;
    }
    
    //si tiene constructor todos deben tener
    
    public void print(){
        
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + apellido);
        System.out.println("Horas Trabajadas: " + horas);
    }
}
