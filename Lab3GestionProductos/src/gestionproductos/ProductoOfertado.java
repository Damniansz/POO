
package gestionproductos;


public class ProductoOfertado extends Producto{
    private int días;
        //Definimos los atributos, estos son obligatorios por parte de los requetimientos

    public ProductoOfertado(String nombre, double precio, int días) {
        super(precio, nombre);
        this.días = días;
    }

   
    //Se ua solo get ya que solo vamos a pedir los dias 

    public int getDías() {
        return días;
    }

    public void setDías(int días) {
        this.días = días;
    }
//Dependiendo de los dias con el if se aplicaran el 20,15,10 de descuento
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        if (días == 1) {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.8; // Aplica un 20% de descuento
        } else if (días == 2 || días == 3) {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.85; // Aplica un 15% de descuento
        } else {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.9; // Aplica un 10% de descuento
        }
    }
    
}
