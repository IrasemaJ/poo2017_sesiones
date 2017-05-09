/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author Itzel
 */
public class Fresa implements Comparable<Fresa> { 

    @Override
    public int compareTo(Fresa o) {
        return 1;
    }
    
    public enum Frescura{VERDE, ALPUNTO, MADURA};
    
    protected Frescura FrescuraDeLaFruta;

    public Frescura getFrescuraDeLaFruta() {
        return FrescuraDeLaFruta;
    }

    public void setFrescuraDeLaFruta(Frescura FrescuraDeLaFruta) {
        this.FrescuraDeLaFruta = FrescuraDeLaFruta;
    }

    
    
    
            
}
