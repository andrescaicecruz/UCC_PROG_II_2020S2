package co.edu.campusucc;

import java.util.Scanner;

public class RetoDecimalBinarioExacecimal {
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
		  System.out.println("0            Programa Argumento             0");
		  System.out.println("|                  reto                     |");
		  System.out.println("0  conversion de numero decimal en binario, 0");
		  System.out.println("|                exadecimal                 |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		
		 try (Scanner leer = new Scanner(System.in)) {
			System.out.print("Ingrese una cifra: ");
	        int cifra = leer.nextInt();
	        System.out.print("\nbinario:\t");
	        binario(cifra);
	        System.out.print("\nHexadecimal:\t");
	        hexadecimal(cifra);
		}
	   
	    }

	    //SE IMPLEMENTA UN METODO RECURCIVO PARA TRANSFORMARA A BINARIO LA CIFRA
	    public static void binario(int N){
	        if(N == 1) System.out.print("1");
	        else{
	            binario(N/2);
	            System.out.print(N%2);
	        }  
	    }


	    //SE IMPLEMENTA UN METODO RECURCIVO PARA TRANSFORMARA A HEXADECIMAL LA CIFRA
	    public static void hexadecimal(int N){
	        if(N < 16){
	            if(N == 10) System.out.print("A");
	            if(N == 11) System.out.print("B");
	            if(N == 12) System.out.print("C");
	            if(N == 13) System.out.print("D");
	            if(N == 14) System.out.print("E");
	            if(N == 15) System.out.print("F");
	            if(N < 10) System.out.print(N);
	        }
	        else{
	            hexadecimal(N/16);
	            System.out.print(N%16);
	        }

	}
}
