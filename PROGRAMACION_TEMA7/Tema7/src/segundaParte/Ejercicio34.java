package segundaParte;
/*34.Un número primo es aquel que solo tiene como divisores el número 1 y a él
mismo. Usando la función del programa anterior, haz un programa que muestre la
suma de los números primos comprendidos entre 1 y 1000. */

public class Ejercicio34 {

    public static void cantidadDivisoresPrimos() {
            int sumaPrimos=0;

        for (int i = 1; i <= 1000; i++) {

            if (Ejercicio33.cantidadDividores(i)==2) {

                sumaPrimos+=i;
            }
            System.out.println(sumaPrimos);
        }
    }

    public static void main(String[] args) {
        cantidadDivisoresPrimos();

    }
}
