/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacalculofigura;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class PracticaCalculoFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa lado del cuadrado: ");
        double lado = sc.nextDouble();
        
        Figura cuadrado = new Figura (lado);

        double area = cuadrado.calcularArea();

        double perimetro = cuadrado.calcularPerimetro();
        System.out.println("El área del cuadrado: " + area);
        System.out.println("El perímetro del cuadrado : " + perimetro);
        
        sc.close();
    }
    
}
