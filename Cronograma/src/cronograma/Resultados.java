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
public class Resultados {
    
    public void ingresarResultados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el resultado (goles locales - goles visitantes):");
        String resultado = sc.nextLine();

        String[] goles = resultado.split("-");
        int golesLocales = Integer.parseInt(goles[0].trim());
        int golesVisitantes = Integer.parseInt(goles[1].trim());

        // Aquí puedes hacer lo que necesites con los resultados, como guardarlos en una estructura de datos o mostrarlos por pantalla
        System.out.println("Resultado ingresado correctamente.");
    }
}
