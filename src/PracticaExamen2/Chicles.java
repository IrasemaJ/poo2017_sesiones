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
public class Chicles {
    String presentacion;  //pueden ser tabletas o barras
    String sabor;
    double precio;

    
    Chicles(String tabletas, String menta, double d) {
        
    }

    public String getPresentacion() {
        return presentacion;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
