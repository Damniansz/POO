/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplostrategy;

/**
 *
 * @author xaldo
 */
public abstract class AnalisisSimple implements Estrategia {
    
        public abstract void iniciar();

	public abstract void saltarZip();

	public abstract void detener();

    @Override
    public void analizar() {
        iniciar();
	saltarZip();
	detener();
    }
    
}
