package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2021PagoHoraExtras008 {
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
		  System.out.println("|        Nomina horas extras al 50%         |");
		  System.out.println("0             seguridad -12%                0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		try (Scanner entrada = new Scanner(System.in)) {
			long horasTrabajadas;
			long pagoxhora;
			long salario;
			
			
			System.out.print("Ingrese el numero dias trabajado : ");
			horasTrabajadas=entrada.nextLong();

			System.out.print("Ingrese las horas trabajadas: ");
			horasTrabajadas=entrada.nextLong();

			System.out.print("Ingrese el pago por horas: ");
			pagoxhora=entrada.nextLong();

			if(horasTrabajadas > 48){
			    //calcula el salario de las primeras 48 horas
			    long primerasHoras = 48 * pagoxhora;
			    long precioHorasExtra = (pagoxhora/2) + pagoxhora;
			    //calcula el salario de las horas extra
			    long salarioHorasExtra = (horasTrabajadas - 48) * precioHorasExtra;
			 
			    salario = primerasHoras + salarioHorasExtra;//suma las dos cantidades
			}
			else{
			    //menos de 40 horas trabajadas
			    salario = pagoxhora * horasTrabajadas ;
			    
			}
			System.out.println("El salario total sin descuento de seguridad es: " + salario);
			System.out.println("Salario menos el (12%) de pago de seguridad. Total a pagar es: ---->>> " + salario *88/100);
		}
	}

}
