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
public class NotFundsException extends  RuntimeException{
    
    @Override
    public String getMessage() {
        return "No tienes dinero";
    }
    

    @Override
    public String toString() {
        return "Te quedaste sindinero";
    }
    
}
