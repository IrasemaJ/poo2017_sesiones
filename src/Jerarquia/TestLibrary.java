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
public class TestLibrary {
    
    public static void main(String[] args) {
        
        Library l = new Library();
        Book b = new Book("El señor de los anillos", "123AB", "a");
        
        l.addItems(b);
        
        //Date d = new Date(2017, 4, 22)
        
        Magazine m = new Magazine(" Vanidades", "Planeta", new Date(2017, 4, 22));
        m.printTitle();
        
        l.addItems(m);
        System.out.println("Hay " + l.getBookCount() + " libros");
        
    }
}
