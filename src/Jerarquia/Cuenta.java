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
public class Cuenta {
    
    private int numCuenta;
    private double fechaCreaccion;
    private double saldoInicial;
    private int contador;
    
    private Operaciones [] misOperaciones;

    public Cuenta(int numCuenta, double fechaCreaccion, double saldoInicial) {
        this.numCuenta = numCuenta;
        this.fechaCreaccion = fechaCreaccion;
        this.saldoInicial = saldoInicial;
        
        misOperaciones = new Operaciones[100];
        contador =0;
    }
    
    void imprimirSaldo()
    {
        System.out.println("El saldo de la cuenta es:");
        System.out.println(saldoInicial + " pesos" );
    }

    void depositar(double cantidad, double fecha) {
        
        Operaciones o = new Operaciones(cantidad, fecha, "Depositar");
        misOperaciones[contador] = o;
        contador++;
        saldoInicial = saldoInicial + cantidad;
        
    }

    void retiro(double cantidad, double fecha) {
        if (cantidad < saldoInicial) {
            Operaciones o = new Operaciones(cantidad,fecha, "retiro");
            misOperaciones[contador] = o;
            contador++;
            saldoInicial = saldoInicial - cantidad;
        }
        else{
            System.out.println("No se puede retirar cantidades mayores a la existente");
        }
    }
    
}
