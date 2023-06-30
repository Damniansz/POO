
package gestionlab;


public class Lab1 extends Laboratorio {
    private String compuestos;

    public Lab1(String nombre, int capacidad, int equipos, String compuestos) {
        super(nombre, capacidad, equipos);
        this.compuestos=compuestos;
    }
    
    public String getCompuestos (){
    return compuestos;
    }
}
