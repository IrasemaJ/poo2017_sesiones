/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExamen2;

/**
 *
 * @author Itzel
 */
public class Tienda {
    
    public static void main(String[] args) {
        
        Chicles chMenta = new Chicles("tabletas", "menta", 5.0);
        Chicles chCanela = new Chicles("barra", "canela", 8.0);
        
        Papas pEnchiladas = new Papas(true, "bolsa", 12.0);
        Papas pSinChile = new Papas(false, "paquete", 22.0);
        
        Almacen store = new Almacen(100);
        
        store.surtirPapas(pEnchiladas);
        store.surtirPapas(pSinChile);
        
        store.surtir("papas", 15.0);
    }
}
