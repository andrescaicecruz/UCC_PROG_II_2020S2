package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2001SumRestaMultiProme002 {
	private static Scanner entrada;

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
		  System.out.println("|   suma,resta,multiplicacion y promedio    |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  
		  entrada = new Scanner(System.in);
			float numero1, numero2, suma,resta,multiplicacion,promedio;
		  
			System.out.print("digite dos numeros: ");
			numero1 = entrada.nextFloat();
			numero2 = entrada.nextFloat();
			
			suma = numero1 + numero2;
			resta = numero1 - numero2;
			multiplicacion = numero1 * numero2;
			promedio = (numero1+numero2)/2;
			
			System.out.println("la suma es:" + suma);
			System.out.println("la resta es:" + resta);	
			System.out.println("la multiplicacion es:" + multiplicacion);
			System.out.println("el promedio es igual a:" + promedio);

	}

}
