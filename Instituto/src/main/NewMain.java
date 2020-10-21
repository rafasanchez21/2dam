/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import daos.DaoProfesor;
import Entidades.Profesor;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoProfesor daoProfesor = new DaoProfesor();
        
        Profesor profe = new Profesor(1,"Enrique");
        daoProfesor.addProfesor(profe);
        
        ArrayList<Profesor> profesores = daoProfesor.buscarProfesores();
    }
    
//    CRUD
//    C Create
//    R Read  SELECT
//    U Update
//    D Delete        
//                    
    
}
