package primeraParte;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase para verificar si es un palíndromo: ");
        String frase = scanner.nextLine().toLowerCase().replaceAll("\\s+", ""); // Convertimos a minúsculas y quitamos espacios

        boolean esPalindromo = true;

        int izquierda = 0;
        int derecha = frase.length() - 1;

        while (izquierda < derecha) {
            if (frase.charAt(izquierda) != frase.charAt(derecha)) {
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }

        if (esPalindromo) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        scanner.close();
    }
}
