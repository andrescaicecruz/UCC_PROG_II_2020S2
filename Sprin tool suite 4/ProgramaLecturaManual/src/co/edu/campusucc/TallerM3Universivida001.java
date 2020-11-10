package co.edu.campusucc;

import java.util.Scanner;
public class TallerM3Universivida001 {
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
		  System.out.println("|                Universivida               |");
		  System.out.println("0                                           0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
	
		try (Scanner leer = new Scanner(System.in)) {
			String nom;
			int carrera, plan = 0, semestre;
			
			
			 System.out.println(" digite el nombre del estudiante");
				nom = leer.next();
System.out.println(" digite la asignatura cursada "+nom+": \n 1 ==> econonia \n"
			+ " 2 ==> administracion \n 3==> ciencias");
				carrera = leer.nextInt();
				System.out.println(" digite el semestre cursado");
				semestre = leer.nextInt();
						

				switch  (carrera) {
					case 1: 
						if ( semestre <= 3) {
						plan = 1500;
						}
						if ( semestre >=3 && semestre <= 7) {
							plan = 2220;
							}
						if ( semestre >=8 && semestre <= 10) {
							plan = 2220;
							}					
						;				
					break;
					
					case 2: 
						if ( semestre <= 3) {
						plan = 2000;
						}
						if ( semestre >=3 && semestre <= 7) {
							plan = 4000;
							}
						if ( semestre >=8 && semestre <= 10) {
							plan = 6000;
							}					
						;				
					break;
					
					case 3: 
						if ( semestre <= 3) {
						plan = 1800;
						}
						if ( semestre >=3 && semestre <= 7) {
							plan = 5000;
							}
						if ( semestre >=8 && semestre <= 10) {
							plan = 7000;
							}					
						;				
					break;
					
					
					default:
						plan = 0;
						
						System.out.println("Este plan dde estudio no existe");
						
						break;
						
						
						
				}
							
				
				System.out.println("el valor del plan de "+ nom+ " es de $ "+plan);
		}
			

	}

}
