package co.edu.campusucc;

import javax.swing.JOptionPane;

public class EntrenamientoPersonalJOptionpane01 {
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
		  System.out.println("0          Programa Entrenamiento           0");
		  System.out.println("|                                           |");
		  System.out.println("0                Ejercicio01                 0");
		  System.out.println("|                                           |");
		  System.out.println("|                                           |");
		  System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0");
		  System.out.println();
		  
		  String cadena;
		  int entero;
		  char letra;
		  double decimal;
		  
		  cadena = JOptionPane.showInputDialog("digite una cadena");
		  entero = Integer.parseInt(JOptionPane.showInputDialog( "digite un entero"));
		  letra = JOptionPane.showInputDialog("digite un caracter").charAt(0);
		  decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal"));
		  
		  JOptionPane.showMessageDialog(null,"la cadena es: "  +  cadena);
		  JOptionPane.showMessageDialog(null,"el entero es: "  +  entero);
		  JOptionPane.showMessageDialog(null,"la letra es: "  +  letra);
		  JOptionPane.showMessageDialog(null,"el decimal es: "  + decimal);
		  
		  
		
		
	}
}
