package primeraParte;

import java.util.Scanner;
/*Crea un programa que pida una cadena de texto por teclado y luego muestre cada
palabra de la cadena en una línea distinta */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String texto=entrada.nextLine();

        String palabra= "";

        for(int i = 0;i<texto.length();i++){
            char caracter=texto.charAt(i);
            if (caracter != ' ') {
                palabra+=caracter;
                
            }else{
                System.out.println(palabra);
                palabra="";
            }
        }
        if(!palabra.equals(""));//si la palabra no es igual al espacio
        System.out.println(palabra);

        entrada.close();


    }
}
