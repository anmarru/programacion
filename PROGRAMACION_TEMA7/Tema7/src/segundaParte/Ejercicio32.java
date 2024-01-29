package segundaParte;
import java.util.Scanner;
/*32.Programa que calcule el factorial de números menores de 20. El programa permite
al usuario meter los números que desee y finalizará cuando meta un número
menor que 1 o mayor que 20. Crea las funciones que consideres útiles y que
puedas reutilizar en otros programas. */

public class Ejercicio32 {
    
    public static int factorial(int numero){
        int factorial=1;
        if (numero<21){
            
            for(int i=2;i<=numero;i++){
                factorial*=i;
            }
            return factorial;
        }else{
            return 0;
        }
        
    }


    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        do{
            System.out.println("Introduce numero para factorial: ");
            numero=entrada.nextInt();
            
            System.out.println("El factorial del numero: "+numero+" es: "+factorial(numero));
        }while(numero!=0&& numero!=21);
        entrada.close();
    }
}
