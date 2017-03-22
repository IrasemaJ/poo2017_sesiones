/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jerarquia;

import java.util.Scanner;

/**
 *
 * @author Itzel
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int celular;
    
    private Cuenta miCuenta;

    public Usuario(String nombre, String apellido, String direccion, int telefono, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCelular() {
        return celular;
    }

    public Cuenta getMiCuenta() {
        return miCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setMiCuenta(Cuenta miCuenta) {
        this.miCuenta = miCuenta;
    }
    
    public void crearCuenta(){
        
        Scanner s = new Scanner(System.in); //entrada al sistema
        System.out.println("Monto para abrir cuenta:");
        double saldoInicial = s.nextDouble();
        System.out.println("Fecha de creacion de la cuenta:");
        double fechaCreacion = s.nextDouble();
        System.out.println("Numero de cuenta:");
        int numCuenta = s.nextInt();
        
        miCuenta = new Cuenta(numCuenta, fechaCreacion, saldoInicial);  
    }
    
    public void imprimirSaldo(){
        miCuenta.imprimirSaldo();
    }
    
    public void depositar(double cantidad, double fecha){
        
        miCuenta.depositar(cantidad, fecha);
    }
    
    public void retiro(double cantidad, double fecha){
        
        miCuenta.retiro(cantidad, fecha);
    }
    
    public static void main(String[] args) {
        Usuario yo = new Usuario("ariel", "perez","aqui", 5555, 04445);
        yo.crearCuenta();
        yo.imprimirSaldo();
        yo.depositar(250, 14.03);
        yo.depositar(3, 14.03);
        yo.imprimirSaldo();
        yo.retiro(258, 14.30);
        yo.imprimirSaldo();
                
        
                
    }
    
}
