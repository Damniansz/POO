package practicainterface;

public class Circulo implements Figura,Rotar, Dibujar {
	double r;
	
	public Circulo(double r) {
		this.r=r;
	}

	@Override
	public void rotar() {
		System.out.println("Si puede rodar");
	}

	@Override
	public double calcularArea() {
		double pi=3.1416;
		double resultado= pi*r*r;
		return resultado;
	}

	@Override
	public void Dibujar() {
		System.out.println("Si se puede dibujar");
		
	}

}
