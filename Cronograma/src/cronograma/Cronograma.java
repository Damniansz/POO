/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cronograma;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author xaldo
 */
public class Cronograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int opc = 0;
        int elegir = 0;

        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar Equipos");
            System.out.println("2. Ingresar Participantes");
            System.out.println("3. Ingresar Resultados");
            System.out.println("4. Salir");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingresar Equipos");
                    Equipos equipos = new Equipos();
                    equipos.ingresarEquipos();
                    break;

                case 2:
                    System.out.println("Ingresar Participantes");
                    Participantes participantes = new Participantes();
                    participantes.ingresarParticipantes();
                    break;

                case 3:
                    System.out.println("Ingresar Resultados");
                    Resultados resultados = new Resultados();
                    resultados.ingresarResultados();
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opc != 4);
        sc.close();
    }
}