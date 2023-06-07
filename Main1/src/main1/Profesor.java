/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

/**
 *
 * @author xaldo
 */
public class Profesor {
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String celular;

    public Profesor(String cedula, String nombre, String direccion, String telefono, String celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    
}
