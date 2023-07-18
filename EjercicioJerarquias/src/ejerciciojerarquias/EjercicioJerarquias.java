
package ejerciciojerarquias;

import java.util.Scanner;


public class EjercicioJerarquias {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad,fechaIngresoDia=0,fechaIngresoMes = 0,fechaIngresoAnio=0, nivel=0, meses=0;
        double salario,BONO = 150.00;
        
        int opc;
        
        System.out.println("=== ELEGIR UNA OPCION ===");
        System.out.println("1.Director");
        System.out.println("2.Operario");
        
        opc=sc.nextInt();
        
        switch(opc){
            case 1:
                
                System.out.println("=== INGRESAR DATOS ===");
                System.out.println("Ingresar Nombre:");
                sc.nextLine();
                nombre=sc.nextLine();
                System.out.println("Ingresar Edad: ");
                edad=sc.nextInt();
                System.out.println("Ingresar Salario:");
                salario=sc.nextDouble();
                System.out.println("Ingresar Departamento:");
                String departamento = sc.next();
                System.out.println("Ingresar numero del Personal: ");
                int personal = sc.nextInt();
                Director director = new Director(nombre,edad,salario,fechaIngresoDia,fechaIngresoMes,fechaIngresoAnio,departamento,personal,meses);
                System.out.println("---Ingresar Fecha de Ingreso---");
                director.getFechaIngresoDia();
                director.getFechaIngresoMes();
                director.getFechaIngresoAnio();
                System.out.println("---Incentivo---");
                director.Incentivar();
                break;
            case 2:
                System.out.println("=== INGRESAR DATOS ===");
                System.out.println("Ingresar Nombre:");
                sc.nextLine();
                nombre=sc.nextLine();
                System.out.println("Ingresar Edad: ");
                edad=sc.nextInt();
                System.out.println("Ingresar Salario:");
                salario=sc.nextDouble();
                Operario operario = new Operario(nombre,edad,salario,fechaIngresoDia,fechaIngresoMes,fechaIngresoAnio,nivel);
                operario.getNivel();
                System.out.println("---Ingresar Fecha de Ingreso---");
                operario.getFechaIngresoDia();
                operario.getFechaIngresoMes();
                operario.getFechaIngresoAnio();
                System.out.println("---Incentivo---");
                operario.Incentivar();
                operario.actualizarNivel();
                break;
        }
        


    }
    
}
