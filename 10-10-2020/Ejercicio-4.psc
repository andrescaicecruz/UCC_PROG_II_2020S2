Proceso ejercicio_en_clase_4
	//defino variables 
	
	definir resp1, resp2, resp3, resp4 Como Entero;
	definir k Como Logico;
	
	escribir "¿ Benjamin Franklin invento el pararrayos ? [0]...Falso [1]...Verdad ";
	leer resp1;
	
	escribir "¿ Samuel Morse invento el telefono ? [0]...Falso [1]...Verdad ";
	leer resp2;
	
	escribir "¿ Perú es un pais saramericano ? [0]...Falso [1]...Verdad ";
	leer resp3;
	
	escribir "¿ 5 es un numero primo ? [0]...Falso [1]...Verdad ";
	leer resp4;
	
	k <- (resp1 >= resp2) y (resp3 = resp4);
	
	escribir "El valor final vale;", k;
	
FinProceso
