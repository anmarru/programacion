/**Realiza un programa al que se le introduzca un email y nos devuelva el nombre del
dominio y subdominios si los hubiese, es decir, lo que está entre la arroba y el
punto final*/
package primeraParte;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu correo electrónico: ");
        String email = scanner.nextLine();

        int arrobaIndex = email.indexOf('@'); // Encuentra la posición de la arroba
        int puntoIndex = email.lastIndexOf('.'); // Encuentra la posición del último punto

        if (arrobaIndex != -1 && puntoIndex != -1 && puntoIndex > arrobaIndex) {
            String dominio = email.substring(arrobaIndex + 1, puntoIndex);
            System.out.println("Dominio: " + dominio);

            String subdominio = email.substring(0, arrobaIndex);
            if (!subdominio.isEmpty()) {
                System.out.println("Subdominio: " + subdominio);
            } else {
                System.out.println("No hay subdominio.");
            }
        } else {
            System.out.println("El formato del correo electrónico no es válido.");
        }

        scanner.close();
    }
}
