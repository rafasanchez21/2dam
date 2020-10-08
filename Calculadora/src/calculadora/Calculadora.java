/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Calculadora extends JFrame {
    
    public static void main(String[] args) {
        new Calculadora();
    }
     
 private Dimension tamV = new Dimension(100,100);
     
    private  JLabel pantalla = new JLabel("");
    private JPanel laybotones = new JPanel(new GridLayout(4,4));
    private JPanel layigual = new JPanel(new GridLayout(1,1));
         
    private JButton[] botones = {      
       new JButton("1"),  new JButton("2"),
       new JButton("3"), new JButton("4"),
       new JButton("5"), new JButton("6"),
       new JButton("7"), new JButton("8"),
       new JButton("9"), new JButton("0"),
       new JButton("+"),new JButton("-"),
       new JButton ("*"),new JButton ("/"),
       new JButton ("C"),new JButton ("=")};
     
        private double resultado = 0;
        private double num;
        private static int suma = 1;
        private static int resta = 2;
        private static int multi = 3;
        private static int div = 4;
        private static int C = 0;
        private int operador = Calculadora.C;
        private boolean punto = false;
        private boolean nuevonum = true;
        private NumberFormat formato = NumberFormat.getInstance();
        
        public Calculadora(){
            
            Dimension dimpantalla = Toolkit.getDefaultToolkit().getScreenSize();
           int x = (dimpantalla.width - dimpantalla.width) /2;     
           int y = (dimpantalla.height - dimpantalla.height) /2;

            this.setLocation(x,y);
            this.setSize(dimpantalla);
            this.setTitle("Calculadora");
            
           
            Raton raton = new Raton();
            for(int i =0;i<botones.length;i++){
                laybotones.add(botones[i]);
                botones[i].addActionListener(raton);
            }
            
            layigual.add(botones[botones.length-1]);
            botones[botones.length-1].addActionListener(raton);
            
            layigual.setPreferredSize(new Dimension(0,50));
            this.add(pantalla, BorderLayout.NORTH);
            this.add(laybotones);
            this.add(layigual,BorderLayout.SOUTH);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            pantalla.setText("0");
            pantalla.setHorizontalAlignment(JLabel.RIGHT);
            
        }
        
     public void operacion(int signo){
         if(!nuevonum){
             String resultado = pantalla.getText();
             if(!resultado.isEmpty()){
                 Number n = null;
                 try{
                     n =(Number) formato.parse(resultado);
                     num = n.doubleValue();
                 }catch(ParseException ex){
                     
                 }
                 switch(operador){
                     case Calculadora.suma:
                         resultado += num;
                         break;
                     case Calculadora.resta:
                         resultado -= num;
                         break;
                     case Calculadora.multi:
                         resultado *= num;
                         break;
                     case Calculadora.div:
                         resultado /= num;
                         break;
                     default :
                         resultado= num;
                 }
             }
         }
     }   
       
         
        

        
    }
    

