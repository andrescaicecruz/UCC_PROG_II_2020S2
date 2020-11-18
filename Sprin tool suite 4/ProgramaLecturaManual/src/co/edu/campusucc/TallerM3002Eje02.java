package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3002Eje02 {
	private static Scanner leer;

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
		  System.out.println("|               Ejercicio 002               |");
		  System.out.println("0                Suma Digitos               0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  leer = new Scanner(System.in);
			
			int entero,residuo, suma, valor, numero;
			entero = 1;
			residuo=1;
			valor=0;
			suma=0;
			
			 System.out.println("Ingrese numero: "); //pido la variable
		     numero = leer.nextInt();
		     
		     while (entero > 0)
		     {
		    	 residuo = numero % 10;
		    	 entero = numero/10;
		    	 numero = entero;
		    	 suma = residuo + valor;
		    	 valor = suma;
		     }
			
			System.out.println(" la suma de los numeros es  " + suma);

	}

}
