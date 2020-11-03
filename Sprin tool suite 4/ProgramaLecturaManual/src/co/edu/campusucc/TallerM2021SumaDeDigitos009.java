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
		  // número entre 10 (con esta operación, por ejemplo, si tenemos 456 
		  //al aplicar el residuo entre 10 el resto valdrá 6 que es el último 
		  //dígito del número) Después el número se divide entre 10 para repetir el 
		  //proceso en el bucle y dividir todos los dígitos mientras 
		  //se almacena el valor en la variable resultado
		
		 try (Scanner miScanner = new Scanner(System.in)) {
			int numero;

	        int resultado = 0;
	        System.out.print("Introduce un número para sumar sus dígitos: ");

	        numero = miScanner.nextInt();
	        while(numero > 0) {

	            resultado += numero % 10;

	            numero = numero / 10;

	        }

	        System.out.println("La suma es: " + resultado);
		}

	}

}
