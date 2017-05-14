/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraductorBinario;

import java.util.Scanner;

/**
 *
 * @author Itzel
 */
public class Binario {
    public String int2Bin(int num)
    {
        String binario = "";
        while(num/2 >= 0 )
        {               
            if(num == 0) break;
            binario  = (num % 2) + binario;
            num = num / 2;                        
        }                
        return binario;
    }
    
    public void leer()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la frase a convertir:");
        String linea = s.nextLine();
        for (int i = 0; i < linea.length(); i++) {
            System.out.print(int2Bin((int)linea.charAt(i)) + " ");
        }        
    }
    
    public static void main(String[] args) {
        Binario b = new Binario();
        b.leer();
    }
    
}
