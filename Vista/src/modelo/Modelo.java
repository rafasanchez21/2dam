/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Modelo {
    
    public void arraylist(){
    ArrayList <Vista> personas = new ArrayList<Vista>();
    Vista p1 = new Vista("pepe", "faeo");
    Vista p2 = new Vista ("juan", "pass");
    Vista p3 = new Vista ("rafa","123");
    
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    
    
  
    for(int i =0; i<personas.size();i++){
        System.out.println(personas.get(i));
    }
    
    
   
        
    }
   public void añadirusuario(){  
       ArrayList <Vista> personas = new ArrayList<Vista>();
    Vista p1 = new Vista("pepe", "faeo");
    Vista p2 = new Vista ("juan", "pass");
    Vista p3 = new Vista ("rafa","123");
    
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    
    
  
    for(int i =0; i<personas.size();i++){
        System.out.println(personas.get(i));
    }
    
       Scanner sc2 = new Scanner(System.in);
       System.out.println("Nombre del nuevo usuario");
       String nu = sc2.next();
       System.out.println("Contraseña para el nuevo usuario");
       String nc = sc2.next();
    
    Vista p4 = new Vista (nu,nc); 
    personas.add(p4);
    
       
}
}