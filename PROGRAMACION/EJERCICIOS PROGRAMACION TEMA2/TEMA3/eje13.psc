Algoritmo eje13
	Repetir
		Escribir ' menu'
		Escribir '1:sumar, 2: restar, 3:multiplicar, 4: dividir, 5:salir  '
		Escribir 'escoje una opcion'
		Leer opc
		Si opc='1' Entonces
			Escribir "SUMA"
		SiNo
			Si opc='2' Entonces
				Escribir "resta"
			SiNo
				Si opc='3' Entonces
					Escribir "multiplicacion"
				SiNo
					Si opc='4' Entonces
						Escribir "division"
					SiNo
						Si opc='5 ' Entonces
						Escribir "salir"
						SiNo
							Escribir "error"
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	Hasta Que opc="5"
FinAlgoritmo
