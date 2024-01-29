/*Realizar un programa que solicite la entrada de 10 cadenas de caracteres y
construya una cadena con el primer carácter de cada cadena. Finalmente mostrará
dicha cadena por pantalla. */
package primeraParte;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce la cadena " + (i + 1) + ": ");
            String cadena = scanner.nextLine();

            if (cadena.length() > 0) {
                resultado.append(cadena.charAt(0));
            }
        }

        System.out.println("Cadena resultante: " + resultado.toString());

        scanner.close();
    }
}
