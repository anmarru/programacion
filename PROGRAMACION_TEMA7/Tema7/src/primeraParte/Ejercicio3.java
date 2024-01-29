package primeraParte;

/*Crea un programa que pida dos cadenas de texto por teclado y luego indique si
son iguales, además de si son iguales sin diferenciar entre mayúsculas y
minúsculas. */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una cadena de texto");
        String cadena1 = entrada.nextLine();
        System.out.println("Escribe una segunda cadena de texto");
        String cadena2 = entrada.nextLine();

        System.out.println("las cadenas sin iguales? " + cadena1.equals(cadena2));

        cadena1.equalsIgnoreCase(cadena2);
        System.out.println("Las cadenas son iguales? " + cadena1.equalsIgnoreCase(cadena2));
        
        entrada.close();

    }
}
