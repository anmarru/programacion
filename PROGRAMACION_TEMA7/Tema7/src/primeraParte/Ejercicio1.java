package primeraParte;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una cadena ");
        String cadena = entrada.nextLine();

        System.out.println(cadena.toUpperCase());// me convierte la cadena de texto en mayuscula (a)

        System.out.println(cadena.toLowerCase());// me convierte la cadena de texto en minuscula (a)

        System.out.println(cadena.indexOf("x"));// me devuelve la posicion donde esta el caracter o la cadena, si no
                                                // esta devuelve un -1(b)

        if (cadena.length() > 10) {
            System.out.println("la cadena contiene mas de 10 posiciones");
        } else {
            System.out.println("la cadena NO contiene mas de 10 posiciones");
        } // me dice si la cadena mas de 10 posiciones (c)


        if (cadena.indexOf("x", 4) != -1) {// si es diferente a -1 si contiene la x(porque al no estar devuelve -1) (d)
            System.out.println("la cadena SI contiene el caracter x a partir de la posicion 4");
        } else {
            System.out.println("la cadena NO contiene el caracter x a partir de la posicion 4");
        }
        

        System.out.println(cadena.substring(0, 05));// devuelve una cadena de la 5 primeras posiciones de la cadena(e)
        System.out.println(cadena.substring(cadena.length()-5));// devuelve una cadena con las ultomas 5 pocicones de la cadena(f)

        System.out.println("la cadena es igual que la cadena hola? "+cadena.equals("hola"));// compara la cadena si es igual a hola, si es igual devuelve true (g)

        System.out.println("dime un numero de varias cifras");
        String cadena2=entrada.nextLine();
        String.valueOf(cadena2);// convierte un String a numero (h)

        /*i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha
cadena es un número hexadecimal, esto es, contiene solo dígitos decimales
(del 0 a 9) y letras de la A a F.*/
        System.out.println("Dime un numero hexadecimal ");
        String cadena3=entrada.nextLine();
        Integer.parseInt(cadena3,16);

        //j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
        System.out.println("escribe algo que lleve prueva");
        String cadena4=entrada.nextLine();
        System.out.println(cadena4.replace("prueva","prueba"));
        String cadena5=cadena4.replace(cadena3, cadena4);//sustituye una palabra por otra (j)

        
        //k. Decir si la primera posición de la cadena es igual a la última.
        boolean primeraIgualUltimaCadena = cadena.length() > 0 && cadena.charAt(0) == cadena.charAt(cadena.length() - 1);//verificamos si la longitud es mayor q 0 y aseguro q haya algun caracter, despues compara el caracter con la primera posision
        //con el caracter de la ultima posicion -1
        if (primeraIgualUltimaCadena) {
            System.out.println("En la primera cadena, la primera y última posición son iguales.");
        } else {
            System.out.println("En la primera cadena, la primera y última posición son diferentes.");
        }

        //L. Decir cuántos dígitos numéricos hay en la cadena.
        System.out.println("Dime una cadena que contenga numeros y te dire los digitos que contiene");
        String cadena6=entrada.nextLine();
        int contadorDeDigitos=0;
        for (int  i = 0 ;i < cadena6.length(); i++) {
            char caracter=cadena6.charAt(i);
            if(caracter >='0' && caracter <='9'){
                contadorDeDigitos++;
            }
        }
        System.out.println("La cadena tiene " + contadorDeDigitos + " dígitos numéricos.");
        /*para cada carácter en la cadena, se compara si es mayor o igual que el carácter '0' y menor o igual que el carácter '9',
        ya que en la tabla ASCII los caracteres '0' al '9' están consecutivos. Si el carácter está en este rango,
        se considera como un dígito numérico y se incrementa el contador contadorDigitos.
         Finalmente, se imprime la cantidad de dígitos numéricos encontrados en la cadena. */

        //M. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
        String cadenaInvertida=new StringBuilder(cadena).reverse().toString();
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
        /*En este código, se utiliza la clase StringBuilder para invertir la cadena original y se guarda el resultado en cadenaInvertida.
        Luego se compara la cadena original con su versión invertida utilizando el método equals(). Si son iguales, se imprime un mensaje 
        indicando que la cadena es un palíndromo; de lo contrario, se imprime un mensaje indicando que no lo es.*/


        /*N. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones intercambiadas. 
        Ejemplo: si introducen: “abcde”, obtendría “ebcda”.*/
        
        if (cadena.length() >= 2) {
            char primerCaracter = cadena.charAt(0);
            char ultimoCaracter = cadena.charAt(cadena.length() - 1);
            String nuevaCadena = ultimoCaracter + cadena.substring(1, cadena.length() - 1) + primerCaracter;
            System.out.println("Cadena con primera y última posiciones intercambiadas: " + nuevaCadena);
        } else {
            System.out.println("La cadena es demasiado corta para intercambiar las posiciones.");
        }
        /*Este código solicita al usuario que introduzca una cadena, luego verifica si la longitud de la cadena es al menos 2.
        Si es así, se extraen el primer y último caracteres. Luego se crea una nueva cadena intercambiando estos caracteres
        utilizando la concatenación adecuada, excepto el primer y último carácter que se toman por separado. Finalmente,
        se muestra la nueva cadena con las posiciones intercambiadas.*/
        
        entrada.close();

    }

    
}







    

