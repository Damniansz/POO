/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerficheros;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author xaldo
 */
public class LeerFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       BufferedReader br = new BufferedReader(new FileReader("C:\\POO\\Texto\\Aldo.txt"));
        String linea;
        try{
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
