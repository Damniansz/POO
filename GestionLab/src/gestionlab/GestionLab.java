
package gestionlab;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GestionLab {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);// Se crea un objeto Scanner para leer la entrada del usuario.

        System.out.print("Ingrese el numero de laboratorios: ");
        int numLaboratorios = scanner.nextInt();// Se lee el número de laboratorios ingresado por el usuario.
        scanner.nextLine();// Se consume el salto de línea pendiente.

        List<Laboratorio> laboratorios = new ArrayList<>();// Se crea una lista para almacenar los laboratorios.

        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("\nLaboratorio " + (i + 1));
            System.out.print("Ingrese el nombre del laboratorio: ");
            String nombre = scanner.nextLine();// Se lee el nombre del laboratorio ingresado por el usuario.

            System.out.print("Ingrese la capacidad del laboratorio: ");
            int capacidad = scanner.nextInt();// Se lee la capacidad del laboratorio ingresada por el usuario.
            scanner.nextLine();// Se consume el salto de línea pendiente.

            System.out.print("Ingrese la cantidad de equipos del laboratorio: ");
            int equipos = scanner.nextInt();// Se lee la cantidad de equipos del laboratorio ingresada por el usuario.
            scanner.nextLine();// Se consume el salto de línea pendiente.

            Laboratorio laboratorio;

            System.out.print("Ingrese el tipo de laboratorio (1 o 2): ");
            int tipo = scanner.nextInt(); // Se lee el tipo de laboratorio ingresado por el usuario
            scanner.nextLine();// Se consume el salto de línea pendiente.

            if (tipo == 1) {
                System.out.print("Ingrese los compuestos del laboratorio: ");
                String compuestos = scanner.nextLine();// Se leen los compuestos del laboratorio ingresados por el usuario.
                laboratorio = new Lab1(nombre, capacidad, equipos, compuestos);// Se crea un objeto Lab1 y se asigna a la variable laboratorio.
            } else {
                System.out.print("Ingrese la cantidad de proyectores del laboratorio: ");
                int proyector = scanner.nextInt();// Se lee la cantidad de proyectores del laboratorio ingresada por el usuario.
                scanner.nextLine();// Se consume el salto de línea pendiente.

                System.out.print("Ingrese el software del laboratorio: ");
                String software = scanner.nextLine();// Se lee el software del laboratorio ingresado por el usuario.    
                laboratorio = new Lab2(nombre, capacidad, equipos, proyector, software);// Se crea un objeto Lab2 y se asigna a la variable laboratorio.
            }

            System.out.print("Ingrese el encargado del laboratorio: ");
            String encargado = scanner.nextLine();// Se lee el encargado del laboratorio ingresado por el usuario.
            laboratorio.setEncargado(encargado);// Se establece el encargado del laboratorio.

            laboratorios.add(laboratorio);// Se agrega el laboratorio a la lista de laboratorios.
        }

        System.out.print("\nIngrese el numero de asignaturas: ");
        int numAsignaturas = scanner.nextInt();// Se lee el número de asignaturas ingresado por el usuario.
        scanner.nextLine();// Se consume el salto de línea pendiente

        List<Asignatura> asignaturas = new ArrayList<>();// Se crea una lista para almacenar las asignaturas

        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("\nAsignatura " + (i + 1));
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nombre = scanner.nextLine();// Se lee el nombre de la asignatura ingresado por el usuario

            System.out.print("Ingrese el horario de la asignatura: ");
            String horario = scanner.nextLine();// Se lee el horario de la asignatura ingresado por el usuario

            System.out.println("Laboratorios disponibles:");
            for (int j = 0; j < laboratorios.size(); j++) {
                Laboratorio laboratorio = laboratorios.get(j);
                System.out.println(j + 1 + ". " + laboratorio.getNombre());// Se muestra el nombre de cada laboratorio disponible.
            }

            System.out.print("Seleccione el laboratorio asignado (1-" + laboratorios.size() + "): ");
            int laboratorioIndex = scanner.nextInt();// Se lee el índice del laboratorio asignado ingresado por el usuario.
            scanner.nextLine();// Se consume el salto de línea pendiente.

            Laboratorio laboratorioAsignado = laboratorios.get(laboratorioIndex - 1);// Se obtiene el laboratorio asignado.

            Asignatura asignatura = new Asignatura(nombre, horario, laboratorioAsignado);// Se crea un objeto Asignatura.
            asignaturas.add(asignatura);// Se agrega la asignatura a la lista de asignaturas
        }

        System.out.println("\nInformación de los laboratorios:");
        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("\nNombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());
            System.out.println("Equipos: " + laboratorio.getEquipos());
            System.out.println("Encargado: " + laboratorio.getEncargado());

            if (laboratorio instanceof Lab1) {
                Lab1 lab1 = (Lab1) laboratorio;
                System.out.println("Compuestos: " + lab1.getCompuestos());
            } else if (laboratorio instanceof Lab2) {
                Lab2 lab2 = (Lab2) laboratorio;
                System.out.println("Proyector: " + lab2.getProyector());
                System.out.println("Software: " + lab2.getSoftware());
            }

            System.out.println("Asignaturas asignadas:");
            for (Asignatura asignatura : asignaturas) {
                if (asignatura.getLaboratorio().equals(laboratorio)) {
                    System.out.println("Nombre: " + asignatura.getNombre());
                    System.out.println("Horario: " + asignatura.getHorario());
                }
            }
        }
    }
}
    
