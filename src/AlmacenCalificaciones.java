/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Itzel
 */
public class AlmacenCalificaciones {
    //atributos
    private float [] arreglo; //definicion de una arreglo
    private int size;
    
    
    //metodos
    public void reservaArreglo(int tamaño){
        
        arreglo = new float[tamaño]; //reserva espacio
        size = 0;
    }
    
    public void agregarCalificaciones(float cali) {
        
        arreglo[size] = cali;
        size = size + 1;
    }
    
    public void imprimirCalificaciones() {
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("la calificacion del el Alumno " + (i+1) + " es " + arreglo[i]);
            
        }  
    }
    
    public static void main(String[] args) {
        //crear instancia
        AlmacenCalificaciones ac;
        //se reserva espacio
        ac = new AlmacenCalificaciones();
        
        //acceder a metodos y atributos con la instancia
        ac.reservaArreglo(10);
        ac.agregarCalificaciones(100);
        ac.agregarCalificaciones(98);
        ac.agregarCalificaciones(95);
        ac.imprimirCalificaciones();
    }
    
    
}
