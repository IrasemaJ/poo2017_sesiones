/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Itzel
 */
public class MarcaTexto {
    
    private String color;
    private char size;

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    public MarcaTexto() {
        color = "negro";
        size = 's'; //comilla simple por 1 caracter
    }

    public MarcaTexto(String color, char size) {
        this.size = size;
        this.color = color;
    }
    
    public MarcaTexto(String color) {
        this.color = color;
        size = 's';
    }
    
    
    public static void main(String[] args) {
        
        MarcaTexto a;
        a = new MarcaTexto("Verde");
        System.out.println(a.getColor());
        
        MarcaTexto b;
        b = new MarcaTexto();
        System.out.println(b.getColor());
        b.setColor("Amarillo");
        System.out.println(b.getColor());
        b.setSize('L');
        
    }
}
