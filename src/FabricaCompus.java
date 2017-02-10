/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Itzel
 */
public class FabricaCompus {
    
    Computadora ac;
    
    public void ensamblarHardware(){
        
        System.out.println("Estoy ensamblando el Hardware");
        System.out.println("RAM:" + ac.getCapcidadRam());
        System.out.println("HHD:" + ac.getCapacidadDisco());
        System.out.println("Procesador:" + ac.getVelProcesadorGhz());
    }
    
    public void instalarSoft(){
        
        System.out.println("Estoy instalando Sistema Operativo Windows");
        
    }
    public void configurar(){
        
        System.out.println("Configurando Windows");
    }
    
    public void embalar(){
        
        System.out.println("Empaquetando computadora");
    }
    
    public Computadora crearComputadora(int capacidadDisco, int capacRam, float procesador){
        
        ac = new Computadora();
        ac.setCapacidadDisco(capacidadDisco);
        ac.setCapcidadRam(capacRam);
        ac.setVelProcesadorGhz(procesador);   
        
        ensamblarHardware();
        instalarSoft();
        configurar();
        embalar();
        return ac;
    }
    
    public static void main(String[] args) {
        
        FabricaCompus f;
        f = new FabricaCompus();
        
        f.crearComputadora(1000, 16, 2.9f);
    }
}

