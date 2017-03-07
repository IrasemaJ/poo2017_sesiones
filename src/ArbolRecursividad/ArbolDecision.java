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
    private Node temp = null;
    private Node a = null;
    private Node cambio = null;

    public void insert(int value){
        //caso base
        if(root == null){

            root = new Node();

            root.setLeft(null);

            root.setRight(null);

            root.setValue(value);
            
            temp = root;
            a = temp;
            
        }
        else{
            
            if (value < temp.getValue()) {
                //cuando el numero a insertatr es menor
                if (temp.left == null) {
                    Node n = new Node();
                    n.setValue(value);
                    temp.left = n;
                    return;
                }
                else{
                    temp = temp.left; // para ir cambiando de nivel
                    insert(value); // se vuelve a empezar es igual que un for()
                }   
            }
            else{
                //cuando el numero es mayor
                if (temp.right == null) {
                    Node n = new Node();
                    n.setValue(value);
                    temp.right = n;
                    return;
                }
                else{
                    temp = temp.left; // para ir cambiando de nivel
                    insert(value); // se vuelve a empezar es igual que un for()
                }
            }
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
    
    public void find(int value){
        if (value == root.getValue()) {
            System.out.println("El numero " + value + " si esta.");

        }
        if (value > a.getValue()) { //si es mayor
            a = a.right;
            
            if (a == null) {
                   System.out.println("El numero " + value + " no esta");

            }
            if (value == a.getValue()) {
                System.out.println("El numero " + value + " si esta.");

            }
            else{
                find(value);
            }
            
        }
        if (value < a.getValue()) { //si es menor
            a = a.left;
            
            if (a == null) {
               System.out.println("El numero " + value + " no esta"); 

            }
            if (value == a.getValue()) {
                System.out.println("El numero " + value + " si esta.");
            }
            else{
                find(value);
            }
        }
    }
    
    public int find2(int value, int cont){
        
        if (cont == 0) {
            temp = root;
            cont++;
        }
        if (temp == null) {
            return -1;
            
        }
        if (value == temp.getValue()) {
            return value;
        }
        if (value < temp.getValue()) {
            temp = temp.left;
            if (temp.left == null) {
                return -1;
            }
        } 
        else{
            temp = temp.right;
            if (temp.right == null) {
                return-1;
            }
        }
        return find2(value, 1);    
    }
    

    public void inOrder(int cont){
        if (cont == 0) {
            temp = root;
            cont++;
        }
        if (temp == null) {
            System.out.println("El arbol esta vacio");
            return;
        }
        if (temp.left != null) {
            temp = temp.left;
        }
        else{
            return;//hace que ignore inOrder(1);
        }
        inOrder(1);
        System.out.println(temp.getValue());
        temp = temp.right;
        inOrder(1);
        
    }
    
    public void inOrder2(int cont){
        if (cont == 0) {
            temp = root;
            cont++;
        }
        if (temp == null) {
            System.out.println("El arbol esta vacio");
            return;
        } 
        if (temp.left != null) {
            
            if (temp != cambio) {
               cambio = temp; 
               temp = temp.left;
            }    
        }
        else{
            return;
        }
        inOrder2(1);
        System.out.println(temp.getValue());
        if (temp.right != null) {
                temp = temp.right;
        }
        else{
            temp= cambio;
        }
        inOrder2(1);
        
    }

    public static void main(String[] args) {

        ArbolDecision dt = new ArbolDecision();
        dt.insert(10);
        dt.insert(8);
        dt.insert(17);
        dt.insert(4);
        dt.insert(9);
        dt.insert(3);
        dt.insert(2);
        //dt.find(18);
        //dt.inOrder(0);
        dt.inOrder2(0);
        
        //int res = dt.find2(2, 0);
        //System.out.println("resultado " + res);
    }
    
}
