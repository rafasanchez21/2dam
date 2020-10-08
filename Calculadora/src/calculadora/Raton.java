/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author usuario
 */
 class Raton implements ActionListener{
     
     public void actionPerformed(ActionEvent e) {
     
         JButton origen = (JButton) e.getSource();
         String texto = origen.getText();
         
         switch(texto){
             case"+" :
               
         }
         
     }
     
    
    
}
