
package ejerciciojerarquias;

import java.util.Scanner;




public class Director extends Empleado{
    
    public String departamento;
    private int personal,meses;

    public Director(String nombre, int edad, double salario, int fechaIngresoDia, int fechaIngresoMes, int fechaIngresoAnio, String departamento, int personal, int meses) {
        super(nombre, edad, salario, fechaIngresoDia, fechaIngresoMes, fechaIngresoAnio);
        this.departamento=departamento;
        this.personal=personal;
        this.meses=meses;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    

    @Override
    public void Incentivar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos meses lleva en la empresa:");
        meses=sc.nextInt();
         if(meses>=30 && personal >=20){
           salario = salario +  BONO*2;
             System.out.println("Su salario es de:" + salario);
        }else if(meses>=30 || personal >=20){
           this.salario= salario + BONO;
        System.out.println("Su salario es de:" + salario);
        }else{
        System.out.println("No cumple los requisitos para aumentar su salario, su salario es de: " + salario );
        }
    }
}
