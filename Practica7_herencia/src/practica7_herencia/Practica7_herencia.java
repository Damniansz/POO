/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7_herencia;

/**
 *
 * @author ESPE
 */
public class Practica7_herencia {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Vehiculo veh = new Vehiculo();
    Automovil auto = new  Automovil();
    Motocicleta moto = new Motocicleta();
    
    veh.apagado();
    auto.encendido();
    moto.encendido();
    System.out.println(veh.estado);
    System.out.println(auto.estado);
    System.out.println(moto.estado);
    
    
  }
  
}
