
package poo_u2_tutoria_polimorfismo;

import java.util.Scanner;


public class POO_U2_TUTORIA_POLIMORFISMO {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      String nombre,disciplina,sexo;
      int edad;
      int op1;
       System.out.println("Escoja una opcion"
              +"\n1: Atletismo"
              +"\n2: Natacion");
       op1=entrada.nextInt();
       switch(op1){
           case 1:
               System.out.println("Ingrese los datos");
               System.out.println("Nombre : ");
               entrada.nextLine(); // Consumir carácter de nueva línea pendiente
               nombre=entrada.nextLine();
               System.out.println("Edad : ");
               edad=entrada.nextInt();
               System.out.println("Disciplina : ");
               entrada.nextLine(); // Consumir carácter de nueva línea pendiente
               disciplina=entrada.nextLine();
               System.out.println("Sexo : ");
               sexo=entrada.nextLine();
               System.out.println("Prueba : ");
               String prueba=entrada.nextLine();
               
               Atletismo atle= new Atletismo(nombre,edad,disciplina,sexo,prueba);
               atle.entrenamiento();
               atle.mostrardatos();
               break;
           case 2:
               System.out.println("Ingrese los datos");
               System.out.println("Nombre : ");
               nombre=entrada.nextLine();
               System.out.println("Edad : ");
               edad=entrada.nextInt();
               System.out.println("Disciplina : ");
               disciplina=entrada.nextLine();
               System.out.println("Sexo : ");
               sexo=entrada.nextLine();
               System.out.println("Prueba : ");
               String estilo=entrada.nextLine();
               
               Natacion nata= new Natacion(nombre,edad,disciplina,sexo,estilo);
               nata.entrenamiento();
               nata.mostrardatos();
               break;
       }
       
       
    }
    
}
