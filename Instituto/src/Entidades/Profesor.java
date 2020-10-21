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
public class Profesor {
    int IdProfesor;
    String nombre;

    public Profesor(int IdProfesor, String nombre) {
        this.IdProfesor = IdProfesor;
        this.nombre = nombre;
    }

    public Profesor() {
        
    }

    public int getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(int IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Profesor{" + "IdProfesor=" + IdProfesor + ", nombre=" + nombre + '}';
    }
    
}
