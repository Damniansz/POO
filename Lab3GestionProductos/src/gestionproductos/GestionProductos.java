
package gestionproductos;

import java.util.Scanner;


public class GestionProductos {

    
    public static void main(String[] args) {
        
        //Importamos la clase scanner para poder registrar la opcion que desea el usuario
        Scanner scanner = new Scanner(System.in);

        //Se crean los obejtos de nuestras clases ProductoEstandar y ProoductoOfertado
        //Estos obejtos se le mandan los datos por parametros
        ProductoEstandar productoEstándar1 = new ProductoEstandar("Lonas", 10.0, "Seccion 1");
        ProductoEstandar productoEstándar2 = new ProductoEstandar("Mochila", 30.0, "Seccion 2");

        ProductoOfertado productoOfertado1 = new ProductoOfertado("Laptop", 200.0, 2);
        ProductoOfertado productoOfertado2 = new ProductoOfertado("Celular", 250.0, 3);
        ProductoOfertado productoOfertado3 = new ProductoOfertado("Pc", 300.0, 4);
        
        //Inicializamos las unidades pedidas en 0 
        int unidadesPedidas = 0;
        // Definimos salir como booleano y lo asiganamos que es falso, esto para que en el ciclo while negar el salir y asi permitir la ejecuccion del menu
        //Si no se lo niega el codigo solo compilara y no mostrara nada del menu
        boolean salir = false;
        while (!salir) {
            //Imprimimos nuestras opciones del menu 
            System.out.println("======= Menu =======");
            System.out.println("1. Ingresar cantidad de unidades pedidas");
            System.out.println("2. Mostrar productos y precios");
            System.out.println("3. Calcular total del pedido");
            System.out.println("4. Salir");
            System.out.println("====================");
            //Ingresamos la opcion que desee el usuario por consola
            System.out.print("Ingrese una opcion: ");
            // definimos a opcion como entero ya que se el menu tendra 4 opciones
            int opcion = scanner.nextInt();
            //Colocamos la opcion por parametro al switch, para la lectura de la opcion del usuario
            switch (opcion) {
                case 1:
                    //Ingresamos la cantidad de unidades pedidas por el usuario
                    //Dependiendo de lo que pidamos se multiplicara por el precio
                    System.out.print("Ingrese la cantidad de unidades pedidas: ");
                    unidadesPedidas = scanner.nextInt();
                    break;
                case 2:
                    //Se obtienen el nombre y precios de lo productos, llamando a sus objetos los cuales estan en el metodo get de las clases ProductoEstandar y ProductoOferta
                    System.out.println("Productos:");
                    System.out.println(productoEstándar1.getNombre() + " - $" + productoEstándar1.getPrecio());
                    System.out.println(productoEstándar2.getNombre() + " - $" + productoEstándar2.getPrecio());
                    System.out.println(productoOfertado1.getNombre() + " - $" + productoOfertado1.getPrecio());
                    System.out.println(productoOfertado2.getNombre() + " - $" + productoOfertado2.getPrecio());
                    System.out.println(productoOfertado3.getNombre() + " - $" + productoOfertado3.getPrecio());
                    break;
                case 3:
                    //El total del pedido se representara en la consola y esto es igual al objeto llamado del metodo precio pedido de las clases
                    double totalPedido = productoEstándar1.obtenerPrecioPedido(unidadesPedidas)
                            + productoEstándar2.obtenerPrecioPedido(unidadesPedidas)
                            + productoOfertado1.obtenerPrecioPedido(unidadesPedidas)
                            + productoOfertado2.obtenerPrecioPedido(unidadesPedidas)
                            + productoOfertado3.obtenerPrecioPedido(unidadesPedidas);
                    System.out.println("Total del pedido: $" + totalPedido);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcinn invalida");
            }

            System.out.println();
        }
    }
}
