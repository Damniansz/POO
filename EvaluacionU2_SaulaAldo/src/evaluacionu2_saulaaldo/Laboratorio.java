
package evaluacionu2_saulaaldo;

import java.util.Scanner;


public class Laboratorio {
    String carrera,curso;

    public Laboratorio() {
        this.carrera = carrera;
        this.curso = curso;
    }

    public String getCarrera() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese Laboratorio de la carrera (Itin): ");
        String carrera = sc.next();

        if (!carrera.equalsIgnoreCase("Itin")) {
            System.out.println("Esa carrera no existe");
            System.exit(0);
        }
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCurso() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el curso: ");
        String curso = sc.next();
        
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    
}
