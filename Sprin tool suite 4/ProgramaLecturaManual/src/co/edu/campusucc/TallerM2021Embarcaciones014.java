package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2021Embarcaciones014 {
	public void main(String[] args) {
		
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
		  System.out.println("|       Embarcaciones la niña, la pinta     |");
		  System.out.println("0               y la santa maria            0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  Scanner leer = new Scanner(System.in);
	        
	        int DigiteN, Distancia, Ninaida, Ninavuelta,Horasn;
			
			System.out.println("El viaje de la Niña, La Pinta y la Santa Maria : ");
			
			Distancia = 1200/2;
			
			//la niña//
			
			Ninaida = Distancia / 8;
			Ninavuelta = Distancia / 12;
			
			Horasn = Ninaida + Ninavuelta;
			System.out.println("ORDEN DE LLEGADA:");
			System.out.println("HORAS TOTALES DE LA NIÑA:" + Horasn);
			
			//pinta//
			
			Ninaida = Distancia / 9;
			Ninavuelta = Distancia / 11;
			
			Horasn = Ninaida + Ninavuelta;

			System.out.println("Horas totales de la Pinta : " + Horasn);
			
			//santa maria//
			
			Ninaida = Distancia / 10;
			Ninavuelta = Distancia / 8;
					
			Horasn = Ninaida + Ninavuelta;

			System.out.println("HORAS TOTALES DE LA SANTA MARIA: " + Horasn);		
			System.out.println("¿LLEGARON JUNTAS DE NUEVO A BUENOS AIRES? : NO ");

	}

}
