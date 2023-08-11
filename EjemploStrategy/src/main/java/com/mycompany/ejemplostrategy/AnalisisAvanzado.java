/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplostrategy;

/**
 *
 * @author xaldo
 */
public abstract class AnalisisAvanzado implements Estrategia {
     public abstract void iniciar();

	public abstract void analizarMemoria();

	public abstract void analizarKeyloggers();
	
	public abstract void analizarRootKits();
	
	public abstract void descomprimirZip();	

	public abstract void detener();
        
        @Override
        public void analizar() {
             analizarMemoria();

            analizarKeyloggers();
	
            analizarRootKits();
	
            descomprimirZip();	

            detener();
    }
    
    
    
}
