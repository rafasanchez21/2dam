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
public class Alumno {
     int IdAlumno;
     String nombreAlumno;

    public Alumno(int IdAlumno, String nombreAlumno) {
        this.IdAlumno = IdAlumno;
        this.nombreAlumno = nombreAlumno;
    }

    public Alumno() {
    }
    
    

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "IdAlumno=" + IdAlumno + ", nombreAlumno=" + nombreAlumno + '}';
    }
     
     
}
