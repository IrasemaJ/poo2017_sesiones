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
public class Magazine extends Items {
    
    protected int volumen;

    public Magazine(String title, String publisher, Date pubDate) {
        this.pubDate = pubDate;
        this.title = publisher;
        this.title = title;
    }
    
    
    public void printTitle(){
        System.out.println("Titulo:" + title);
    }
}
