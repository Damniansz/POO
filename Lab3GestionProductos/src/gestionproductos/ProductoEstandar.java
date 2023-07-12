
package gestionproductos;


public class ProductoEstandar extends Producto{
        //Definimos los atributos, estos son obligatorios por parte de los requetimientos

    private String seccion;
//Creamos el constructor 

    public ProductoEstandar(String seccion, double precio, String nombre) {
        super(precio, nombre);
        this.seccion = seccion;
    }

    //Se ua solo get ya que solo vamos a pedir las secciones 

    public String getSección() {
        return seccion;
    }

    public void setSección(String sección) {
        this.seccion = sección;
    }
//Si unidadesPedidas >= 5 tendremos un descuento del 10 por cietno
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        if (unidadesPedidas >= 5) {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.9; // Aplica un 10% de descuento
        } else {
            return super.obtenerPrecioPedido(unidadesPedidas);
        }
    }
}
