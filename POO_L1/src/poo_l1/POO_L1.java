/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_l1;

import javax.swing.JOptionPane;

/**
 *
 * @author xaldo
 */
public class POO_L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ope ope1 = new Ope ();
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
        
        ope1.resultados(n1+n2, n1-n2, n1*n2, n1/n2);
        
        
        
    }
    
}
