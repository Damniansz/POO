
package ejerciciojerarquias;

import java.util.Scanner;




public abstract class Empleado {  
    public String nombre;
    public int edad;
    public double salario;
    private int fechaIngresoDia,fechaIngresoMes,fechaIngresoAnio;
    public static final double BONO = 150.00;

    public Empleado(String nombre, int edad, double salario, int fechaIngresoDia,int fechaIngresoMes,int fechaIngresoAnio) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.fechaIngresoDia = fechaIngresoDia;
        this.fechaIngresoMes = fechaIngresoMes;
        this.fechaIngresoAnio = fechaIngresoAnio;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFechaIngresoDia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Dia:");
        fechaIngresoDia=sc.nextInt();
         if(fechaIngresoDia<=31){
             
        }else{
             System.out.println("No existe ese dia");
             System.exit(0);
        }
        return fechaIngresoDia;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngresoDia = fechaIngreso;
    }

    public int getFechaIngresoMes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Mes:");
        fechaIngresoMes=sc.nextInt();
         if(fechaIngresoMes<=12){ 
        }else{
             System.out.println("No existe ese mes");
             System.exit(0);
        }
        return fechaIngresoMes;
    }

    public void setFechaIngresoMes(int fechaIngresoMes) {
        this.fechaIngresoMes = fechaIngresoMes;
    }

    public int getFechaIngresoAnio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rango de anios permitidos (1900-2023)");
        System.out.println("Ingrese Anio:");
        fechaIngresoAnio=sc.nextInt();
         if(fechaIngresoAnio<=2023 && fechaIngresoAnio>= 1900){
        }else{
             System.out.println("No esta en el rango de Anios");
             System.exit(0);
        }
        return fechaIngresoAnio;
    }

    public void setFechaIngresoAnio(int fechaIngresoAnio) {
        this.fechaIngresoAnio = fechaIngresoAnio;
    }
    
    
    
    public abstract void Incentivar (); 
}
