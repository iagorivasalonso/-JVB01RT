Algoritmo ejercicio_5
	
	Definir password Como Caracter;
	
	Escribir 'Inserte la  contraseña'
	leer password
	
	 Mientras  password <>'admin123'  y password <>'usuario456' HACER
		 Escribir 'acceso denegado, vuelva a intentarlo'
		 leer password
	FinMientras
	
	Escribir 'Acceso permitido'
	
FinAlgoritmo
