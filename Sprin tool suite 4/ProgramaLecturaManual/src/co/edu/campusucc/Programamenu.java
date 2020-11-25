package co.edu.campusucc;

import java.util.Scanner;


public class Programamenu {
	public static void main(String[] args) {
		
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println("|       Andres Felipe Caicedo Cruz          |");
		  System.out.println("0   Facultad de Ingenieria de Sistemas ;)   0");
		  System.out.println("|           Campus Cali-Sur                 |");
		  System.out.println("0           Tercer semestre                 0");
		  System.out.println("|              ID 759064                    |");
		  System.out.println("0     Profesor Harold Adrian Bolanos        0");
		  System.out.println("|           24-Noviembre-2020               |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
	      System.out.println("|                                           |");
		  System.out.println("0               Programa Final              0");
		  System.out.println("|     Seleccion del programa a ejecutar     |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		System.out.println("digite 1 para programa Ejercicio01");
		System.out.println("digite 2 para programa Ejercicio02");
		System.out.println("digite 3 para programa Ejercicio03");
		System.out.println("digite 4 para programa Ejercicio04");
		System.out.println("digite 5 para programa Ejercicio05");
		System.out.println("digite 6 para programa RetoDecimalBinarioExacecimal");
		System.out.println("digite 7 para programa TallerM2001ElevarNumeroAlCubo001");
		System.out.println("digite 8 para programa TallerM2001PorcentajeDeNotas003");
		System.out.println("digite 9 para programa TallerM2001SumRestaMultiProme002");
		System.out.println("digite 10 para programa TallerM2021Algebrin000");
		System.out.println("digite 11 para programa TallerM2021CostoPagoDevolucion005");
		System.out.println("digite 12 para programa TallerM2021Embarcaciones014");
		System.out.println("digite 13 para programa TallerM2021hobbies013");
		System.out.println("digite 14 para programa TallerM2021Nomina004");
		System.out.println("digite 15 para programa TallerM2021Nomina011");
		
		try (Scanner scan = new Scanner(System.in)){
			int opcionprograma;
			String comando ="";
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			System.out.println("Ingrese el numero del programa a ejecutar: ==> ");
			opcionprograma = scan.nextInt();
			
			switch (opcionprograma) {
			case 1 :
				new Ejercicio01().main(args);
				
				break;
			case 2 :	
				new Ejercicio02().main(args);
				break;
			case 3 :
				new Ejercicio03().main(args);
				break;
			case 4 :
				new Ejercicio04().main(args);
				break;
			case 5 :	
				new Ejercicio05().main(args);
				break;
			case 6 :
				new RetoDecimalBinarioExacecimal().main(args);
				break;
			case 7 :
				new TallerM2001ElevarNumeroAlCubo001().main(args);
				break;
			case 8 :	
				new TallerM2001PorcentajeDeNotas003().main(args);
				break;
			case 9 :
				new TallerM2001SumRestaMultiProme002().main(args);
				break;
			case 10 :
				new TallerM2021Algebrin000().main(args);
				break;
			case 11 :	
				new  TallerM2021CostoPagoDevolucion005().main(args);
				break;
			case 12 :
				new TallerM2021Embarcaciones014().main(args);
				break;
			case 13 :
				new TallerM2021Nomina011().main(args);
				break;
			case 14 :	
				new TallerM2021hobbies013().main(args);
				break;
			case 15 :
				new TallerM2021Nomina004().main(args);
				break;
				
				default :
			    try 
				{
				Runtime.getRuntime().exec(comando);
				}
				catch (Exception e)
				{
					System.out.println(" El programa no ha sido asignado. ");
					e.printStackTrace();
				}
				
			   
			
		}
		}

	}

}
