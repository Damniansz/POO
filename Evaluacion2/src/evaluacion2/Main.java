package evaluacion2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
	      String nombre,sexo;
		  int poder=0;

	      int op1;
	     
	      
	      System.out.println("Eliga un superheroe");
	      System.out.println("1.Ironman");
	      System.out.println("2.Batman");
	      System.out.println("3.Barbie");
	      

	             
	       op1=entrada.nextInt();
	      
	       
	    	   switch(op1){
	           case 1:
	               System.out.println("Ingrese  datos");
	               System.out.println("Nombre : ");
	               entrada.nextLine(); // Consumir carácter de nueva línea pendiente
	               nombre=entrada.nextLine();
	               System.out.println("Sexo : ");
	               sexo=entrada.nextLine();
	               System.out.println("Poder : ");
	               String poder1=entrada.nextLine();
	               System.out.println("Armadura : ");
	               int armadura = entrada.nextInt();
	               Ironman ironman= new Ironman( nombre,  sexo,  poder,  armadura);
	               ironman.pelea();
	               ironman.mostrardatos();
	               break;
	               
	           case 2:
	        	   System.out.println("Ingrese  datos");
	               System.out.println("Nombre : ");
	               entrada.nextLine(); // Consumir carácter de nueva línea pendiente
	               nombre=entrada.nextLine();
	               System.out.println("Sexo : ");
	               sexo=entrada.nextLine();
	               System.out.println("Poder : ");
	               String poder11=entrada.nextLine();
	               System.out.println("Dinero : ");
	               int dinero = entrada.nextInt();
	               Batman batman= new Batman( nombre,  sexo,  poder,  dinero);
	               batman.pelea();
	               batman.mostrardatos();
	               break;
	           case 3:
	        	   System.out.println("Ingrese  datos");
	               System.out.println("Nombre : ");
	               entrada.nextLine(); // Consumir carácter de nueva línea pendiente
	               nombre=entrada.nextLine();
	               System.out.println("Sexo : ");
	               sexo=entrada.nextLine();
	               System.out.println("Poder : ");
	               String poder111=entrada.nextLine();
	               System.out.println("Carteras : ");
	               int cartera = entrada.nextInt();
	               Barbie barbie= new Barbie( nombre,  sexo,  poder,  cartera);
	               barbie.pelea();
	               barbie.mostrardatos();
	               break;
	        	   
	       }
	       
	           
	

	}
	
}


