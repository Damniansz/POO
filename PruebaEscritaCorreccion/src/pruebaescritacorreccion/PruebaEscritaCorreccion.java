
package pruebaescritacorreccion;


public class PruebaEscritaCorreccion {

    
    public static void main(String[] args) {
        
        //Se crean los objetos 
        Juegos juegos1 = new Juegos("Futbol", 11, 90);
        Videojuego videojuego1 = new Videojuego("Gta V ", 1, 60, " PS4 ");       
        Juegodemesa juegodemesa1 = new Juegodemesa("Ajedrez ", 3, 45, 10);
        
        System.out.println(" Nombre del juego: " + juegos1.getNombre());
        System.out.println(" Numero de jugadores : " + juegos1.getJugador());
        System.out.println(" Duracion: " + juegos1.getDuracion() + " minutos ");
        juegos1.jugar();
        
        System.out.println(" Nombre del juego: " + videojuego1.getNombre());
        System.out.println(" Numero de jugadores : " + videojuego1.getJugador());
        System.out.println(" Duracion: " + videojuego1.getDuracion() + " minutos ");
        videojuego1.jugar();
        
        System.out.println(" Nombre del juego: " + juegodemesa1.getNombre());
        System.out.println(" Numero de jugadores : " + juegodemesa1.getJugador());
        System.out.println(" Duracion: " + juegodemesa1.getDuracion() + " minutos ");
        juegodemesa1.jugar();
        
        
        
    }
    
}
