/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Collections.Fresa.Frescura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Itzel
 */
public class OredenaFresa {
    
    public static void main(String[] args) {
        
        Fresa f = new Fresa();
        f.setFrescuraDeLaFruta(Fresa.Frescura.MADURA);
        
        Fresa f2 = new Fresa();
        f2.setFrescuraDeLaFruta(Fresa.Frescura.VERDE);
        
        Fresa f3 = new Fresa();
        f3.setFrescuraDeLaFruta(Fresa.Frescura.ALPUNTO);
        
        List<Fresa> lista = new ArrayList<Fresa>();
        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        
        Collections.sort(lista);
        
        for (Iterator i = lista.iterator(); i.hasNext(); ) {
            System.out.println("Fresa " + ((Fresa)i.next()).getFrescuraDeLaFruta());
        }
        
    }
    
    /*
    public static void main(String[] args) {
        Fresa f1 = new Fresa();
        f1.setFrescuraDeLaFruta(Fresa.Frescura.MADURA);
        
        Fresa f2 = new Fresa();
        f2.setFrescuraDeLaFruta(Fresa.Frescura.VERDE);
        
        Fresa f3 = new Fresa();
        f3.setFrescuraDeLaFruta(Fresa.Frescura.ALPUNTO);
        
        List<Fresa> lista = new ArrayList<Fresa>();

        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        
        for(Iterator i = lista.iterator(); i.hasNext();)
        {
            System.out.println("fresa " + ((Fresa)i.next()).getFrescuraDeLaFruta());
        }
        
        Collections.sort(lista);
        
        System.out.println("Las fresas ya ordenadas");
        for(Iterator i = lista.iterator(); i.hasNext();)
        {
            System.out.println("fresa " + ((Fresa)i.next()).getFrescuraDeLaFruta());
        }
        
    }
    */
    
}
