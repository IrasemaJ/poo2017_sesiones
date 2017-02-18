/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolRecursividad;

/**
 *
 * @author Itzel
 */
public class ArbolDecision {
    
    private Node root = null;
    
    public void insert(int value){
        if(root == null){
           
            root = new Node();
            root.setLeft(null);
            root.setRight(null);
            root.setValue(value);
            
        }
        else{
            
        }
    }
    
    public void printtree(){
        if(root == null){
            System.out.println("El ARBOL ESTA VACIO");
        }
        else{
            root.print();
        }
    }
    
    public static void main(String[] args) {
        ArbolDecision dt = new ArbolDecision();
        dt.insert(8);
        dt.printtree();
    }
}
