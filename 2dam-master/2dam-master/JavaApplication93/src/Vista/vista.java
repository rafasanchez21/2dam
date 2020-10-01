/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class vista {
    String u;
    String p;
    
   
 
    public void obtenerdatos(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce el usuario");
    u = sc.next();
    System.out.println("Introduce la contraseña");
    p = sc.next();
    }
   
    public void comprobar(){
    while(u.equals("rafa") && p.equals("123")){
        System.out.println("logueo correcto");
        break;}
        
    while(!u.equals("rafa")|| !p.equals("123")){
        System.out.println("Error, intentalo de nuevo");
        break;
    }    
        }

    
    
    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "vista{" + "u=" + u + ", p=" + p + '}';
    }
    
    
    

   
    
        
    
    
    
    
  
    
       
    
}
