/*Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las siguientes limitaciones:
        Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.*/
package primeraParte;

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int longitud = rand.nextInt(6) + 5; // Genera un número aleatorio entre 5 y 10
        String contrasena = "";

        for (int i = 0; i < longitud; i++) {
            char caracter = (char) (rand.nextInt(10) + 'a'); // Genera un carácter aleatorio entre 'a' y 'j'
            contrasena += caracter;
        }

        System.out.println("Contraseña generada: " + contrasena);
    }
}
