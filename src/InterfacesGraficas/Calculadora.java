/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Itzel
 */
public class Calculadora extends JFrame{
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.setSize(500, 500);
        c.setVisible(true);
        
        c.setLayout(new FlowLayout()); //COMPONENTES SEGUIDOS
        
        JTextField texto = new JTextField("");
        JButton uno = new JButton("1");
        JButton dos = new JButton("2");
        //JPanel panel = new JPanel(new FlowLayout());
        
        c.add(texto);
        c.add(uno);
        c.add(dos);
        c.pack();
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 texto.setText(texto.getText() + "1");
            }
        });
    }
    
}
