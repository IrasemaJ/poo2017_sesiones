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
public class Papas {
    boolean enchiladas;
    String presentacion; //bolsa de 300gr o paquete de 500gr
    double precio;

    Papas(boolean b, String bolsa, double d) {
        //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEnchiladas() {
        return enchiladas;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setEnchiladas(boolean enchiladas) {
        this.enchiladas = enchiladas;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
