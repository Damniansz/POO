package evaluacion;

import java.util.Scanner;

public class Limpieza extends Personal {//Se llama a la clase padre y se heredan los atributos ya definidos
	public Limpieza(String nombre, double cedula, int edad, double nCelular, String direccion, int mTrabajados, double bono3) {
		super(nombre, cedula, edad, nCelular, direccion, bono3);
		this.mTrabajados=mTrabajados;
		this.bono3=bono3;
	}


	int mTrabajados;//Son los nuevos atributos con los que se hara el incentivo, dependiendo los meses trabajados se le incrementara el sueldo
	double bono3= 100.00;//Bono3 es estatico y unico para esta clase
	
	
	//Metodos Get y set de esta clase los cuales son mTrabajdos y bono3
	public int getmTrabajados() {
		return mTrabajados;
	}



	public void setmTrabajados(int mTrabajados) {
		this.mTrabajados = mTrabajados;
	}



	public double getBono3() {
		return bono3;
	}



	public void setBono3(double bono3) {
		this.bono3 = bono3;
	}


	//Metodo incentivar donde si cumple los meses trabajados que se requieren el sueldo se le aumentara 100$

	@Override
	public double Incentivo() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Programa de Bonificacion. Debe tener 5 o mas meses trabajando");
		
		System.out.println("Ingrese cuantos meses a trabajado para accerder a una bonificacion:");
		mTrabajados=sc.nextInt();
		
		if(mTrabajados>=5) {// Se realiza la operacion donde comprueba si los meses trabajados son correctos y procedera a incrementar el sueldo
		this.sueldo = sueldo + bono3;
		System.out.println("Su sueldo incremento a: " + sueldo );
		}else {
			System.out.println("No cumple con los requisitos para la bonificacion");// Este mensaje se muestra si no cumple con los requisitos
		}
		return 0;
	}
	
	

}
