/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;
import modelo.Modelo;
import vista.NewJFrame;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Control {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Modelo clase2 = new Modelo();
       
   NewJFrame datos = new NewJFrame();
   System.out.println(""+datos.getusuario());
        
   Vista clase1 = new Vista();
   clase1.pedirdatos();
   clase1.comprobardatos();
   clase1.menu();
   
   Scanner sc = new Scanner(System.in);
   
   int opcion = sc.nextInt();
   
   switch(opcion){
       case 1:
       {
           System.out.println("Ha elegido añadir usuario");
           clase2.añadirusuario();
           
           
       }
       
       case 2:
       {
           System.out.println("Ha elegido ver usuarios");
           clase2.arraylist();
       }
       
       case 3 :
       {
           System.out.println("");
           System.out.println("Hasta luego");
           System.exit(0);
       }
   }
        
   
   
   
    
    }
    
}
