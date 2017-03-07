/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExamen2;

/**
 *
 * @author Itzel
 */
public class Almacen {
    
    private Papas [] arrayPapas;
    private Pepitas [] arrayPepitas;    
    private Chicles [] arrayChicles;        
    
    private int cantidadPapas;
    private int cantidadPepitas;
    private int cantidadChicles;
    
    public Almacen(int cantidadMaximaDeProductos) 
    {
        arrayPapas = new Papas[cantidadMaximaDeProductos];
        arrayChicles = new Chicles[cantidadMaximaDeProductos];
        arrayPepitas = new Pepitas[cantidadMaximaDeProductos];
        
        cantidadChicles = 0;
        cantidadPapas = 0;
        cantidadPepitas = 0;   
    }
    
    public void surtirPapas(Papas papas)// de la clase Papas y nombre de la var. Papas
    {
        arrayPapas[cantidadPapas] = papas;
        cantidadPapas++;
    }
    
    public void surtirMuchasPapasEnchiladasBolsa(int cantidad)
    {
        for (int i = 0; i < cantidad; i++) 
        {
            Papas temp = new Papas(true, "bolsa", 12.0);
            arrayPapas[cantidadPapas] = temp;
            cantidadPapas++;
        }
    }
    
    public void venderUnasPapas()
    {
        System.out.println("Aquí tienes tus papas");
        cantidadPapas--;
        arrayPapas[cantidadPapas] = null;
    }
    
    public void venderNPapas(int n)
    {
        for (int i = 0; i < n; i++) {
            venderUnasPapas();
        }
    }
    
    public void surtir(String producto, double precio)
    {
        if(producto.equals("papas"))
        {
            Papas p = new Papas(true, "bolsa", precio);
            arrayPapas[cantidadPapas] = p;
            cantidadPapas++;
        }
    }
    
    public void valorDeLaTiendita()
    {
        double total = 0;
        for (int i = 0; i < cantidadChicles; i++) {
            total = total + arrayChicles[i].getPrecio();
        }
        for (int i = 0; i < cantidadPapas; i++) {
            total = total + arrayPapas[i].getPrecio();
        }
        for (int i = 0; i < cantidadPepitas; i++) {
            total = total + arrayPepitas[i].getPrecio();
        }
        System.out.println("El valor total de la tiendita es: " + total);
    }
    
   
}
