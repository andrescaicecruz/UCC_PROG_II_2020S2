package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2021PagoNomHoras006 {
	
	private static Scanner teclado;	
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
		  System.out.println("|      Pago nomina por horas trabajadas     |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		 try (Scanner entrada = new Scanner(System.in)) {
			 teclado = new Scanner(System.in);
			 
			 System.out.println();
				System.out.println("Digite el nombre del empleado ");
				System.out.print("= ");teclado.nextLine();
			 
			long horasTrabajadas;
		    long pagoxhora;
		    long salario;

		    System.out.print("Ingrese las horas trabajadas: = ");
		    horasTrabajadas=entrada.nextLong();
		    System.out.print("Ingrese el pago por horas: = ");
		    pagoxhora=entrada.nextLong();
		    
	
		    salario= horasTrabajadas*pagoxhora;
		    System.out.println("El salario es de: = " +salario);
		}

	}

}
