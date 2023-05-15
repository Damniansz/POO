/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica8poo_metodos_parametros;

/**
 *
 * @author ESPE
 */
public class Operaciones {
    //cuando se declara fuera de los metodos las variables son globales
    //cuando se las declara dentro del metodo las variables son locales
    //int nu1;
    //int nu2;
    int suma; 
    int resta;
    int multi;
    int div;
    //generamos metodos
    
    //El metodo es publico
    
    //Creamos metodos para sumar numeros tipo public, sin retornar nada void no tiene retorno
    //Metodo sumar
    
    public void sumar(int nu1, int nu2){
        suma=nu1+nu2;
    }
    
    //creamos un metodo para mostrar resultados
    public void resultados (){
        System.out.println("Resultado de la suma es:"+suma);
    }
    
}
