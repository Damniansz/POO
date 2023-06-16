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
public class Participantes {
    private String[] participantes;
    private int numParticipantes;

    public Participantes() {
        participantes = new String[16]; // Tamaño máximo de 16 participantes
        numParticipantes = 0;
    }

    public void ingresarParticipantes() {
        if (numParticipantes >= 16) {
            System.out.println("Se ha alcanzado el límite máximo de participantes (16).");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del participante:");
        String nombreParticipante = sc.nextLine();

        participantes[numParticipantes] = nombreParticipante;
        numParticipantes++;

        System.out.println("Participante ingresado correctamente.");
    }
}
