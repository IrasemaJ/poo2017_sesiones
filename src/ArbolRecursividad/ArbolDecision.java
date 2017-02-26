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

    public void insert(int value){
        //caso base
        if(root == null){

            root = new Node();

            root.setLeft(null);

            root.setRight(null);

            root.setValue(value);
            
            temp = root;
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

    public static void main(String[] args) {

        ArbolDecision dt = new ArbolDecision();
        dt.insert(10);
        dt.insert(8);
        dt.insert(17);
        dt.insert(4);
        dt.insert(9);
        dt.insert(3);
        dt.insert(2);
        dt.printtree();
    }
    
}
