/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication95;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;



/**
 *
 * @author Usuario
 */
public class UnixInteractor {

   
    public static void main(String[] command) throws IOException {
       
      String line;
      
      ProcessBuilder pb = new ProcessBuilder(command);
      pb.redirectErrorStream(true);
      try{
          Process shell = pb.start();
          InputStream is = shell.getInputStream();
          BufferedReader br = new BufferedReader (new InputStreamReader(is,"UTF-8"));
          
          System.out.println("La salida del proceso hijo"+Arrays.toString(command)+" : ");
          
          while((line = br.readLine())!= null){
           System.out.println(line);
      }
          is.close();
      } catch(IOException e) {
          System.out.println("Error ocurrió ejecutando el comando. Descripciñon: " +e.getMessage());
      }
   
    
    }
    
}
