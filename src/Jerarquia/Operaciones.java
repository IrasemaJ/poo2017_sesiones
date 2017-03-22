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
public class Operaciones {
    
    private double fecha;
    private double cantidad;
    private String tipodeOperacion;
    
    Operaciones(double cantidad, double fecha, String tipodeOperacion) {
        this.cantidad = cantidad;
        this.tipodeOperacion = tipodeOperacion;
        this.fecha = fecha;
        
    }
    
}
