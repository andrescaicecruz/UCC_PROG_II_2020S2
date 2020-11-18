package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3002Eje06 {
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
		  System.out.println("|               Ejercicio 006               |");
		  System.out.println("0     determinar si el numero es peimo      0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  try (Scanner leer = new Scanner(System.in)) {
			int contador,primo,numero;

		     System.out.print("Ingresa un numero: ");
		     numero = leer.nextInt();

		     contador = 0;

		     for(primo = 1; primo <= numero; primo++)
		     {
		         if((numero % primo) == 0)
		         {
		             contador++;
		         }
		     }

		     if(contador <= 2)
		     {
		         System.out.println(numero+ " si es numero primo");
		     }else{
		         System.out.println("El numero no es primo");
		     }
		}
		  

	}

}
