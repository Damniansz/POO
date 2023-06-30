
package practicasistemabancario;
import java.util.*;

public class Cuenta {
    private String usuario, contraseña;
    private double saldo;

    public Cuenta(String usuario, String contraseña, double saldo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }
    
    public boolean verificarCredenciales (String usuario, String contrseña){
    return this.usuario.equals(usuario)&&this.contraseña.equals(contrseña);
    
    }
    
    public void depositar (double cantidad){
    saldo+= cantidad;
        System.out.println(" Deposito exitoso. Saldo actual " + saldo);
    
    }
    
    public void retirar (double cantidad){
        if (cantidad <= saldo || cantidad <= Banco.LIMITE_RETIRO_DIARIO){
        saldo-=cantidad;
            System.out.println(" Retiro exitoso. Saldo actual: " + saldo);
        }else if (cantidad > saldo){
            System.out.println(" Saldo insuficiente ");
        }else{
            System.out.println(" El retiro supera el limite diario de $ " + Banco.LIMITE_RETIRO_DIARIO );
        }
        
    }
   
}
