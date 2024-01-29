package primeraParte;

import java.util.Scanner;

public class Ejercicio11b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Introduce la posición: ");
        int posicion = scanner.nextInt();

        System.out.println("Introduce el carácter para reemplazar: ");
        char letra = scanner.next().charAt(0);

        StringBuilder builder = new StringBuilder(cadena);

        if (posicion >= 0 && posicion < builder.length()) {
            builder.setCharAt(posicion, letra);
            System.out.println("La cadena resultante es: " + builder.toString());
        } else {
            System.out.println("La posición indicada está fuera del rango de la cadena.");
        }

        scanner.close();
    }
}
