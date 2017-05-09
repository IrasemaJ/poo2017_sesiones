/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Itzel
 */
public class Simplesort {
    
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<Integer>();
        
        lista.add(new Integer(4));
        lista.add(new Integer(5));
        lista.add(new Integer(1));
        lista.add(new Integer(7));
        lista.add(new Integer(8));
        
        /////////////////////////////////////
        ///////DE MENOR A MAYOR (NATURAL)////
        
        Collections.sort(lista); 
        
        for (Iterator i = lista.iterator(); i.hasNext();) {
         
            System.out.println("value: " + i.next());
        }
        
        ///////PARA QUE LOS ORDENE DE MENOR A MAYOR //////////
        
        Collections.sort(lista, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.intValue() > o2.intValue()) {
                    return 1; 
                }
                else{
                    if (o1.intValue() > o2.intValue()) {
                        return -1;
                    }
                    else{
                        return 0;
                    }
                }
            }
            
        }
           );
        
        ///////PARA QUE ORDENE DE MAYOR A MENOR///////////
        
        Collections.sort(lista, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.intValue() > o2.intValue()) {
                    return -1; 
                }
                else{
                    if (o1.intValue() > o2.intValue()) {
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
            }
            
        }
           );
        
        
        
        for (Iterator i = lista.iterator(); i.hasNext();) {
         
            System.out.println("Value: " + i.next());
        }
        
    }
}
