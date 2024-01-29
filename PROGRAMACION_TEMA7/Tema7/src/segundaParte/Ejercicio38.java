package segundaParte;
/* */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio38 {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce la longitud de la contraseña: ");
        int longitud=entrada.nextInt();
        System.out.println("Dime el nivel de seguridad que quieres:\n" +
                "1. contraseña con letras minúsculas\n" +
                "◦ 2. contraseña con letras minúsculas y mayúsculas (al menos 1 de cada)\n" +
                "◦ 3. contraseñas con mayúsculas, minúsculas y números (al menos 1 de cada)\n" +
                "◦ 4. contraseñas con mayúsculas, minúsculas, números y símbolos (al menos 1 de cada\n");
        int seguridad=entrada.nextInt();
        System.out.println("La contraseña es: "+generarContraseñaSegura(longitud,seguridad));
        entrada.close();
    }

    /**
     * generador de contraseñas seguro
     * @param numCaracter long de la contraseña
     * @param nivelDeSeguridad nivel de seguridad
     *
     * @return
     */

    public static String generarContraseñaSegura(int numCaracter,int nivelDeSeguridad) {
        //controlar parametros
        if(numCaracter<=0){
            numCaracter=8;
            nivelDeSeguridad=2;
        }
        if (nivelDeSeguridad>numCaracter) {
            nivelDeSeguridad=numCaracter;

        }
        if(nivelDeSeguridad>4 || nivelDeSeguridad<1) nivelDeSeguridad=4;

        //establecer los caracteres segun el nivel de seguridad
        String minusculas="abcdefghijklmnopqrstuvwxyz";
        String mayusculas=minusculas.toUpperCase();
        String numeros="0123456789";
        String simbolos=":!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        //definicion de los posibles simbolos a usar
        String usoSimbolos=minusculas;
        String clave="";
        //para que la contraseña tenga mayusculas
        clave+=getLetraAzar(minusculas);
        switch (nivelDeSeguridad) {
            case 2:
                clave+=getLetraAzar(mayusculas);
                usoSimbolos += mayusculas;
                break;

            case 3:
                clave+=getLetraAzar(mayusculas);
                clave+=getLetraAzar(numeros);
                usoSimbolos = usoSimbolos + mayusculas + numeros;
                break;
            case 4:
                clave+=getLetraAzar(mayusculas);
                clave+=getLetraAzar(numeros);
                clave+=getLetraAzar(simbolos);
                usoSimbolos = usoSimbolos + mayusculas + numeros + simbolos;
                break;

        }

        for(int i =1;i<=numCaracter-nivelDeSeguridad;i++){
            //elegimos un caracter de entre los simbolos, no es -1 porque es el indice que debemos usar
            clave+=getLetraAzar(usoSimbolos);
        }
        return desordenar(clave);

    }
    public static char getLetraAzar(String cadena){
        return cadena.charAt(ThreadLocalRandom.current().nextInt(cadena.length()));

    }
    //devuelve los caracteres de la cadena pero desordenados
    public static String desordenar(String  cadena){
        StringBuilder cadena2=new StringBuilder(cadena);
        String cadenaDesordenada="";
        int num;
        while (cadena2.length()!=0){
            //buscamos un número aleatorio
            num=ThreadLocalRandom.current().nextInt(cadena2.length());
            //buscamos una posicion aleatoria en la cadena2 que metemos en la cadenaDesordenada y borramos de
            //la cadena2
            cadenaDesordenada+=cadena2.charAt(num);
            cadena2.deleteCharAt(num);
        }
        return cadenaDesordenada;




    }
}
