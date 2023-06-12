/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7_herencia;

/**
 *
 * @author ESPE
 */
public class Motocicleta extends Vehiculo{
  boolean patada;
  @Override
  public void encendido (){
  encendido=true;
  estado= "vehiculo encendido";
  }
  
  public void apagado (){
  encendido = false;
  estado= "vehiculo apagado";
  }
  
}
