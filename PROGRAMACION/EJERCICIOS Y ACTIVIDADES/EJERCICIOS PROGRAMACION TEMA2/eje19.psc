Algoritmo eje19
	Escribir 'calificacion'
	Leer calificacion
	Según calificacion Hacer
		3,4:
			Escribir calificacion>=3 Y calificacion<5
			Escribir 'insuficiente'
		5,6:
			Escribir calificacion>=5 Y calificacion<6
			Escribir 'bien'
		7,8:
			Escribir calificacion>=6 Y calificacion<9
			Escribir 'notable'
		9,10:
			Escribir calificacion>=9 Y calificacion=10
			Escribir 'sobresaliente'
		De Otro Modo:
			Escribir calificacion>=0 Y calificacion<3
			Escribir 'muy deficiente'
	FinSegún
FinAlgoritmo
