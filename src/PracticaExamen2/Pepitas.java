/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExamen2;

/**
 *
 * @author Itzel
 */
public class Pepitas {
    
    String presentacion;  //pueden ser bolsita de 100gr o paquete de 500gr
    boolean peladas;
    double precio;

    public String getPresentacion() {
        return presentacion;
    }

    public boolean isPeladas() {
        return peladas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPeladas(boolean peladas) {
        this.peladas = peladas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
