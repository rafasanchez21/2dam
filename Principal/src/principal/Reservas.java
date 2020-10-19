/*
  El tema escogido en esta práctica será un negocio de alquiler de coches
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Reservas extends Principal{
    String marca;
    String modelo;
    String fecha;
    
    
    
    public void alquilarCoche(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Qué desea realizar?");
        System.out.println("");
        System.out.println("1.Alquilar coche");
        System.out.println("");
        System.out.println("2. Salir");
        System.out.println("");
        
        String teclado = sc.next();
        
        if(teclado.equals("1")){
            System.out.println("¿Qué marca desea alquilar?");
            System.out.println("");
            System.out.println("1. Seat");
            System.out.println("2. Opel");
            System.out.println("3. Renault");
            System.out.println("4. Ford");
            System.out.println("5. Salir");
            System.out.println("");
            String teclado2 = sc.next();
            if(teclado2.equals("1")|| teclado2.equals("2") || teclado2.equals("3") || teclado2.equals("4")){
                System.out.println("¿Qúe modelo desea alquilar?");
                System.out.println("");
                System.out.println("1. Seat Ibiza");
                System.out.println("2. Opel Astra");
                System.out.println("3. Renault Megane");
                System.out.println("4. Ford Mondeo");
                System.out.println("5. Salir");
                System.out.println("");
                String teclado3 = sc.next();
                if(teclado3.equals("1")|| teclado3.equals("2") || teclado3.equals("3") || teclado3.equals("4")){
                    System.out.println("Introduzca la fecha de alquiler");
                    String teclado4 = sc.next();
                    if(!teclado4.isEmpty()){
                        System.out.println("Gracias por su reserva!");
                    }else{
                        System.out.println("Fecha incorrecta, intentelo de nuevo");
                        
                        
                    }
                }else{ if(teclado3.equals("5")){
                    System.out.println("");
                    System.out.println("Hasta pronto");
                    System.exit(0);
                }else{
                    System.out.println("Modelo desconocido");
                }   
                }
                
            }else{ if(teclado2.equals("5")){
                System.out.println("");
                System.out.println("Hasta pronto");
                 System.exit(0);
                                             }
                 else{ 
                         System.out.println("Marca desconocida");
                         }
            }
                
            }else{ if(teclado.equals("2")){
                System.out.println("");
                System.out.println("Hasta pronto");
                System.exit(0);
            } else{ 
                         System.out.println("Operación desconocida");
                         }
            
        }
    }
    
    
}
