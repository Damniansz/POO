/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplostrategy;

/**
 *
 * @author xaldo
 */
public class EjemploStrategy {

    public static void main(String[] args) {
        Contexto contexto = new Contexto(new AntivirusAvanzado());
	contexto.ejecutar();
        
        Contexto contexto1 = new Contexto(new AntivirusSimple());
	contexto1.ejecutar();
    }
}
