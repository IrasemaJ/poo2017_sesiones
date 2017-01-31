/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Itzel
 */
public class FabricaPan {
    
    private Pan ac;
    
    public void obtenerIngredientes(){
        
        System.out.println("Los Ingredientes son:");
        System.out.println("Cantidad de azucar es: " + ac.getCantidadAzucar() + " gramos");
        System.out.println("Cantidad de Huevos son: " + ac.getCantidadHuevos());
        System.out.println("Cantidad de Leche es: " + ac.getVasosLeche() + " litros");
    }
    
    public void prepararMasa(){
        
        System.out.println("Mezclando los ingredientes");
    }
    
    public void horneado(int grados){
        
        System.out.println("Hornenado a: " + grados + "ºC");
    }
    
    public void empaquetarPan(){
        
        System.out.println("El pan esta listo");
    }
    
    public Pan crearPan(int azucar, int huevos, int leche){
        
        ac = new Pan();
        ac.setCantidadAzucar(azucar);
        ac.setCantidadHuevos(huevos);
        ac.setVasosLeche(leche);    
        return ac;
     
    }
    
    public static void main(String[] args) {
        
        FabricaPan crear = new FabricaPan();
        crear.crearPan(40, 4, 2);
        crear.obtenerIngredientes();
        crear.prepararMasa();
        crear.horneado(325);
        crear.empaquetarPan();
        
        
    }
}
