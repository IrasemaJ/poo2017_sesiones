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
public class Date {
    
    private int año;
    private int mes;
    private int dia;
    private String diaSemana;

    public Date(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    
    public void print(){
        System.out.println(dia + "/" + mes + "/" + año);
    }
    
    public String toString(){
        return (dia + "/" + mes + "/" + año);
    }
    
    public String getDate(){
        
        return "" + dia + "/" + mes + "/" + año;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    public static void main(String[] args) {
        Date d = new Date(2017,3,14);
        d.print();
        
        Evento a = new Evento("Cumpleaños", d, 15.0, 24.0);
        a.printEvent();
        
        Calendario c = new Calendario();
        c.agregarEvento();
        c.printAllEvent();//ariellucien@yahoo.com.mx temporal1
    }
    
}
