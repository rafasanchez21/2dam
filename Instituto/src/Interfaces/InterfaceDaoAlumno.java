/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Alumno;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface InterfaceDaoAlumno {
    
    public Alumno buscarAlumno(int idAlumno);
    public ArrayList<Alumno>buscarAlumnos();
    public boolean addAlumno(Alumno a);
}
