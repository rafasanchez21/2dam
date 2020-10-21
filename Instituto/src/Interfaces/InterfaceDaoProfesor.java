/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Profesor;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface InterfaceDaoProfesor {
    
    public Profesor buscarProfesor(int idProfesor);
    public ArrayList<Profesor>buscarProfesores();
    public boolean addProfesor(Profesor p);
    
}
