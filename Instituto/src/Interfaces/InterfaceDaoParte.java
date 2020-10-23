/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Parte;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface InterfaceDaoParte {
    
    public Parte buscarParte(int idParte);
    public ArrayList<Parte>buscarPartes();
    public boolean addParte(Parte pa);
}
