package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2001ElevarNumeroAlCubo001 {
	public void main(String[] args) {
		
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
		  System.out.println("0                   Programa                0");
		  System.out.println("|            Elevar un numero al cubo       |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  
		
		try (Scanner nu = new Scanner(System.in)) {
			int num;
			System.out.print("Ingresa número ");
			num = nu.nextInt();
			System.out.print("Valor al cubo : " + Math.pow(num, 3));
		}

	}

}
