/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author usuario
 */
public class Incidencia {
    int IdIncidencia;
    String observaciones; 

    public Incidencia() {
    }

    public Incidencia(int IdIncidencia, String observaciones) {
        this.IdIncidencia = IdIncidencia;
        this.observaciones = observaciones;
    }

    public int getIdIncidencia() {
        return IdIncidencia;
    }

    public void setIdIncidencia(int IdIncidencia) {
        this.IdIncidencia = IdIncidencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "IdIncidencia=" + IdIncidencia + ", observaciones=" + observaciones + '}';
    }
    
    
}
