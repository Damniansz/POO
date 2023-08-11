/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplostrategy;

/**
 *
 * @author xaldo
 */
public class AntivirusAvanzado extends AnalisisAvanzado{

    @Override
    public void iniciar() {
        System.out.println("Antivirus Avanzado - Analisis simple iniciado");   
    }

    @Override
    public void analizarMemoria() {
        try{
            System.out.println("Analizando Memoria RAM...");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void analizarKeyloggers() {
        try{
            System.out.println("Analizando en busca de Keyloggers....");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void analizarRootKits() {
        try{
            System.out.println("Analizando en busca de RootKits....");
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void descomprimirZip() {
        try{
            System.out.println("Analizando archivos zip...");
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void detener() {
        System.out.println("Antivirus Avanzado - Analisis avanzado finalizado");
    }

}
