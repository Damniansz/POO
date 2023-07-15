/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pantopro
 */
public class Modelo {
    private int v1=0;
    private int v2=0;
    private int total ;
  
    
    public Modelo (){}

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    
    public void sumar (){
        this.total = this.v1 + this.v2;
        
        
    }
    public void resta (){
        this.total = this.v1 - this.v2;
        
    }
    public void mult (){
        this.total = this.v1 * this.v2;
        
    }
    public void div (){
        this.total = this.v1 / this.v2;
        
    }

    
    
    
}
