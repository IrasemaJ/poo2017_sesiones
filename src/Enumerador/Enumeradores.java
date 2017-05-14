/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerador;

import java.util.Scanner;

/**
 *
 * @author Itzel
 */
public class Enumeradores {
    
    private MES mesNacimiento;
    
    public enum MES
    {
        enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,nomviembre,diciembre
    }
    
    public enum DIA
    {
        lunes, martes, miercoles, jueves, viernes, sabado, domingo
    }
    
    public void seleccionaMesDeNacimiento(MES mes)
    {
        this.mesNacimiento = mes;
    }
    
    public MES getMesNacimiento()
    {
        return this.mesNacimiento;
    }
    
    public static void main(String[] args) {
        Enumeradores e = new Enumeradores();    
        Scanner s = new Scanner(System.in);
        
        MES temporal = MES.valueOf(s.nextLine());
        
        e.seleccionaMesDeNacimiento(temporal);
        
        System.out.println("Mi mes de nacimiento es:");
        System.out.println(e.getMesNacimiento());
        
        System.out.println("Cúal es tu día favorito:");
        DIA tmp2 = DIA.valueOf(s.nextLine());
        System.out.println("a mi tb me encantan los " + tmp2);
        
    }
}
