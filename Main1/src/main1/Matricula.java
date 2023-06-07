/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

/**
 *
 * @author xaldo
 */
public class Matricula {
    private Profesor profesor;
    private Alumno alumno;
    private Materia materia;

    public Matricula(Profesor profesor, Alumno alumno, Materia materia) {
        this.profesor = profesor;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
}
