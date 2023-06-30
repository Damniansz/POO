
package gestionlab;

public class Laboratorio {
    public String nombre,encargado;
    public int capacidad;
    private int equipos;
    
    public Laboratorio (String nombre, int capacidad, int equipos){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.equipos=equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEquipos() {
        return equipos;
    }

    public void setEquipos(int equipos) {
        this.equipos = equipos;
    }
    
    public String getEncargado (){
    return encargado;
    }
    
    public void setEncargado (String encargado){
        this.encargado=encargado;
    
    }
}
