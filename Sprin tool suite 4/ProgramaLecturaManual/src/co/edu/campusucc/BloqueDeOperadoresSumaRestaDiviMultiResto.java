package co.edu.campusucc;

import java.util.Scanner;

public class BloqueDeOperadoresSumaRestaDiviMultiResto {
	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		float numero1, numero2, suma,resta,division,multiplicacion,resto;
		
		System.out.print("digite dos numeros: ");
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		division = numero1 / numero2;
		multiplicacion = numero1 * numero2;
		resto = numero1 % numero2;
		
		System.out.println("la suma es:" + suma);
		System.out.println("la resta es:" + resta);
		System.out.println("la division es:" + division);
		System.out.println("la multiplicacion es:" + multiplicacion);
		System.out.println("el resto es igual a:" + resto);

	}
}
