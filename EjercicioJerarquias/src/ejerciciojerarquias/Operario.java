
package ejerciciojerarquias;

import java.util.Scanner;


public class Operario extends Empleado {
    public int nivel,anios;

    public Operario(String nombre, int edad, double salario, int fechaIngresoDia, int fechaIngresoMes, int fechaIngresoAnio, int nivel) {
        super(nombre, edad, salario, fechaIngresoDia, fechaIngresoMes, fechaIngresoAnio);
        this.nivel=nivel;
    }

    

    public int getNivel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nivel (1-5):");
        nivel=sc.nextInt();
         if(nivel<=5 && nivel>=1){
             
        }else{
             System.out.println("No existe ese nivel");
             System.exit(0);
        }
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    

    @Override
    public void Incentivar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos anios lleva en la empresa:");
        anios=sc.nextInt();
         if(anios>=30 && nivel >=2){
           salario = salario +  BONO*2;
             System.out.println("Su salario es de:" + salario);
        }else if(anios>=30 || nivel >=2){
           this.salario= salario + BONO;
        System.out.println("Su salario es de:" + salario);
        }else{
        System.out.println("No cumple los requisitos para aumentar su salario, su salario es de: " + salario );
        }    
    }
    public void actualizarNivel() {
        if (anios >= 2 && nivel < 5) {
            nivel++;
            System.out.println("Nivel actualizado a: " + nivel);
        } else {
            System.out.println("No se actualizo el nivel.");
        }
    }
    
}
