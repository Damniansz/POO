
package evaluacionu2_saulaaldo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EvaluacionU2_SaulaAldo {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Ingresar datos de la carrera y curso
        System.out.println("Ingrese Laboratorio de la carrera (Itin): ");
        String carrera = sc.next();

        if (!carrera.equalsIgnoreCase("Itin")) {
            System.out.println("Esa carrera no existe");
            System.exit(0);
        }

        System.out.println("Ingrese el curso: ");
        String curso = sc.next();

        // Solicitar el número de asignaturas
        System.out.print("Ingrese el número de asignaturas que desea agregar: ");
        int numeroAsignaturas = sc.nextInt();

        // Limpiar el buffer después de nextInt()
        sc.nextLine();

        // Crear un horario vacío
        List<Horario> horarios = new ArrayList<>();

        // Ingresar datos de la asignatura, profesor, estudiante y encargado
        for (int i = 0; i < numeroAsignaturas; i++) {
            System.out.println("\nIngresar datos para la asignatura " + (i + 1));
            System.out.print("Nombre de la asignatura: ");
            String nombreAsignatura = sc.nextLine();
            System.out.print("Horario de la asignatura: ");
            String horarioAsignatura = sc.nextLine();

            // Crear objeto para asignatura
            Asignatura asignatura = new Asignatura(nombreAsignatura, horarioAsignatura);

            

            // Agregar el horario con los objetos creados
            
        }

        // Mostrar el horario generado
        System.out.println("\nHorario generado:\n");
        for (Horario horario : horarios) {
            System.out.println(horario);
        }
    

    }
    
}
