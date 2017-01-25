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
public class Heroe {
    
    //atributo
    private String nombre;
    private int [] listaVidas;
    private String [] listAmigos;
    private String [] listEnemigos;
    
    //metodos
    public void salvarPrincesa(){
        
        System.out.println("Salvando a la princesa");
        atacarVillano(10);
        System.out.println("Ya salve a la princesa");
    }
    
    public void atacarVillano(int fuerza){
        
        System.out.println("Atacando al vilano con fuerza de: " + fuerza);
    }
    
    public static void main(String[] args) {
        Heroe ac;
        ac = new Heroe();
        
        ac.salvarPrincesa();
    }
}
