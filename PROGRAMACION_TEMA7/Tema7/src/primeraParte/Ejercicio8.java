package primeraParte;
/*8. Realiza un programa que solicite que se le introduzcan una cadena y un carácter y
nos muestre cuantas veces está contenido el carácter en la cadena.
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0); // Obtenemos el primer carácter ingresado

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");

        scanner.close();
    }
}
