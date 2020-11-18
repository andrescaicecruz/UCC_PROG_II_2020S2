package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3002Eje04 {
	public static void main(String[] args) {
		
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println("|       Andres Felipe Caicedo Cruz          |");
		  System.out.println("0   Facultad de Ingenieria de Sistemas ;)   0");
		  System.out.println("|           Campus Cali-Sur                 |");
		  System.out.println("0           Tercer semestre                 0");
		  System.out.println("|              ID 759064                    |");
		  System.out.println("0     Profesor Harold Adrian Bolanos        0");
		  System.out.println("|           18-Novienbre-2020               |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
	      System.out.println("|                                           |");
		  System.out.println("0           TallerM3002  Programa           0");
		  System.out.println("|               Ejercicio 004               |");
		  System.out.println("0 determinar si el digito esta en el numero 0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  
		  Scanner leer = new Scanner(System.in);  //leer
			

			int maximo;
			int num;
			int mayor;
			int cont, valor=0, suma= 0;
		 
		    System.out.println("Inserte el máximo de números: ");
		    maximo = leer.nextInt();
		 
		    for(cont = 0;cont < maximo;cont++ ){
		        System.out.println("Inserte un número: ");
		        num = leer.nextInt();
		        valor = valor + num;
			
			
		}
		    
		    System.out.println("numero "+valor);
		  

	}

}
