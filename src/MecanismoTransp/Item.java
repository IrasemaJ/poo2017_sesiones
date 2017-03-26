/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MecanismoTransp;

/**
 *
 * @author Itzel
 */
public class Item {
    
    protected int combustible;
    protected int numLlantas;
    protected String motor;

    public int getCombustible() {
        return combustible;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public String getMotor() {
        return motor;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
    
    
}
