//202030799 Manuel Rojas
//Se leen desde teclado números hasta que la suma de los mismos llegue a 1000. Mientras tanto debe hallar:
//a. La cantidad de números múltiplos de 6.
//b. La suma de los números que se encuentran entre el 1 y el 10 (incluidos).
Proceso Ejercicio10Parte2
	multiplo6 <- 0
	suma110 <- 0
	suma <- 0
	Mientras suma <= 1000 Hacer
		Escribir "Ingrese un numero"
		Leer num
		suma <- suma + num
		Si (num%6) == 0 Entonces
			multiplo6 <- multiplo6 + 1
		SiNo
			Si (num >= 1) & (num <= 10) Entonces
				suma110 <- suma110 + num
			FinSi
		FinSi
	FinMientras
	Escribir "De los numeros ingresados: ", multiplo6, " son multiplos de 6. Y La suma de los números que se encuentran entre el 1 y el 10 es: ", suma110
FinProceso
