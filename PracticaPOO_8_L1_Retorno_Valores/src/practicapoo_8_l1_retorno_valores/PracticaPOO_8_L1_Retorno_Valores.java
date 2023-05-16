/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapoo_8_l1_retorno_valores;

import javax.swing.JOptionPane;

/**
 *
 * @author xaldo
 */
public class PracticaPOO_8_L1_Retorno_Valores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Metodo op1=new Metodo();
        //pedimos los numeros para que ingrese el usuario
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
        //vemos que llama las dos variables y eso lo enviamos como argumento el metodo
        
        op1.resultados(op1.sumar(n1, n2));
        // TODO code application logic here
    }
    
}
