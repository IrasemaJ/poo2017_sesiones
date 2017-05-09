/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Itzel
 */
public class Test {
    
    public static void main(String[] args) {
        ////// EN ORDEN /////////
        List<Integer> a = new ArrayList<Integer>(); //decirle que es (una clase)
        a.add(new Integer(5));
        a.add(new Integer(8));
        a.add(new Integer(10));
        
        for (Iterator i  = a.iterator(); i.hasNext(); ) {
            System.out.println("valor: " + i.next());
        }
        
        System.out.println("Numero de elementos" + a.size());
        
        /////////////////////////////////////////////////
        //// DE LADO IZQUIERO PADRE Y DRECHO HIJO ///////
        /////////// ES POLIFORFISMO CON PADRE E HIJO ////
        /////////////////////////////////////////////////
        
        ////// DE MENOR A MAYOR ///////////////
        Queue<Integer> pq = new PriorityQueue();
        pq.add(new Integer(12));
        pq.add(new Integer(6));
        pq.add(new Integer(38));
        
        for (Iterator i  = pq.iterator(); i.hasNext(); ) {
            System.out.println("valor pq: " + i.next());
        }
        
        System.out.println("Numero de elementos" + a.size());
        
        
        /////////////////////////////////////////////////
        /////////////////////////////////////////////////
        
        Collection<Integer> mia = new MiPropiaLista();
        mia.add(new Integer(20));
        mia.add(new Integer(40));
        mia.add(new Integer(60));
        
        System.out.println("Numero de elementos" + mia.size());
    }
}
