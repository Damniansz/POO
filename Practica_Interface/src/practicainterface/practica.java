package practicainterface;
import java.util.*;

public class practica {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Elige una figura");
		System.out.println("1.Circulo");
		System.out.println("2.Cuadrado");
		System.out.println("3.Cilindro");
		
		int opc = sc.nextInt();
		
		switch (opc) {
		
		case 1:
			System.out.println("Ingresar el radio del circulo");
			double radioCirculo = sc.nextDouble();
			Circulo circulo = new Circulo (radioCirculo);
			double areaCirculo = circulo.calcularArea();
			System.out.println("El area del circulo es"+ areaCirculo);
			break;
			
			
		case 2:
			System.out.println("Ingresar el lado del cuadrado");
			double ladoCuadrado = sc.nextDouble();
			Cuadrado cuadrado = new Cuadrado (ladoCuadrado);
			double areaCuadrado = cuadrado.calcularArea();
			System.out.println("El area del cuadrado es "+ areaCuadrado);
			break;
			
		case 3:
			System.out.println("Ingresar el radio del cilindro");
			double radioCilindro = sc.nextDouble();
			System.out.println("Ingresar la altura del cilindro");
			double alturaCilindro=sc.nextDouble();
			Cilindro cilindro = new Cilindro (radioCilindro, alturaCilindro);
			double areaCilindro = cilindro.calcularArea();
			System.out.println("El area del cilindro es"+ areaCilindro);
			break;
		
		default:
			System.out.println("Opcion incorrecta");
		
		
		}


	}

}
