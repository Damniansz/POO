/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_tutoria_polimorfismo;

/**
 *
 * @author Usuario
 */
public abstract class Deportista {
    private String nombre;
    private int edad;
    private String diciplina;
    private String sexo;

    public Deportista(String nombre, int edad, String diciplina, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.diciplina = diciplina;
        this.sexo = sexo;
    }
    
    public abstract void entrenamiento();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDisciplina() {
        return diciplina;
    }

    public void setDisciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
