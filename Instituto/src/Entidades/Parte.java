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
public class Parte {
     int IdParte;
     String fecha;

    public Parte(int IdParte, String fecha) {
        this.IdParte = IdParte;
        this.fecha = fecha;
    }

    public Parte() {
    }

    public int getIdParte() {
        return IdParte;
    }

    public void setIdParte(int IdParte) {
        this.IdParte = IdParte;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Parte{" + "IdParte=" + IdParte + ", fecha=" + fecha + '}';
    }
     
     
}
