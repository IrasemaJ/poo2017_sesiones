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
public class Default {
    
    private String atributo1;
    private int atributo2;
    private String [] atributo3;

    public String getAtributo1() {
        return atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public String[] getAtributo3() {
        return atributo3;
    }
    

    public Default() {
        
        atributo1 = "soy la clase default";
        atributo2 = 10;
        atributo3 = new String [20];
                
    }
    
    public static void main(String[] args) {
        
        Default a;
        a = new Default();
        System.out.println(a.getAtributo1());
        System.out.println(a.getAtributo2());
        System.out.println(a.getAtributo3().length);
    }
}
