/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplostrategy;

/**
 *
 * @author xaldo
 */
public class AntivirusSimple extends AnalisisSimple{

    @Override
    public void iniciar() {
        System.out.println("Antivirus Simple - Analisis simple iniciado");
    }

    @Override
    public void saltarZip() {
        try{
            System.out.println("Analizando ...");
            Thread.sleep(2500);
            System.out.println("No se pudo analizar archivos '.zip'");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void detener() {
        System.out.println("Antivirus Simple - Analisis simple finalizado");
    }
    
}
