/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Interfaces.InterfaceDaoProfesor;
import Entidades.Profesor;
import daos.Dao;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class DaoProfesor extends Dao implements InterfaceDaoProfesor{

    @Override
    public Profesor buscarProfesor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Profesor> buscarProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addProfesor(Profesor p) {
        
        profesores.add(p);
        return true;
    }

}
