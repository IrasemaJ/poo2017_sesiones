/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiones;

/**
 *
 * @author Itzel
 */
public class ArreglosAlumnos {  //refactor cambiar todo el nombre
    
    //atributos o fields o class variables
    private String [] alumnos;
    private int contador;
    
    
    //metodos
    public void inicializaArreglo(int size) {
        
        alumnos = new String[size];
        contador = 0;
    }
    
    public void agregarNombre(String nombre) {
        
        alumnos[contador] = nombre;
        contador = contador + 1; //contador++;
    }
    
    public void imprimirArreglo() {
        for (int i = 0; i < contador; i++) {
            
            System.out.println("Nombre " + (i+1) + " " + alumnos[i]);
        }
        
    }
    
    public static void main(String[] args) {
        
        //declaro variable de tipo clase arreglos
        ArreglosAlumnos alumnosUDLA;
        //reservo espacio para la instancia
        alumnosUDLA = new ArreglosAlumnos();
        
        alumnosUDLA.inicializaArreglo(10);
        alumnosUDLA.agregarNombre("Pedrito");
        alumnosUDLA.agregarNombre("Rodrigo");
        alumnosUDLA.agregarNombre("Roberto");
        alumnosUDLA.imprimirArreglo();
    }
}
