package segundaParte;

import java.util.Scanner;

/*19.Escribe un programa que pida dos números reales por teclado y muestre por
pantalla el resultado de multiplicarlos. Implementa y utiliza la función*/
public class Ejercicio19 {

    public static double multiplica(double a, double b ){
        double resultado = a*b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce dos numeros realeas:");
        double numero1=entrada.nextDouble();
        double numero2=entrada.nextDouble();
        double multiplica= multiplica(numero1, numero2);// para que se guarde el resultado hay que guardarlo en una variable 

        System.out.println("la multiplicacion es: "+ multiplica);
        entrada.close();
    }

}
