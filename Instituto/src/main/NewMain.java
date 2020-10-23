/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.Alumno;
import Entidades.Incidencia;
import Entidades.Parte;
import daos.DaoProfesor;
import Entidades.Profesor;
import daos.DaoAlumno;
import daos.DaoIncidencia;
import daos.DaoParte;
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
        
        DaoAlumno daoAlumno = new DaoAlumno();
        Alumno alu = new Alumno(1,"Rafa");
        daoAlumno.addAlumno(alu);
        ArrayList<Alumno> alumnos = daoAlumno.buscarAlumnos();
   
        DaoParte daoParte = new DaoParte();
        Parte parte = new Parte(1,"23 de Octubre");
        daoParte.addParte(parte);
        ArrayList<Parte> partes = daoParte.buscarPartes();
        
        DaoIncidencia daoIncidencia = new DaoIncidencia();
        Incidencia incidencia = new Incidencia(1,"Fumar");
        daoIncidencia.addIncidencia(incidencia);
        ArrayList<Incidencia> incidencias = daoIncidencia.buscarIncidencias();
    
    
    
    }
    
//    CRUD
//    C Create
//    R Read  SELECT
//    U Update
//    D Delete        
//                    
    
}
