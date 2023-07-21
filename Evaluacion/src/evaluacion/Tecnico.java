package evaluacion;

import java.util.Scanner;

public class Tecnico extends Personal {//Se llama a la clase padre y se heredan los atributos ya definidos
	public Tecnico(String nombre, double cedula, int edad, double nCelular, String direccion, int nivel, double bono2) {
		super(nombre, cedula, edad, nCelular, direccion, bono2);
		this.nivel=nivel;
		this.bono2=bono2;
	}
	
	int nivel;//Son los nuevos atributos con los que se hara el incentivo, dependiendo el nivel en el que se encuentre el tecnico
	double bono2=150.00;//Bono2 es estatico y unico para esta clase
	public int getNivel() {
		return nivel;
	}
	//Metodos Get y set de esta clase los cuales son nivel y bono2
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public double getBono2() {
		return bono2;
	}
	public void setBono2(double bono2) {
		this.bono2 = bono2;
	}
	
	//Metodo incentivar donde si cumple con el nivel en este caso debe ser igual o mayor a 5 se le aumentara 150 $
	@Override
	public double Incentivo() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa de Bonificacion. Debe tener un nivel mayor o igual a 5 ");
		System.out.println("Ingrese que nivel es usted para accerder a una bonificacion:");
		nivel=sc.nextInt();
		
		if(nivel>=5) {// Se realiza la operacion donde comprueba si el nivel ingresado es el que se requiere para acceder al incentivo
		this.sueldo = sueldo + bono2;
		System.out.println("Su sueldo incremento a: " + sueldo );
		}else {
			System.out.println("No cumple con los requisitos para la bonificacion");// Este mensaje se muestra si no cumple con los requisitos
		}
		
		return 0;
	}
	
	

}
