
package practicasobrecarga;


public class PracticaSobreCarga {

   
    public static void main(String[] args) {
        Persona persona1 = new Persona("Javier",45);
        persona1.jugar();
        
        Persona persona2 = new Persona (1725358004);
        persona2.jugar(" Futbol ");
    }
    
}
