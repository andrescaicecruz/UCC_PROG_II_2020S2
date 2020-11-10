package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3CableAsad00 {
	public static void main(String[] args) {
		
		System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println("|       Andres Felipe Caicedo Cruz          |");
		  System.out.println("0   Facultad de Ingenieria de Sistemas ;)   0");
		  System.out.println("|           Campus Cali-Sur                 |");
		  System.out.println("0           Tercer semestre                 0");
		  System.out.println("|              ID 759064                    |");
		  System.out.println("0     Profesor Harold Adrian Bolanos        0");
		  System.out.println("|           07-Noviembre-2020               |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
	      System.out.println("|                                           |");
		  System.out.println("0    Programacion java seleccion multiple   0");
		  System.out.println("|                 Cable_Asad                |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		  try (Scanner leer = new Scanner(System.in)) {
			int categ;
			  double sueldo;
			  
			  System.out.println("Digitar el nombre del empleado : ");
			  leer.next ();
			  System.out.println("Digitar la categoria de 1 a 4: ");
			  categ = leer.nextInt ();
			  System.out.println("Digitar sueldo del empleado : ");
			  sueldo = leer.nextDouble ();
			  
			  switch (categ) { 
			  case 1: sueldo = sueldo * 1.15 ;
			  break;
			  case 2: sueldo = sueldo * 1.10 ;
			  break;
			  case 3: sueldo = sueldo * 1.08 ;
			  break;
			  case 4: sueldo = sueldo * 1.07 ;
			  break;
			  
			  default:
				 sueldo = 0;
					  System.out.println("La categoria no existe : ");
			  
			  }
			  
			  
			  
			  System.out.println("El sueldo a pagar es : " +sueldo);
		}
	}

}
