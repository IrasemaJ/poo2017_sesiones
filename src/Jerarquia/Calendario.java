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
public class Calendario {
    
    private Evento [] listaEventos;
    private int contEventos;

    public Calendario() {
        
        listaEventos = new Evento[100];
        contEventos = 0;
    }
    
    public void agregarEvento(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Descripcion.");
        String des = s.nextLine();
        System.out.println("dia: ");
        int di = s.nextInt();
        System.out.println("mes: ");
        int me = s.nextInt();
        System.out.println("año: ");
        int anio = s.nextInt();
        
        Date fecha = new Date(anio, me, di);
        System.out.println("Hora del evento: ");
        double ho = s.nextDouble();
        System.out.println("Duracion del evento: ");
        double du = s.nextDouble();
        
        Evento e = new Evento(des, fecha, ho, du);
        
        listaEventos[contEventos] = e;
        contEventos++;
    }
    
    public void printAllEvent(){
        
        for (int i = 0; i < contEventos; i++) {
            
            listaEventos[i].printEvent();
            System.out.println("----------------------");
        }
    }
}
