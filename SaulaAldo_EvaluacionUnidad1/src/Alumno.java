public class Alumno {
	private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String celular; 
    private String genero;
    //definimos los atributos de la clase alumno

    public Alumno(String cedula, String nombre, String direccion, String telefono, String celular, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.genero = genero;
    }
    //Metodo de la clase, se usa get y set

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getGenero() {
        return genero;
    }

    public String toString() {
        return "Cédula: " + cedula + ", Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", Celular: " + celular;
    }

}
