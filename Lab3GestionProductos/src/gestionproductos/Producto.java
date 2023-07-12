
package gestionproductos;


public class Producto {
    //Definimos los atributos, estos son obligatorios por parte de los requetimientos
    private double precio;
    private String nombre;
    
//Creamos el constructor 
    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
//Se utiliza los metodos get y set
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Obtenemos las unidadespedidas y se lo multiplicamos por el precio de los productos definidos por parametros en el main
    public double obtenerPrecioPedido (int unidadesPedidas){
        return unidadesPedidas*precio;
    
    }
    
}
