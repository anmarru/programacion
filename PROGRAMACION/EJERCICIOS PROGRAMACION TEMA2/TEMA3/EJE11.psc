Algoritmo calculadorazar
	a<-azar(101)
	b<-azar(101)
	contadorfallo <- 0
	Repetir
		escribir a"+"b
		leer respuesta1
		si a+b=respuesta1 Entonces
			c<-azar(21)
		sino 
			escribir "fallo" = contadorfallo+1
			contadorfallo= contadorfallo+1
		FinSi
	Hasta Que a+b=respuesta1
	Repetir
		escribir respuesta1"-" c
		Leer respuesta2 
		Si respuesta1-c=respuesta2 Entonces
			d<-azar(6)
		SiNo
			
		Fin Si
	Hasta Que respuesta1-c=respuesta2 
	Repetir
		escribir respuesta2"*" d
		leer respuesta3
		Si respuesta2*d=respuesta3 Entonces
			e<-azar(16)
		SiNo
			escribir "fallo" = contadorfallo+1
			contadorfallo= contadorfallo+1
		Fin Si
	Hasta Que respuesta2*d=respuesta3 
	Repetir
		escribir respuesta3"-" e
		leer respuesta4
		Si respuesta3-e=respuesta4 Entonces
			escribir "felicidades tienes" contadorfallo ," fallos "
		SiNo
			escribir "fallo" = contadorfallo+1
			contadorfallo= contadorfallo+1
		Fin Si
	Hasta Que respuesta3-e=respuesta4
	
	
FinAlgoritmo
