Algoritmo horastrabajadores
	// nom=nombre,sb=salario bruto,ti= tasa impuestos, ht= horas trabajadas, pht= precio horas trabaja, phe= pago horas extras
	Definir nom, sb, ht, ti, pht Como Real
	Escribir 'horas trabajadas'
	Leer ht
	Escribir 'precio hora trabajada'
	Leer pht
	sb <- ht*pht
	Si ht>35 Entonces
		// Escribir 'su salario es =', sb
		salrio_normal <- 35*pht
		horas_extras <- ht-35
		phe <- horas_extras*(pht*1.5)
		Escribir 'horas extas trabajadas', horas_extras
		Escribir 'su salario sin horas extras es', sb
		Escribir 'cuantia horas extras', phe
		Escribir 'su salario con horas extras pagadas es', sb+phe
	SiNo
		// ht<=35 
		Escribir 'su salario bruto es', sb
		Escribir 'no paga impuestos'
	FinSi
	Si sb>500 Entonces
		Escribir 'paga impuestos segun el ecxedente'
		sinImpuestos1 <- sb-500
		Si sinImpuestos1>400 Entonces
			// sinImpuestos1 porque es el lo que excede sin impuestos porque estandescontado los primeros 500 euros que son libres
			imp1 <- sinImpuestos1*0.25
			Escribir 'impuesto del 25 por ciento', imp1
			imp2 <- sb-900
			imp2 <- imp2*0.45
			Escribir 'impuesto del 45 por ciento', imp2
			// suma de los dos impuestos
			imptotal <- imp1+imp2
			Escribir 'total impuestos', imptotal
			sn <- sb-imp
			Escribir 'sueldo bruto', sb
			Escribir 'Sueldo neto', sn
		SiNo
			imp <- sinImpuestos1*025
			sn <- sb-imp
		FinSi
	SiNo
		sn <- sb
	FinSi
FinAlgoritmo
