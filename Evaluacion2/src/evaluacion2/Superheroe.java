package evaluacion2;

public abstract class Superheroe {
	
	String nombre,sexo;//Se definen los 3 atributos en mi caso usare nombre, sexo y poder del superheroe
	int poder;
	
	public Superheroe(String nombre, String sexo, int poder) {//Se crea el constructor de la clase 
		this.nombre = nombre;
		this.sexo = sexo;
		this.poder = poder;
	}
	public String getNombre() {//Se hace los metodos get y set 
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	public abstract void pelea();// Se crea el metodo abstracto el cual sera pelea que comparara el nivel de poder de los superheroes 
	
	

}
