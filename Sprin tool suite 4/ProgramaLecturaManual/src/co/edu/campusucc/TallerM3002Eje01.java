package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3002Eje01 {
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
		  System.out.println("|               Ejercicio 001               |");
		  System.out.println("0               Numero inverso              0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  
		  int i;
			try (Scanner leer = new Scanner(System.in)) {
				String palabra; // defino una variable
		        String palabrainvertida="";  // defino la variable para invertirla
		        System.out.println("Ingresa un numero y se mostrara inverso  =>>\n"); //pido la variable
		        palabra = leer.nextLine();
		 
		        for (i = palabra.length()-1; i>=0; i--){  //ciclo for para contar la cantidad de  digitos
		            palabrainvertida += palabra.charAt(i);  // invierto los digitos
		        }
		 
		        
		        System.out.println("El numero  invertido es  =>>\n"+ palabrainvertida);  //imprimo el numero
			}


	}

}
