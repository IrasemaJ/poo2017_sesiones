/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExamen;

/**
 *
 * @author Itzel
 */
public class Almacen {
    
    private Papas[] mercanciaPapas;
    private Choco[] mercChoco;
    private Pepitas[] mercPepitas;
    private int contador;
    
    Pepitas a;
    Choco b;
    Papas c;
    
    public void iniciarAlm(int sizePapa, int sizeChoco, int sizePep){
        
        mercanciaPapas = new Papas[sizePapa];
        mercChoco = new Choco[sizeChoco];
        mercPepitas = new Pepitas[sizePep];   
        
    }

    public void sutirPepitas(String nombre, String sabor){
        a = new Pepitas();
        a.setNombre(nombre);
        a.setSabor(sabor);
    }
    
    public void sutirChoco(String nombre){
        
        b.setNombre(nombre);
    }
    
    public void surtirPapa(String Nombre, String sabor){
        
        c.setNombre(Nombre);
        c.setSabor(sabor);
    }
    
    public void imprimir(){
        
    }
    
    
    public static void main(String[] args) {
        
    }
}
