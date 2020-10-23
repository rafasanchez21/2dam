/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Incidencia;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface InterfaceDaoIncidencia {
    public Incidencia buscarIncidencia(int idIncidencia);
    public ArrayList<Incidencia>buscarIncidencias();
    public boolean addIncidencia(Incidencia i);
    
}
