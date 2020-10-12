/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
   
    private  JLabel pantalla = new JLabel(" ");
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
    
    private Dimension tamV = new Dimension(300,400);
    
     private double resultado = 0;
     private double num;
     private static final int suma = 1;
     private static final int resta = 2;
     private static final int multi = 3;
     private static final int div = 4;
     private  static final int igual = 0;
     private int operador = Calculadora.igual;
     private boolean punto = false;
     private boolean nuevonum = true;
     private NumberFormat formato = NumberFormat.getInstance();
     
       public Calculadora(){
            
        Dimension dimpantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dimpantalla.width - dimpantalla.width) / 2;     
        int y = (dimpantalla.height - dimpantalla.height) / 2;
        this.setLocation(x,y);
        this.setSize(tamV);
        this.setTitle("Calculadora");
            
           
        pulsar raton = new pulsar();
        for(int i =0;i<botones.length-1;i++){
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
            pantalla.setText("0,0");
            pantalla.setHorizontalAlignment(JLabel.RIGHT);
            
        }
     
   
    public static void main(String[] args) {
        new Calculadora();
    }
           

    class pulsar implements ActionListener{
     
     public void actionPerformed(ActionEvent e) {
         
         JButton origen = (JButton) e.getSource();
         String texto = origen.getText();
         
         switch(texto){
             case "+" : 
                operacion(Calculadora.suma) ;
                break;
             
             case "-" :
                 operacion(Calculadora.resta);
                 break;
             
             case "*":
                  operacion(Calculadora.multi);
                  break;
               
              case "/":
                  operacion(Calculadora.div);
                  break;
              
              case ",":
                  if(!nuevonum){
                      if(!punto){
                        String  resultado = pantalla.getText();
                        pantalla.setText(resultado+",");
                      }else{
                          pantalla.setText("0,");
                          nuevonum=false;
                      } 
                      punto=true;
                      break;
                  }
                
              case "C":
                  pantalla.setText("0,0");
                  nuevonum=true;
                  punto=false;
                  break;
              
              case "=":
                  if(operador != Calculadora.igual){
                      String result = pantalla.getText();
                      if(!result.isEmpty()){
                          Number n =  null;
                          try{
                              n=(Number) formato.parse(result);
                              num = n.doubleValue();
                          }catch(ParseException ex){
                              num = 0;  
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
                          resultado = num;
                          break;
                        }
                        operador = Calculadora.igual;
                        pantalla.setText(formato.format(resultado));
                      }
                  }
                  break;
              default :
                  String resultado = pantalla.getText();
                  if(nuevonum){
                      pantalla.setText(texto);  
                  }else{
                      pantalla.setText(resultado+texto);
                  }
                  nuevonum = false;
                  break;     
         }
         
     }
}
    
   
    public void operacion(int signo){
         if(!nuevonum){
             String result = pantalla.getText();
             if(!result.isEmpty()){
                 Number n = null;
                 try{
                     n =(Number) formato.parse(result);
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
                    
                        resultado = num;
                         
                 }
                 operador = signo;
                 pantalla.setText(formato.format(resultado));
                 nuevonum = true;
                 punto = false;
             }
         }
    }  
       
}


