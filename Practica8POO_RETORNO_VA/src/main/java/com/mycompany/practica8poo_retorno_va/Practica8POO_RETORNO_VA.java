/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica8poo_retorno_va;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Practica8POO_RETORNO_VA {

    public static void main(String[] args) {
        Operacion op1 = new Operacion ();
        //Pedimos los numeros , se le pide al usuario que ingrese numeros
        
        int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
        int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
        op1.resultados(op1,sumar(nu1,nu2));
        
        //LLamada a las dos variables
    }
}
