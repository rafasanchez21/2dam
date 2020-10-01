/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.vista;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class modelo {
    

 public void arraylist(){  
     
      Scanner sc = new Scanner(System.in);
     
     vista obj = new vista();
     int i;
     int N=1;
     
     
    ArrayList<vista> personas = new ArrayList();
    
   for(i=0;i<=N;i++){
       System.out.println("Nombre usuario");
       String un = sc.next();
       System.out.println("Contraseña");
       String pn = sc.next();
   }
    
}
}