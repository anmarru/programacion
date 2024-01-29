package primeraParte;
/*Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama
me mima” dirá que hay:
*/
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            // Comprobamos si el caracter es una vocal y aumentamos el contador correspondiente
            switch (caracter) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }

        // Mostramos los resultados
        System.out.println("Cantidad de 'a': " + contadorA);
        System.out.println("Cantidad de 'e': " + contadorE);
        System.out.println("Cantidad de 'i': " + contadorI);
        System.out.println("Cantidad de 'o': " + contadorO);
        System.out.println("Cantidad de 'u': " + contadorU);

        scanner.close();
    }
}
    
    

