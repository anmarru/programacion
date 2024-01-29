import java.util.Scanner;// llamo a la libreria sacanner para q imprima en pantalla
public class Ejercicio3 { //creo mi clase
    public static void main (String [] args){
        Scanner leer=new Scanner (System.in);// vamos a pedir 3 numeros
        int a,b,c;//defino mis variables (como son numeros enteros son int)
        System.out.println("introduce 3 numeros ");// pido 3 numeros al usuario
        //los leo y les pongo nombre
        //para que los muestre tengo que poner nextInt para que lea esos numeros
        a=leer.nextInt();
        b=leer.nextInt();
        c=leer.nextInt();
        //depues los imprimo en pantalla con las operaciones que deseo
        System.out.println((a+b)*c);
        leer.close();
    }
}
