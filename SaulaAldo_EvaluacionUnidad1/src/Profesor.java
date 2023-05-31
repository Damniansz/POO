//Definimos atributos de la clase profesor en private
public class Profesor {
	private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String celular;

    public Profesor(String cedula, String nombre, String direccion, String telefono, String celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }
//Metodo get y set, retorna lo ingresado.
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

    public String toString() {
        return "Cédula: " + cedula + ", Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", Celular: " + celular;
    }
}


