/*Realizar un programa que solicite una cadena, un número que indica una posición
de la cadena y una letra. El programa reemplazará sobre la misma cadena, el
carácter que hubiera en la posición indicada por la letra introducida. Hacer dos
versiones, la primera con String y otra con StringBuilder */
package primeraParte;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Introduce la posición: ");
        int posicion = scanner.nextInt();

        System.out.println("Introduce el carácter para reemplazar: ");
        char letra = scanner.next().charAt(0);

        if (posicion >= 0 && posicion < cadena.length()) {
            String nuevaCadena = cadena.substring(0, posicion) + letra + cadena.substring(posicion + 1);
            System.out.println("La cadena resultante es: " + nuevaCadena);
        } else {
            System.out.println("La posición indicada está fuera del rango de la cadena.");
        }

        scanner.close();
    }
}
