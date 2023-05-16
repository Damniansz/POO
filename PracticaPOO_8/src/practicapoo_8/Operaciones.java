/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapoo_8;

import javax.swing.JOptionPane;

/**
 *
 * @author xaldo
 */
public class Operaciones {
    int num1;
    int num2;
    int suma;
    int resta;
    int multi;
    int div;
    //Generamos Metodos
    //Pedimos Numeros
    //Nuestro Metodo es publico
    
   
    public void capturarnumeros (){
        //Pedir numeros en pantalla
        num1 = Integer.parseInt (JOptionPane.showInputDialog("Ingresar primer numero"));
        num2 = Integer.parseInt (JOptionPane.showInputDialog("Ingresar primer numero"));

    }
    
    public void suma (){
        suma=num1+num2;
    }
    
    public void resta (){
        resta=num1-num2;
    }
    
    public void multi (){
        multi=num1*num2;
    }
    
    public void div (){
        div=num1/num2;
    }
    
    public void resultados (){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multi);
        System.out.println("El resultado de la division es: "+div);
    }
    
}
