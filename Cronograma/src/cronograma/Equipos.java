/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronograma;

import java.util.Scanner;

/**
 *
 * @author xaldo
 */
public class Equipos {
     private String[] equipos;
    private int numEquipos;
    
    public Equipos() {
        equipos = new String[100]; // Tamaño máximo de 100 equipos
        numEquipos = 0;
    }

    public void ingresarEquipos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de equipos a ingresar:");
        int cantidadEquipos = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer de entrada

        for (int i = 0; i < cantidadEquipos; i++) {
            System.out.println("Ingrese el nombre del equipo:");
            String nombreEquipo = sc.nextLine();
            equipos[numEquipos] = nombreEquipo;
            numEquipos++;
        }
        
        System.out.println("Equipos ingresados correctamente.");
    }
}
