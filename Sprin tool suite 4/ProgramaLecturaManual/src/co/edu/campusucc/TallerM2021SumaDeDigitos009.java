package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2021SumaDeDigitos009 {
	public static void main(String[] args) {
		
		System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println("|       Andres Felipe Caicedo Cruz          |");
		  System.out.println("0   Facultad de Ingenieria de Sistemas ;)   0");
		  System.out.println("|           Campus Cali-Sur                 |");
		  System.out.println("0           Tercer semestre                 0");
		  System.out.println("|              ID 759064                    |");
		  System.out.println("0     Profesor Harold Adrian Bolanos        0");
		  System.out.println("|           30-Octubre-2020                 |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
	      System.out.println("|                                           |");
		  System.out.println("0                 Programa                  0");
		  System.out.println("|     Ingreso de numero y suma de digitos   |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  //La variable resultado pasa a valer el resultado de sumar 
		  //el valor de resultado al resultado de sacar el residuo del
		  // n�mero entre 10 (con esta operaci�n, por ejemplo, si tenemos 456 
		  //al aplicar el residuo entre 10 el resto valdr� 6 que es el �ltimo 
		  //d�gito del n�mero) Despu�s el n�mero se divide entre 10 para repetir el 
		  //proceso en el bucle y dividir todos los d�gitos mientras 
		  //se almacena el valor en la variable resultado
		
		 try (Scanner miScanner = new Scanner(System.in)) {
			int numero;

	        int resultado = 0;
	        System.out.print("Introduce un n�mero para sumar sus d�gitos: ");

	        numero = miScanner.nextInt();
	        while(numero > 0) {

	            resultado += numero % 10;

	            numero = numero / 10;

	        }

	        System.out.println("La suma es: " + resultado);
		}

	}

}
