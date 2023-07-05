
package pruebaescritacorreccion;

public class Juegos {
    private String nombre;
    private int jugador;
    private int duracion;

    public Juegos(String nombre, int jugador, int duracion) {
        this.nombre = nombre;
        this.jugador = jugador;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getJugador() {
        return jugador;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public void jugar (){
        System.out.println(" Jugando en la cancha" );
    }
    
}
