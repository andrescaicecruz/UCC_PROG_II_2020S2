package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		
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
		  System.out.println("|                 Ejercicio 03              |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		int l1,l2;
	    boolean tr1=false,tr2=false,k;

	    try (Scanner leer = new Scanner(System.in)) {
			System.out.print("�La tierra es redonda? [0]...Falso [1]...Verdad? ");
			l1 = leer.nextInt();
			System.out.print("�simon bolivar liberto a panama? [0]...Falso [1]...Verdad? ");
			l2 = leer.nextInt();
		}

	    if (l1==1) tr1=true;
	    if (l2==0) tr2=true;

	    k= tr1 & tr2;

	      System.out.print("El valor de la variable k es: "+k);
		
	}

}