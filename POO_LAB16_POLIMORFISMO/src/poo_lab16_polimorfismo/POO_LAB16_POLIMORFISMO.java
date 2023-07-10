
package poo_lab16_polimorfismo;


public class POO_LAB16_POLIMORFISMO {

    
    public static void main(String[] args) {
        //Llamando al metodo mostrar
        
        mostrarDatosFigura(new Triangulo(4,5,"Amarillo"));
        mostrarDatosFigura(new Circulo(5,"Azul"));
        mostrarDatosFigura(new Cuadrado (6," Rojo"));
        
    }
    
    //Aplicando Polimorfismo
    //La gran ventaja del polimorfismo es la reutilizacion
    //De codigo, al forzar a todas las clases a tener el mismo formato de metodo
    //Esta expresion vale para cualquier subclase de figura
    //Cuyos objetos vengan aqui como parametros
    
    private static void mostrarDatosFigura(Figura f){
        System.out.println( " Color: " + f.getColor());
        System.out.println(" Superficie: " + f.superficie());
    
    }

    
}
