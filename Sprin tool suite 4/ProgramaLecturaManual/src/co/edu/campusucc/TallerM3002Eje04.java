package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3002Eje04 {
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
		  System.out.println("0 determinar si el digito esta en el numero 0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  
		  int numero,digito,invertido=0,resto,existe=0;

		    try (Scanner leer = new Scanner(System.in)) {
				System.out.print("Ingrese un numero: ");
				numero= leer.nextInt();
				System.out.print("Ingrese un digito: ");
				digito= leer.nextInt();
			}

		    do{
		      resto= numero%10;
		      invertido=invertido*10+resto;
		      numero/=10;
		      if (digito==resto)
		        existe=1;

		    } while(numero>0 && existe==0);
		    if (existe==1)
		      System.out.print("\nEl digito existe");
		    else
		      System.out.print("\nEl digito no existe");
		  

	}

}
