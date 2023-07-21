package evaluacion;

public abstract class Personal {
	private String nombre;//Se definen atributos de la clase padre, son 5 de acuerdo al problema planteado por el docente
	private double cedula;
	private int edad;
	private double nCelular;
	private String direccion;
	
	public static double sueldo = 450.00;
	
	
	public Personal(String nombre, double cedula, int edad, double nCelular, String direccion, double sueldo) {// Se crea el constructor de la clase padre 
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.nCelular = nCelular;
		this.direccion = direccion;
		this.sueldo=sueldo;
		
	}
	
	
	//Metodos Get y Set de los atributos
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getCedula() {
		return cedula;
	}



	public void setCedula(double cedula) {
		this.cedula = cedula;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getnCelular() {
		return nCelular;
	}



	public void setnCelular(double nCelular) {
		this.nCelular = nCelular;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	


	
	public static double getSueldo() {
		return sueldo;
	}


    //Metodo que se redefinara en cada clase, de acuerdo a su nuevo atributo
	public abstract double Incentivo();
	

}
