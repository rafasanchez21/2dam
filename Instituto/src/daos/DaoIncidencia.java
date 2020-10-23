/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Entidades.Incidencia;
import Interfaces.InterfaceDaoIncidencia;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class DaoIncidencia extends Dao implements InterfaceDaoIncidencia{

    @Override
    public Incidencia buscarIncidencia(int idIncidencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Incidencia> buscarIncidencias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addIncidencia(Incidencia i) {
      incidencias.add(i);
      return true;
    }
    
}
