
package practicasistemabancario;

import java.util.Scanner;


public class PracticaSistemaBancario {

    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta ("Larco","elpepe",1000.0);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingrese la contrseña");
        String contraseña = sc.nextLine();
        if (cuenta1.verificarCredenciales(usuario, contraseña)){
            System.out.println(" Credenciales validas, Bienvenido ");
            System.out.println(" 1. Depositar: ");
            System.out.println(" 2. Retirar: ");
            System.out.print("Ingrese la opcion a realizar");
            
            int opc=sc.nextInt();
            
            switch (opc){
            
                case 1:
                    System.out.println(" Ingrese la cantidad depositada: ");
                    double cantidadDeposito = sc.nextDouble();
                    cuenta1.depositar(cantidadDeposito);
                    break;
                case 2: 
                    System.out.println(" Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = sc.nextDouble();
                    cuenta1.retirar(cantidadRetiro);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            
            }
        
        
        }else{
                    System.out.println(" Credencianles invalidas.Acceso denegado ");
                    
                    
                    }
        
       
    }
    
}
