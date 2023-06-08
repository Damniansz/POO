/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package try_catch;

/**
 *
 * @author xaldo
 */
public class Try_Catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero []=new int[5];
		try {
		numero[7]= 0;
		}
		catch(java.lang.ArrayIndexOutOfBoundsException Error) {
			System.out.println("Se genero una exepcion al acceder al arreglo");
		}
    }
    
}
