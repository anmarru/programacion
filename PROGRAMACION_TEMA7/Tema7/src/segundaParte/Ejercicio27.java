package segundaParte;

/*27.Realiza una función llamada sumaIntervalo() que le pasan dos long y devuelve otro
long con la suma de los números comprendidos entre los números pasados (el
primero es menor que el segundo, y ambos mayores que cero, en caso contrario
devuelve -1) */
import java.util.Scanner;
public class Ejercicio27 {

    public static long sumaIntervalo(long n, long n2){

        if (n<n2 && n>0 && n2>0){
            long suma=0;
            for(long i=n;i<= n2;i++){
                suma+=i;
            }
            return suma;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce dos numeros long: ");
        long num1=entrada.nextLong();
        long num2=entrada.nextLong();
        
        System.out.println("La suma del intervalo de los dos numeros es: "+sumaIntervalo(num1, num2));
        entrada.close();
    }
}
