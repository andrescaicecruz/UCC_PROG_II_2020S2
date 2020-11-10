package co.edu.campusucc;

import java.util.Scanner;

public class TallerM3LosPilitos003 {
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
		  System.out.println("|               Los pilitos                 |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		try (Scanner leer = new Scanner(System.in)) {
			String nom;
			int  codigo;
			double valorfact = 0, cantidad, iva, valor; 
			
			System.out.println(" digite el nombre del empleado");
			nom = leer.next();

			System.out.println(" digite codigo "+nom+": \n 1 ==> Producto a \n"
					+ " 2 ==> producto b \n 3==> producto c");
			codigo = leer.nextInt();
			
			System.out.println(" digite la cantidad  "+nom+":  ");
			cantidad = leer.nextInt();
			
			if ( cantidad < 501 && codigo == 1) {
				iva = 0.07;
				valor = (cantidad*500)*iva;
				valorfact = (cantidad*500)+valor;
				
				}
			if ( cantidad < 501 && codigo == 2) {
				iva = 0.08;
				valor = (cantidad*800)*iva;
				valorfact = (cantidad*800)+valor;
				
				}
			if ( cantidad < 501 && codigo == 3) {
				iva = 0.05;
				valor = (cantidad*1000)*iva;
				valorfact = (cantidad*1000)+valor;
				
				}
			if ( cantidad > 500 && codigo == 1) {
				iva = 0.09;
				valor = (cantidad*1000)*iva;
				valorfact = (cantidad*1000)+valor;
				
				}
			if ( cantidad > 500 && codigo == 2) {
				iva = 0.11;
				valor = (cantidad*1400)*iva;
				valorfact = (cantidad*1400)+valor;
				}
			if ( cantidad > 500 && codigo == 3) {
				iva = 0.10;
				valor = (cantidad*1600)*iva;
				valorfact = (cantidad*1600)+valor;
				
				}

			
			System.out.println("El  valor de su factura es de : $ "+ valorfact + " Señor " + nom);
		}

	}

}
