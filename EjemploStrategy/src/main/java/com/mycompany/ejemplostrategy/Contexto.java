/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplostrategy;

/**
 *
 * @author xaldo
 */
public class Contexto {
    
    private Estrategia estrategia;
	
	public Contexto(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void ejecutar() {
		this.estrategia.analizar();
	}
}
