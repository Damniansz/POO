package practicainterface;

public class Cilindro implements Figura,Dibujar,Rotar {
	
	double radio,altura;
	
	


	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	@Override
	public void rotar() {
		System.out.println("Si puede rodar");

	}

	@Override
	public void Dibujar() {
		System.out.println("Si puede dibujar");

		
	}

	@Override
	public double calcularArea() {
		double pi = 3.1416;
		double resultado = 2*pi*radio*altura + 2*pi*radio*radio;
		return resultado;
	}

}
