/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jerarquia;

/**
 *
 * @author Itzel
 */
public class Evento {
    
    private String descripcion;
    private Date fechaEvento;
    private double hora;
    private double duracionHora;

    public Evento(String descripcion,Date fechaEvento, double hora, double duracionHora) {
        this.descripcion = descripcion;
        this.hora = hora;
        this.duracionHora = duracionHora;
        this.fechaEvento = fechaEvento;
        
    }
    
    public void printEvent(){
        System.out.println("Evento: " + descripcion);
        System.out.println("Fecha: ");
        fechaEvento.print();
        System.out.println("Hora: " +  hora);
        System.out.println("Duracion" + duracionHora);
    }
    
    public static void main(String[] args) {
        
    }
    
}
