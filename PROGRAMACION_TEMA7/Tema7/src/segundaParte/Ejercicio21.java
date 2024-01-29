package segundaParte;
/*21.Escribe un programa que pida dos números enteros por teclado y muestre por
pantalla cual es el mínimo. Implementa y utiliza la función: */

import java.util.Scanner;

public class Ejercicio21 {
     
    public static int minimo(int a, int b){
        int respuesta=0;
        if(a<b){
           respuesta= a;
        }else{
             respuesta=b;
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dime dos numeros: ");
        int numero1=entrada.nextInt();
        int numero2=entrada.nextInt();
        int respuesta=minimo(numero1, numero2);
        System.out.println("El numero minimo es: "+respuesta);
        entrada.close();
    }
    

}
