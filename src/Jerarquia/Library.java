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
public class Library {
    
   
    protected Items[] books;
    protected int contBooks;
    protected int maxBooks;
    
    public Library(){
        
        maxBooks = 100;
        books = new Items[maxBooks];
        contBooks = 0; 
    }
    
    public void addItems(Items book){
        
        if (contBooks < maxBooks) {
            
            books[contBooks] = book;
            contBooks++;
        }
        else{
            System.out.println("No hay espacio");
        }
    }
    
    public int getBookCount(){
        return contBooks;
    }
}
