/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Modelo;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author Usuario
 */
public class Vista {
    
    
    
//   public void mostraruser(String ouser){
//       tfusuario.setText();
//   }
     
   String usuario = "rafa";
   String pass = "123";

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
      NewJFrame datos = new NewJFrame();

       
       
       if(datos.getusuario().equals("rafa") && datos.getpass().equals("123")){
           System.out.println("Login correcto");
           System.out.println("-----------------");
       }else{
           System.out.println("Login incorrecto, inténtelo de nuevo");
           
       }
   }
   
   public void menu(){
       System.out.println("Elige la opcíon que quieras");
       System.out.println("");
       System.out.println("1. Añadir usuario");
       System.out.println("2. Ver usuarios");
       System.out.println("3. Salir");
   }
   
   public void mostrardatos(){
       Modelo mostrar = new Modelo();
       mostrar.arraylist();
       
   }
   
   public void borrardatos(){
       Modelo borrar = new Modelo();
      
   }
   
}
