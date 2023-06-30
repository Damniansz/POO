/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionlab;

/**
 *
 * @author xaldo
 */
public class Asignatura {
    private String nombre;
    private String horario;
    private Laboratorio laboratorio;

    public Asignatura(String nombre, String horario, Laboratorio laboratorio) {
        this.nombre = nombre;
        this.horario = horario;
        this.laboratorio = laboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
}
