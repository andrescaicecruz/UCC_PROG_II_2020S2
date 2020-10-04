Proceso entrenamiento_05
	//defino variables 
	definir x Como Entero;
	definir yy Como Logico;
	definir c Como Caracter;
	
	x <- 10;

	yy <- falso; c <- 'a';
	si x > 0 entonces;
		yy <- verdadero;
	SiNo
		yy <- falso;
	FinSi
	c <- 'b';
	yy <- verdadero;
	
	escribir "el valor de x es;", x;
	escribir "el valor de yy es;", yy;
	escribir "el valor de c es;", c;
	
FinProceso
