/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesExtractas;

/**
 *
 * @author Itzel
 */
public class Triangulo extends FigurasG { //solo las interfaces se implementan implements

    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double getArea() {
        return (base*altura)/2;
    }
    
    @Override
    public void quienSoy(){
       super.quienSoy();
       System.out.println("Especificamente soy un trinagulo");
   }
    /*
    @Override
    public double getPi() {
        return super.getPi();   
    }*/
    
    //si es estatico se llama con el nombre de la clase
}
