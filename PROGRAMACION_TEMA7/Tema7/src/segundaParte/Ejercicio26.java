package segundaParte;

import java.util.Scanner;
/*26.Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
desde 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa
y utiliza las funciones: */

public class Ejercicio26 {

    public static int suma1aN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int productorio1aN(int n) {
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }
        return producto;
    }

    public static double intermedio1aN(int n){
        return (1+n)/2;
        /* double intermedio=0;
        for(int i=0;i<=n;i++){
            intermedio +=n/2;
        }
        return intermedio;*/
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int numero = entrada.nextInt();
        System.out.println("Su sumatorio es: " + suma1aN(numero) + "\n" + "Su producto es: " + productorio1aN(numero)+"\n"+"Su valor intermedio es: "+intermedio1aN(numero));
        entrada.close();

    }
    
}
