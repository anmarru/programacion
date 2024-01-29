//llamo a la libreria scanner para q imprima en pantalla
import java.util.Scanner;
//creo mi clase
public class Ejercicio4 {
    public static void main(String[]args){
        // llamo al scanner en este caso le asigno la palabra leer
        Scanner leer=new Scanner(System.in);
        //defino variables
        double cena;
        int personas;
        //pido que imprima en pantalla
        System.out.println ("introduce precio de la cena: ");
        //asigno lo que quiero que se imprima en pantalla y lo leo
        cena= leer.nextDouble();
        System.out.println("introduce numero de personas: ");
        personas= leer.nextInt();
        //ahora solo tengo que hacer la operacion y saldra en pantalla
        System.out.println ("cada uno paga: "+(cena/personas));
        leer.close();//hay que cerrar el scanner
    }
}
