package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2021CostoPagoDevolucion005 {
	public void main(String[] args)
	{
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
		  System.out.println("|      cambio del pago de un producto       |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		
		 try (Scanner in = new Scanner(System.in)) {
				 
				
				
				double a=0;
				double b=0;
				double c=0;
				
			
				
				System.out.println();
				System.out.println("Digite el costo del producto");
				System.out.print("=  "); a= in.nextInt();
				
				System.out.println();
				System.out.println("Digite el valor de efectivo para el pago");
				System.out.print("=  "); b= in.nextInt();
				
				
				c=b-a;
			
				
				System.out.println();
				System.out.println("El valor a devolver al cliente : "+ c     );
			}
				
	}

}
