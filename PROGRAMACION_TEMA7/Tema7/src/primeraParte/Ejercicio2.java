/*Diseña un algoritmo capaz de obtener la letra del nif a partir del número de dni.
Consiste en dividir dicho número entre 23 y tomar el resto de la división
asignándole la letra correspondiente según la siguiente tabla. Almacena las letras
del NIF en una cadena*/
package primeraParte;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese 8 num de deni");
        int nif=entrada.nextInt();
        int resultadoLetra=nif%23;
        System.out.println(letras.charAt(resultadoLetra));
        entrada.close();
    }
    
}
