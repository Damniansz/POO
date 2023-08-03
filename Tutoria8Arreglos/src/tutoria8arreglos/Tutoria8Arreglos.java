/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoria8arreglos;

import java.util.Scanner;

/**
 *
 * @author xaldo
 */
public class Tutoria8Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("Menu de Arreglos");
            System.out.println("1. Registro de datos");
            System.out.println("2. Ingreso de numeros");
            System.out.println("3.Salir");
            opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    registroDatos();
                    break;
                    
                case 2:
                    ingresoNumeros();
                    break;
                    
                case 3:
                    System.out.println("Finalizando el programa");
                    break;
                    
                default:
                    System.out.println("Opcion Incorrecta");
                    
            
            }
        }while(opcion !=3);
    }
    
    static void registroDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que se va a registrar");
        int canPersonas=leer.nextInt();
        //Creamos arreglos para el ingreso de datos como nombres,edades,direcciones
        String [] nombres = new String [canPersonas];
        int [] edades = new int [canPersonas];
        String [] direcciones = new String [canPersonas];
        
        for(int i=0; i<canPersonas ; i++){
            System.out.println("-> Personas"+(i+1)+" :");
            System.out.println("Nombre: ");
            leer.nextLine();
            String nombre = leer.nextLine();
            nombres [i]=nombre;
            System.out.println("Edad");
            int edad=leer.nextInt();
            edades [i] = edad;
            System.out.println("Direccion");
            leer.nextLine();
            String direccion = leer.nextLine();
            direcciones[i]=direccion;
        }
        System.out.println("==================");
        System.out.println("Registro de Datos");
        System.out.println("==================");
        
        for (int i=0; i<canPersonas; i++){
            System.out.println("Datos de personas" + (i+1) + " :");
            System.out.println("Nombres:" +nombres[i]);
            System.out.println("Edades:" +edades[i]);
            System.out.println("Direcciones:" +direcciones[i]);
        
        }
    }
    
    static void ingresoNumeros(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int n=leer.nextInt();
        //Creamos un arreglo para el ingreso de numeros
        int [] numeros = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Ingresar numeros"+(i+1)+" :");
            numeros[i]=leer.nextInt();
        }
        
        System.out.println("Los numeros ingresados en orden son");
        for(int i = n-1; i>=0; i--){
            System.out.println(numeros[i]);
        }
        
    }
}
