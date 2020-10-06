/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {

   String usuario;
   String pass;

    public Vista() {
    }

    public Vista(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "" + "usuario = " + usuario + ", contraseña = " + pass;
    }
   
    
   public void pedirdatos(){
       Scanner sc = new Scanner (System.in);
       System.out.println("SISTEMA DE LOGIN");
       System.out.println("Introduce el usuario");
       usuario = sc.next();
       System.out.println("---------------------");
       System.out.println("Introduce la contraseña");
       pass = sc.next(); System.out.println("---------------------");
       
   } 
   
   public void comprobardatos(){
       if(usuario.equals("rafa") && pass.equals("123")){
           System.out.println("Login correcto");
           System.out.println("-----------------");
       }else{
           System.out.println("Login incorrecto, inténtelo de nuevo");
           System.exit(0);
       }
   }
   
   public void menu(){
       System.out.println("Elige la opcíon que quieras");
       System.out.println("");
       System.out.println("1. Añadir usuario");
       System.out.println("2. Ver usuarios");
       System.out.println("3. Salir");
   }
   
}
