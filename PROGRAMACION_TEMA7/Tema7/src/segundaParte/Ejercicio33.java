package segundaParte;

import java.util.Scanner;

/*33.Realiza una función llamada cantidadDivisores al que se le pase como parámetro
un número entero y devuelva el número de divisores o bien cero si el número es negativo */
public class Ejercicio33 {

    public static int cantidadDividores(int numero) {
        if (numero > 0) {
            int cantidad = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0){
                    cantidad++;
                }
            }
            return cantidad;

        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa numero para calcular sus divisores");
        int numero = entrada.nextInt();
        cantidadDividores(numero);
        entrada.close();
    }

}
