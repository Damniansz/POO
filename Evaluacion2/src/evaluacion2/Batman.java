package evaluacion2;

public class Batman extends Superheroe{// Se hereda la clase superheroe y hereda 3 atributos y 1 metodo
	
	int dinero;// A esta clase se le agrega un nuevo atributo el cual es el dinero , ya que el heroe usa dinero como su principal fuente de poder
	
	
	public Batman(String nombre, String sexo, int poder, int dinero) {// Se crea el constructor 
		super(nombre, sexo, poder);
		this.dinero=dinero;
	}
	
	
	public int getDinero() {// Se crean los metodos get y set 
		return dinero;
	}



	public void setDinero(int dinero) {
		this.dinero = dinero;
	}



	@Override
	public void pelea() {
		
		if (dinero > 5000.00   ) {
			 System.out.println("Batman Puede Derrotar a cualquier enemigo");
		}else {
			System.out.println("Batman no Puede Derrotar a cualquier enemigo");
			
		}
		
	}
	
	public void mostrardatos(){// Se muestran los datos 
        System.out.println("Nombre : "+ getNombre());
        System.out.println("Sexo : "+ getSexo());
        System.out.println("Poder : "+ getPoder());
        System.out.println("Dinero: "+ getDinero());
	
}
	
}
