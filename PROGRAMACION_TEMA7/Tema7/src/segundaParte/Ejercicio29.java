package segundaParte;

import java.util.Scanner;
/*29.Realiza una función llamada aleatorio() que se le pasan dos valores enteros
devuelve un entero al azar comprendido entre esos dos valores (el primero es
menor que el segundo, y ambos mayores que cero, en caso contrario devuelve -1) */
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio29 {
    
    public static int aleatorio(int a, int b){
        if(a<b && a>0 && b>0){
            
           

            //int numero=random.nextInt (b-a+1)+a;// por que se tiene que poner b antes q a y sumar a?
            int numero =ThreadLocalRandom.current().nextInt(a,b+1);
            return numero;
        }else{
            return -1;
        }
        
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el rango de valores, el primero menor que el segundo: ");
        int numero1=entrada.nextInt();
        int numero2=entrada.nextInt();
        System.out.println(aleatorio(numero1,numero2));
        entrada.close();
    }
}
