/*Realiza un programa que muestre una contraseña generada aleatoriamente
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo
pueden ser letras entre la ‘a’ y la ‘j’ pero sin letras repetidas*/

package primeraParte;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
         Random rand = new Random();

        int longitud = rand.nextInt(6) + 5; // Genera un número aleatorio entre 5 y 10
        StringBuilder contrasena = new StringBuilder();

        String letrasDisponibles = "abcdefghij"; // Letras disponibles para la contraseña

        while (contrasena.length() < longitud) {
            int indiceAleatorio = rand.nextInt(letrasDisponibles.length());
            char caracter = letrasDisponibles.charAt(indiceAleatorio);

            if (contrasena.indexOf(String.valueOf(caracter)) == -1) {
                // Si el carácter no está en la contraseña, lo agrega
                contrasena.append(caracter);
            }
        }

        System.out.println("Contraseña generada: " + contrasena.toString());
    }
}
