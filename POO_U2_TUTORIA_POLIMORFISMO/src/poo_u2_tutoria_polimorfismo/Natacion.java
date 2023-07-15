
package poo_u2_tutoria_polimorfismo;

/**
 *
 * @author Usuario
 */
public class Natacion extends Deportista{
    private String estilo;

    public Natacion(String nombre, int edad, String diciplina, String sexo,String estilo) {
        super(nombre, edad, diciplina, sexo);
        this.estilo=estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void entrenamiento() {
       System.out.println("La natacion es un deporte donde se trabaja demasiado los musculos ");
       
    }
    
       public void mostrardatos(){
        System.out.println("Nombre : "+ getNombre());
        System.out.println("Edad : "+ getEdad());
        System.out.println("Disciplina : "+ getDisciplina());
        System.out.println("sexo : "+ getSexo());
        System.out.println("Estilo: "+ getEstilo());
    }
    
}
