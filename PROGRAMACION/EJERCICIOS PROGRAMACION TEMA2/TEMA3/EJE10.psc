Algoritmo ej10
	contador <- 0
	Repetir
		Escribir 'Dime una nota'
		Leer nota
		Si nota=10 Entonces
			contador <- contador+1
		FinSi
	Hasta Que nota=-1
	Escribir 'La nota 10 ha salido ', contador, ' veces'
FinAlgoritmo
