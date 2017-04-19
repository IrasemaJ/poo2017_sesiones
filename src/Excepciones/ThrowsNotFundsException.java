/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Itzel
 */
public class ThrowsNotFundsException {
    
    public void lanzaException() throws NotFundsException{
        System.out.println("Hola");
        //throw new NotFundsException();
    }
    
    public static void main(String[] args) {
        ThrowsNotFundsException t = new ThrowsNotFundsException();
        try{
            t.lanzaException();
        }
        catch(NotFundsException e){
            System.out.println(e.toString());
        }
    }
}
