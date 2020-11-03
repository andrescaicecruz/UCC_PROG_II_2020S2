package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2021hobbies013 {
	public static void main(String[] args) {
		
		System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println("|       Andres Felipe Caicedo Cruz          |");
		  System.out.println("0   Facultad de Ingenieria de Sistemas ;)   0");
		  System.out.println("|           Campus Cali-Sur                 |");
		  System.out.println("0           Tercer semestre                 0");
		  System.out.println("|              ID 759064                    |");
		  System.out.println("0     Profesor Harold Adrian Bolanos        0");
		  System.out.println("|           24-Octubre-2020                 |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
	      System.out.println("|                                           |");
		  System.out.println("0                   Programa                0");
		  System.out.println("|               Calvin - hobbies            |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  Scanner leer = new Scanner(System.in);
			
			double DigiteN, Porcentaje, Calvin, Hobbes,Hobbestotal;
			
			System.out.println("DIGITE LAS N CANTIDAD DE ACEITR DE OLIVA  ");
			DigiteN = leer.nextInt();
			
			Porcentaje = 0.66666667;
			
			Hobbes = DigiteN;
			
			Hobbestotal = Hobbes * Porcentaje;
			
			Calvin = Hobbes - Hobbestotal;
			
			

			System.out.println("TOTAL DE ACEITE: " + DigiteN);
			
			System.out.println("PRODUCCION DE CALVIN : " + Calvin);

			System.out.println("PRODUCCION DE HOBBLES: " + Hobbestotal);
			

	}

}
