package co.edu.campusucc;

import java.util.Scanner;

public class TallerM2001PorcentajeDeNotas003 {
	{
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
	  System.out.println("|                 Ejercicio 01              |");
	  System.out.println("0                                           0");
	  System.out.println("|                                           |");
	  System.out.println("|                                           |");
	  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
	  System.out.println();
	}
	
	
	
	double nota1, nota2, nota3;
	double acumulado1, acumulado2, acumulado3, definitiva;
	
	Scanner entrada = new Scanner(System.in);
	
	public void ingresenotas() {
		System.out.println("ingresar notas de mafalda");
		System.out.print("ingrese nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("ingrese nota 2: ");
		nota2 = entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		nota3 = entrada.nextDouble();
		
		
	}
	
	public void calculonotas() {
		acumulado1 = nota1*0.30;
		acumulado2 = nota2*0.30;
		acumulado3 = nota3*0.40;
		definitiva = acumulado1 + acumulado2 + acumulado3;
	}
	
	public void resultadofinal()  {
		System.out.println("nota 1 : " + nota1);
		System.out.println("nota 2 : " + nota2);
		System.out.println("nota 3 : " + nota3);
		System.out.println("acumulado nota 1 : " + acumulado1);
		System.out.println("acumulado nota 2 : " + acumulado2);
		System.out.println("acumulado nota 3 : " + acumulado3);
		System.out.println("NOTA DEFINITIVA: " + definitiva);
	}
	
	public void mensaje() {
		if(definitiva>= 3 & definitiva<=5) {
			System.out.print("Mafalda a aprobrado la materia:");
		}else {
				if(definitiva>= 1.9 & definitiva <3) {
					System.out.print("Mafalda habilita la materia");
				}else {
					if(definitiva>=0 & definitiva<1.9) {
						System.out.print("Mafalta reprueba la materia");
					
				}
			}
		}
	}
	
	
	public void main(String[] args) {
		TallerM2001PorcentajeDeNotas003 nt = new TallerM2001PorcentajeDeNotas003();
		nt.ingresenotas();
		nt.calculonotas();
		nt.resultadofinal();
		nt.mensaje();
	

	}

}
