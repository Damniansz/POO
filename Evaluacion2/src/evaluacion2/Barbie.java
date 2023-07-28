package evaluacion2;

public class Barbie extends Superheroe {
	
	int cartera;
	
	public Barbie(String nombre, String sexo, int poder, int cartera) {
		super(nombre, sexo, poder);
		this.cartera=cartera;
	}
	
	

	public int getCartera() {
		return cartera;
	}



	public void setCartera(int cartera) {
		this.cartera = cartera;
	}



	@Override
	public void pelea() {
		
		if (cartera > 2   ) {
			 System.out.println("Barbie Puede Derrotar a cualquier enemigo");
		}else {
			System.out.println("Barbie no Puede Derrotar a cualquier enemigo");
			
		}
	
	}
	
	public void mostrardatos(){// Se muestran los datos 
        System.out.println("Nombre : "+ getNombre());
        System.out.println("Sexo : "+ getSexo());
        System.out.println("Poder : "+ getPoder());
        System.out.println("Cartera: "+ getCartera());
	
	}
}
