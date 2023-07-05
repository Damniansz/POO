
package pruebaescritacorreccion;

public class Juegodemesa extends Juegos{
    private int edadMinima;
    
    public Juegodemesa(String nombre, int jugador, int duracion, int edadMinima) {
        super(nombre, jugador, duracion);
        this.edadMinima=edadMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
    
    @Override
    public void jugar(){
        System.out.println("Edad minima para poder jugar: " + getEdadMinima() + "anos");
    }
    
}
