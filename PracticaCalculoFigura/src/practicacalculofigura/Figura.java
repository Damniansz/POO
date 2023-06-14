/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacalculofigura;

/**
 *
 * @author ESPE
 */
public class Figura {

   private double lado;

    public Figura(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado; 
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    
}
