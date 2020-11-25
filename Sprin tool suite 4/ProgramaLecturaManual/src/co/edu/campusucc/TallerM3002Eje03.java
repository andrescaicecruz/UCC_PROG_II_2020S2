package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3002Eje03 {
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
		  System.out.println("|               Ejercicio 003               |");
		  System.out.println("0          Determine si es capicua          0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  try (Scanner leer = new Scanner(System.in)) {
			int N, aux, inverso = 0, cifra;
		     do {
		         System.out.print("Digite mas de un digito para saber si es capicúa  =>> ");                                                 
		         N = leer.nextInt();
		     } while (N < 10);
		    
		     //le damos la vuelta al número
		     aux = N;
		     while (aux!=0){
		         cifra = aux % 10;
		         inverso = inverso * 10 + cifra;
		         aux = aux / 10;
		     }
		 
		     if(N == inverso){
		         System.out.println("El numero no es capicua  =>>");
		     }else{
		         System.out.println("El numero es capicua  =>>");
		     }
		}
		  
		  

	}

}
