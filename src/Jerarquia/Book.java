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
public class Book extends Items {
    
    private String ISBM;
    private String autor;

    public String getTitle() {
        return title;
    }

    public String getISBM() {
        return ISBM;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return publisher;
    }

    public Date getpubDate() {
        return pubDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String publisher) {
        this.publisher = publisher;
    }

    public void setPubDATE(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Book(String title, String ISBM, String autor) {
        this.title = title;
        this.ISBM = ISBM;
        this.autor = autor;
    }

    public Book(String title, String ISBM, String autor, String editorial, Date fechaPublicacion) {
        this.title = title;
        this.ISBM = ISBM;
        this.autor = autor;
        this.publisher = editorial;
        this.pubDate = fechaPublicacion;
    }
    
    
}
