package evaluacion;
import java.util.Scanner;

public class Docente extends Personal {//Se llama a la clase padre y se heredan los atributos ya definidos
	public Docente(String nombre, double cedula, int edad, double nCelular, String direccion,double sueldo,int nAniosTrabajados, double bono1) {
		super(nombre, cedula, edad, nCelular, direccion,sueldo);
		this.nAniosTrabajados=nAniosTrabajados;
		this.bono1=bono1;
	}

	int nAniosTrabajados;//Son los nuevos atributos con los que se hara el incentivo
	double bono1=250.00;//Bono1 es estatico y unico para esta clase

	//Metodos Get y Set
	public int getnAniosTrabajados() {
		return nAniosTrabajados;
	}

	public void setnAniosTrabajados(int nAniosTrabajados) {
		this.nAniosTrabajados = nAniosTrabajados;
	}
	

	
	
   //Metodo incentivar donde si cumple ciertos años se le subira el sueldo con un bono el cual definimos en 250$ 
	@Override
	public double Incentivo() {
		Scanner sc = new Scanner (System.in);//LLamamos a la clase Scanner 
		System.out.println("Programa de Bonificacion. Debe tener mas de 7 años trabajando");
		System.out.println("Ingrese cuantos años a trabajado para accerder a una bonificacion:");
		nAniosTrabajados=sc.nextInt();
		
		if(nAniosTrabajados>=7) {//Si el numero de años ingresado por consola es mayor o igual a 7, se le aumentara el sueldo
		this.sueldo = sueldo + bono1;
		System.out.println("Su sueldo incremento a: " + sueldo );
		}else {
			System.out.println("No cumple con los requisitos para la bonificacion");//Si no, mostrara el siguiente mensaje
		}
				
		return sueldo;
	}
	
	
	
	


}
