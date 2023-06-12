/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7_herencia2;

/**
 *
 * @author ESPE
 */
public class Deportista extends Persona{
 
  String deporte;
  
  public Deportista (String nombre){
  super(nombre);
  }
  
  public void cambiarNombre (String Nombre){
  super.setNombre(nombre);
  }
  
}
