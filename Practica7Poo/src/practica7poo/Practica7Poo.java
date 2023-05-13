/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7poo;

/**
 *
 * @author xaldo
 */
public class Practica7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primera Clase
        Carro carro1 = new Carro ();
        carro1.Marca = "Ford";
        carro1.Color = "Negro";
        carro1.Modelo = "Mustang 1967";
        carro1.Placa = "AAA-1111";
        carro1.Precio = 140000;
        System.out.println (carro1.Marca);
        System.out.println (carro1.Color);
        System.out.println (carro1.Modelo);
        System.out.println (carro1.Placa);
        System.out.println (carro1.Precio);
        
        //Segunda Clase
        
        Celular celular1 = new Celular ();
        celular1.Marca = "Iphone";
        celular1.Modelo = "X";
        celular1.Color = "Rosa";
        celular1.Camaras = 2;
        celular1.Precio = 999;
        System.out.println(celular1.Marca );
        System.out.println(celular1.Modelo);
        System.out.println(celular1.Color);
        System.out.println(celular1.Camaras);
        System.out.println(celular1.Precio);
        
        //Tercera Clase
        
        BebidaEnergetica bebidaenergetica1 = new BebidaEnergetica();
        bebidaenergetica1.Marca = "Gatorade";
        bebidaenergetica1.Color = "Azul";
        bebidaenergetica1.Precio = 0.50;
        bebidaenergetica1.Sabor = "Mora Azul";
        bebidaenergetica1.Tamaño = "Mediano";
        System.out.println (bebidaenergetica1.Marca);
        System.out.println (bebidaenergetica1.Color);
        System.out.println (bebidaenergetica1.Precio);
        System.out.println (bebidaenergetica1.Sabor);
        System.out.println (bebidaenergetica1.Tamaño);
        
       
        
        
        
    }
    
}
