import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        Profesor[] profesores = new Profesor[2];
        Alumno[] alumnos = new Alumno[6];
        Materia[] materias = new Materia[4];
        Matricula[] matriculas = new Matricula[4];

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Profesores");
            System.out.println("2. Alumnos");
            System.out.println("3. Materias");
            System.out.println("4. Gestión Matrículas");
            System.out.println("5. Total Matriculados");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("Ingresar datos de 2 profesores:");

                for (int i = 0; i < 2; i++) {
                    System.out.println("Profesor " + (i + 1) + ":");
                    System.out.print("Cédula: ");
                    String cedula = scanner.next();
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Dirección: ");
                    String direccion = scanner.next();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.next();
                    System.out.print("Celular: ");
                    String celular = scanner.next();

                    profesores[i] = new Profesor(cedula, nombre, direccion, telefono, celular);
                }

                break;

            case 2:
                System.out.println("Ingresar datos de 6 alumnos:");

                for (int i = 0; i < 6; i++) {
                    System.out.println("Alumno " + (i + 1) + ":");
                    System.out.print("Cédula: ");
                    String cedula = scanner.next();
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Dirección: ");
                    String direccion = scanner.next();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.next();
                    System.out.print("Celular: ");
                    String celular = scanner.next();

                    alumnos[i] = new Alumno(cedula, nombre, direccion, telefono, celular, celular);
                }

                break;

            case 3:
                System.out.println("Ingresar datos de 4 materias:");

                for (int i = 0; i < 4; i++) {
                    System.out.println("Materia " + (i + 1) + ":");
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.println("Profesor:");
                    System.out.print("Cédula: ");
                    String cedula = scanner.next();

                    Profesor profesor = null;
                    for (Profesor p : profesores) {
                        if (p.getCedula().equals(cedula)) {
                            profesor = p;
                            break;
                        }
                    }

                    materias[i] = new Materia(nombre, profesor);
                }

                break;

            case 4:
                System.out.println("Ingresar datos de 4 matrículas:");

                for (int i = 0; i < 4; i++) {
                    System.out.println("Matrícula " + (i + 1) + ":");
                    System.out.println("Profesor:");
                    System.out.print("Cédula: ");
                    String cedulaProfesor = scanner.next();
                    System.out.println("Alumno:");
                    System.out.print("Cédula: ");
                    String cedulaAlumno = scanner.next();
                    System.out.print("Materia: ");
                    String materia = scanner.next();

                    Profesor profesor = null;
                    Alumno alumno = null;
                    Materia mat = null;

                    for (Profesor p : profesores) {
                        if (p.getCedula().equals(cedulaProfesor)) {
                            profesor = p;
                            break;
                        }
                    }

                    for (Alumno a : alumnos) {
                        if (a.getCedula().equals(cedulaAlumno)) {
                            alumno = a;
                            break;
                        }
                    }

                    for (Materia m : materias) {
                        if (m.getNombre().equals(materia)) {
                            mat = m;
                            break;
                        }
                    }
                    
                    for (Materia m : materias) {
                        if (m.getNombre().equals(materia)) {
                            mat = m;
                            break;
                        }
                    }

                    matriculas[i] = new Matricula(profesor, alumno, mat);
                }

                break;

            case 5:
            	int totalMatriculados = 0;
                int totalHombres = 0;
                int totalMujeres = 0;

                for (Matricula matricula : matriculas) {
                    if (matricula != null) {
                        totalMatriculados++;
                        Alumno alumno = matricula.getAlumno();
                        if (alumno.getGenero().equals("Hombre")) {
                            totalHombres++;
                        } else if (alumno.getGenero().equals("Mujer")) {
                            totalMujeres++;
                        }
                    }
                }

                System.out.println("Total matriculados por curso: " + totalMatriculados);
                System.out.println("Total de hombres: " + totalHombres);
                System.out.println("Total de mujeres: " + totalMujeres);

                break;
                
            case 6:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
    } while (opcion != 6);

    scanner.close();
}
}
                
                
        	                        
		                        
		    
		    	
		            
		        
		    

