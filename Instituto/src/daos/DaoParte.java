/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import Entidades.Parte;
import Interfaces.InterfaceDaoParte;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class DaoParte extends Dao implements InterfaceDaoParte{

    @Override
    public Parte buscarParte(int idParte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Parte> buscarPartes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addParte(Parte pa) {
     partes.add(pa);
     return true;
    }
    
}
