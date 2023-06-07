/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

/**
 *
 * @author xaldo
 */
public class Alumno {
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String celular;
    private String genero;

    public Alumno(String cedula, String nombre, String direccion, String telefono, String celular, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public String getGenero() {
        return genero;
    }

    
}
