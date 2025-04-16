Algoritmo ejercicio4
	
	Definir option, numero1, numero2 Como Real
	
	Escribir "Inserte el primer numero'
	leer numero1
	
	Escribir "Inserte el segundo numero'
	leer numero2
	
	
	Escribir 'Escoga una opcion';
	
	Escribir '1. Suma';
	Escribir '2. Resta';
	Escribir '3. Multiplicación';
	Escribir '4. División';
	
	leer option
	
	segun option
		caso: 1:
			escribir numero1+numero2;
		caso: 2:
			escribir numero1-numero2;
		caso: 3:
			escribir numero1*numero2;
		caso: 4:
			escribir numero1/numero2;
	FinSegun
FinAlgoritmo
