
package gestionlab;


public class Lab2 extends Laboratorio {
    private int proyector;
    private String software;
    
    public Lab2(String nombre, int capacidad, int equipos, int proyector, String software) {
        super(nombre, capacidad, equipos);
        this.proyector=proyector;
        this.software=software;
    }
    public int getProyector(){
    return proyector;
    }
    
    public String getSoftware(){
        return software;
    }
}
