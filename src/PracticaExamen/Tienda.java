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
public class Tienda {
    Pepitas a = new Pepitas();
    Choco b = new Choco();
    Papas c = new Papas();
    
    public void venta(String nombre, int cantidad){
        
        double total;
        if (nombre == a.getNombre()) {
            total = cantidad * a.getPrecio();
            System.out.println("El total de las " + a.getNombre() + "es igual a" + total);
        }
        if (nombre == b.getNombre()) {
            total = cantidad * b.getPrecio();
            System.out.println("El total de los " + b.getNombre() + "es igual a" + total);
        }
        if (nombre == c.getNombre()) {
            total = cantidad * c.getPrecio();
            System.out.println("El total de las " + c.getNombre() + "es igual a" + total);
        }
    }
    
    public static void main(String[] args) {
        
        Tienda res;
        res = new Tienda();
        
        res.venta("Papas", 3);
        
        
        
    }
}
