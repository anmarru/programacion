Algoritmo ejer21
	Definir horastrabajadas, extras, pago, salario Como Real
	Escribir 'dime horas trajadas'
	Leer horas
	Escribir 'dime pago por hora'
	Leer pago
	Si horas>35 Entonces
		extras <- horas-35
		salario_bruto <- (35*pago)+(extras*1.5)
	SiNo
		salario_bruto <- pago*horas
		Si salario_bruto<=500 Entonces
			salario_neto <- salario_bruto
			Escribir 'no paga impuestos'
		SiNo
		FinSi
	FinSi
	Si salario_bruto>500 Y salario_bruto<900 Entonces
		impuesto1 <- (salario_bruto-500)*0.25
		Escribir 'paga impuestos de 25%'
		Leer impuesto1
	SiNo
	FinSi
FinAlgoritmo
