package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2021SecretariasPag007 {
	
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
		  System.out.println("|    Escritura de paginas, calculo tiempo   |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		 try (Scanner leer = new Scanner (System.in)){
			int Paginas, Numero1;
			
			System.out.println("Escribir tiempo destinado para escribir las paginas ---> "); 
			Numero1= leer.nextInt();
			
			Paginas = Numero1 *15/30; 
			System.out.println ("La cantidad total de paginas a escribir es --->  " + Paginas);
		
		
        }

	}

}
