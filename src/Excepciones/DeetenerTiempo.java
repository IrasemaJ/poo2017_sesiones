/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Itzel
 */
public class DeetenerTiempo {
    
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DeetenerTiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Termine");
    }
}
