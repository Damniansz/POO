/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasobrecarga;

/**
 *
 * @author ESPE
 */
public class Persona {
    String nombre;
    int edad;
    int cedula;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
     
   public Persona (int cedula){
       this.cedula=cedula;
   }
   
   public void jugar (){
       System.out.println(" Mi nombre es: " + nombre+ " voy a jugar ");
   }
   
   public void jugar (String juego){
       System.out.println(" Voy a jugar: s" + juego + " me gusta mucho ");
   }
   
}
