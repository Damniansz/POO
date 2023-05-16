/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1;

/**
 *
 * @author xaldo
 */
public class Ope {
    

    public int sumar(int n1,int n2){
        int sumar=n1+n2;
        return sumar;
    }
    
    public int restar(int n1,int n2){
        int restar=n1-n2;
        return restar;
    }
    
    public int multi(int n1,int n2){
        int multi=n1*n2;
        return multi;
    }
    
    public int div(int n1,int n2){
        int div=n1/n2;
        return div;
    }
    public void resultados(int sumar, int restar, int multi, int div){
        System.out.println("el resultado de  la suma es:"+sumar);
        System.out.println("el resultado de  la resta es:"+restar);
        System.out.println("el resultado de  la multiplicaion es:"+multi);
        System.out.println("el resultado de  la division es:"+div);

        
    }
    
}
