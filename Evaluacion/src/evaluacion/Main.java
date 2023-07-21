package evaluacion;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre,direccion;
		double cedula,nCelular,sueldo = 450.00, bono1=250.00,bono2=150.00,bono3=100.00,bono4=300.00 ;
		int edad,nivel=0, nPersonasAcargo=0,mTrabajados=0,nAniosTrabajados=0;
		
		System.out.println("Eliga que tipo de personal es usted:");
		System.out.println("1.Docente");
		System.out.println("2.Tecnico");
		System.out.println("3.Limpieza");
		System.out.println("4.Administrativo");
		
		int opc=sc.nextInt();
		
		switch(opc) {
		
		case 1:
			System.out.println("Ingrese nombre:");
            nombre = sc.next();
            System.out.println("Ingrese numero de cedula:");
            cedula = sc.nextDouble();
            System.out.println("Ingrese su edad:");
            edad = sc.nextInt();
            System.out.println("Ingrese su numero celular: ");
            nCelular = sc.nextDouble();
            System.out.println("Ingrese su direccion:");
            direccion = sc.next();
            Docente docente = new Docente(nombre, cedula, edad, nCelular, direccion, sueldo, nAniosTrabajados, bono1);

			docente.Incentivo();
			break;
		case 2:
			System.out.println("Ingrese nombre:");
			nombre=sc.next();
			System.out.println("Ingrese numero de cedula:");
			cedula=sc.nextDouble();
			System.out.println("Ingrese su edad:");
			edad=sc.nextInt();
			System.out.println("Ingrese su numero celular: ");
			nCelular=sc.nextDouble();
			System.out.println("Ingrese su direccion:");
			direccion=sc.next();
			Tecnico tecnico = new Tecnico(nombre,  cedula, edad,  nCelular, direccion, nivel,bono2);
			tecnico.Incentivo();

			break;
		case 3:
			System.out.println("Ingrese nombre:");
			nombre=sc.next();
			System.out.println("Ingrese numero de cedula:");
			cedula=sc.nextDouble();
			System.out.println("Ingrese su edad:");
			edad=sc.nextInt();
			System.out.println("Ingrese su numero celular: ");
			nCelular=sc.nextDouble();
			System.out.println("Ingrese su direccion:");
			direccion=sc.next();
			Limpieza limpieza = new Limpieza( nombre, cedula, edad, nCelular, direccion, mTrabajados, bono3);
			limpieza.Incentivo();

			break;
		case 4:
			System.out.println("Ingrese nombre:");
			nombre=sc.next();
			System.out.println("Ingrese numero de cedula:");
			cedula=sc.nextDouble();
			System.out.println("Ingrese su edad:");
			edad=sc.nextInt();
			System.out.println("Ingrese su numero celular: ");
			nCelular=sc.nextDouble();
			System.out.println("Ingrese su direccion:");
			direccion=sc.next();
			Administrativo admin = new Administrativo(nombre, cedula, edad,  nCelular, direccion, nPersonasAcargo, bono4);
			admin.Incentivo();

			break;
		
		}
		
	

		

	}

}
