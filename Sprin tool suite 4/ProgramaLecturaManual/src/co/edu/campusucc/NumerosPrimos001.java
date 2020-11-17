package co.edu.campusucc;

import java.util.Random;

public class NumerosPrimos001 {
	public static void main(String[] args) {
		
		
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println("|       Andres Felipe Caicedo Cruz          |");
		  System.out.println("0   Facultad de Ingenieria de Sistemas ;)   0");
		  System.out.println("|           Campus Cali-Sur                 |");
		  System.out.println("0           Tercer semestre                 0");
		  System.out.println("|              ID 759064                    |");
		  System.out.println("0     Profesor Harold Adrian Bolanos        0");
		  System.out.println("|           14-Novienbre-2020               |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
	      System.out.println("|                                           |");
		  System.out.println("0                   Programa                0");
		  System.out.println("|                Numeros primos             |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  boolean condicion = false; // esto declara boolean, es falso o verdadero

			do { // haga

				Random random = new Random(); // sirve para pedir un valor aleatorio

				int intRandom = random.nextInt(1000); // sirve para pedir un valor aleatorio

				condicion = true;//

				int contador, i, numero; // declarar variables para saber si son primos

				numero = intRandom; // numero == computador me de en el aletorio

				contador = 0; // contador inicializa en 0

				for (i = 1; i <= numero; i++) // ciclo para,
				{
					if ((numero % i) == 0) // si numero random modulo es 0
					{
						contador++;
					}
				}

				if (contador <= 2)
					condicion = false; // si, pregunte si el numero random < 3 ; cambiar esto por que

				System.out.println("numero : " + intRandom + " finalizara cuando sea primo ");

			} while (condicion); // mientras


	}

}
