package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3002Ejemplo {
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
		  System.out.println("0                Numero mayor               0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  char opc;

		    try (Scanner leer = new Scanner(System.in)) {
				do{
				  System.out.print("\nDesea terminar? (S o N): ");
				  opc = leer.next().charAt(0);

				} while(opc=='n'||opc=='N');
			}

	}

}
