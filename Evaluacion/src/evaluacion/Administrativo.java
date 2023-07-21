package evaluacion;

import java.util.Scanner;

public class Administrativo extends Personal{//Se llama a la clase padre y se heredan los atributos ya definidos
	public Administrativo(String nombre, double cedula, int edad, double nCelular, String direccion, int nPersonasAcargo, double bono4 ) {
		super(nombre, cedula, edad, nCelular, direccion, bono4);
		this.nPersonasAcargo=nPersonasAcargo;
		this.bono4=bono4;
	}
	int nPersonasAcargo;//Son los nuevos atributos con los que se hara el incentivo, dependiendo el numero a cargo de personas que tiene se le incrementara el sueldo
	double bono4 = 300.00;//Bono4 es estatico y unico para esta clase
	
	//Metodos Get y Set de esta clases los cuales son nPersonasAcargo y bono4
	public int getnPersonasAcargo() {
		return nPersonasAcargo;
	}
	public void setnPersonasAcargo(int nPersonasAcargo) {
		this.nPersonasAcargo = nPersonasAcargo;
	}
	public double getBono4() {
		return bono4;
	}
	public void setBono4(double bono4) {
		this.bono4 = bono4;
	}
	
	
	//Metodo incentivar donde si tienen 25 o mas personas a cargo se le incrementara el sueldo 300$
	@Override
	public double Incentivo() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Programa de Bonificacion. Debe tener 25 o mas personas a su cargo");
		
		System.out.println("Ingrese cuantos personas tiene a cargo para acceder a una bonificacion:");
		nPersonasAcargo=sc.nextInt();
		
		if(nPersonasAcargo>=25) {// Se realiza la operacion donde comprueba si tienen 25 o mas personas a cargos son correctos y procedera a incrementar el sueldo
		this.sueldo = sueldo + bono4;
		System.out.println("Su sueldo incremento a: " + sueldo );
		}else {
			System.out.println("No cumple con los requisitos para la bonificacion");// Este mensaje se muestra si no cumple con los requisitoss
		}
		
		return 0;
	}
	
	
	

}
