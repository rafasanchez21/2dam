/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Entidades.Alumno;
import Interfaces.InterfaceDaoAlumno;
import java.util.ArrayList;
import daos.Dao;

/**
 *
 * @author usuario
 */
public class DaoAlumno extends Dao implements InterfaceDaoAlumno {

    @Override
    public Alumno buscarAlumno(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> buscarAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAlumno(Alumno a) {
  
    alumnos.add(a);
    return true;
    }

   
}
