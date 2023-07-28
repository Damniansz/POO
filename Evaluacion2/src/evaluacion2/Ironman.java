package evaluacion2;

public class Ironman extends  Superheroe{// Se hereda la clase superheroe y hereda 3 atributos y 1 metodo
	
	int armadura;// A esta clase se le agrega un nuevo atributo el cual es la armadura, ya que el heroe usa una armadura
	
	public Ironman(String nombre, String sexo, int poder, int armadura) {// Se crea el constructor 
		super(nombre, sexo, poder);
		this.armadura=armadura;
	}
	

	public int getArmadura() {// Se crea los metodos get y set
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}




	@Override
	public void pelea() {// Sobreescribimos en el metodo 
		
		if (armadura > 2   ) {
			 System.out.println("IronMan Puede Derrotar a cualquier enemigo");
		}else {
			System.out.println("IronMan no Puede Derrotar a cualquier enemigo");
			
		}
	}
	
	public void mostrardatos(){// Se muestran los datos 
        System.out.println("Nombre : "+ getNombre());
        System.out.println("Sexo : "+ getSexo());
        System.out.println("Poder : "+ getPoder());
        System.out.println("Armadura : "+ getArmadura());
        
        
    }

	
	
	
	

}
