package segundaParte;
/*22.Escribe un programa que pida un número entero por teclado y muestre por
pantalla si es positivo, negativo o cero. Implementa y utiliza la función: */
import java.util.Scanner;
public class Ejercicio22 {


    public static int dimeSigno(int a){
        int respuesta=0;
        if(a<0){
            respuesta= -1;
        } else if (a>0){
            respuesta= 1;
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numero=entrada.nextInt();
        
        System.out.println("el numero es: "+dimeSigno(numero));
        entrada.close();
    }
}
