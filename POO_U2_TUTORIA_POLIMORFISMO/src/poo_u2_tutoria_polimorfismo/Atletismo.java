/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_tutoria_polimorfismo;

/**
 *
 * @author Usuario
 */
public class Atletismo extends Deportista{
    
    private String prueba;

    public Atletismo(String nombre, int edad, String diciplina, String sexo, String prueba) {
        super(nombre, edad, diciplina, sexo);
        this.prueba=prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }
    
    

    @Override
    public void entrenamiento() {
        System.out.println("El atletismo es un deporte donde se utiliza mucha fuerza");
    }
    
    public void mostrardatos(){
        System.out.println("Nombre : "+ getNombre());
        System.out.println("Edad : "+ getEdad());
        System.out.println("Disciplina : "+ getDisciplina());
        System.out.println("sexo : "+ getSexo());
        System.out.println("Prueba : "+ getPrueba());
    }
    
}
