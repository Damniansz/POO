
package pruebaescritacorreccion;

public class Videojuego extends Juegos {
    private String plataforma;
    
    public Videojuego(String nombre, int jugador, int duracion, String plataforma) {
        super(nombre, jugador, duracion);
        this.plataforma=plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }
    
    @Override
    public void jugar (){
        System.out.println(" Jugando en" + getPlataforma());
    }
    
}
