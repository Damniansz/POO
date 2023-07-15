/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap_p18_mvc;
import control.Control;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Modelo;
import vista.Vista;
/**
 *
 * @author ESPE
 */
public class AP_P18_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        Modelo mod = new Modelo();
        Vista vis = new Vista ();
        Control cont = new Control (vis, mod);
        
        cont.iniciar();
        vis.setVisible(true);
        
    }
    
}
