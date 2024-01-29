package segundaParte;
/*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
mayor de edad o no. Implementa y utiliza la función:*/
import java.util.Scanner;

public class Ejercicio20 {
    
    public static boolean esMayorEdad(int a){
        if (a>=18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu edad ");
        int edad=entrada.nextInt();
        
        System.out.println("Eres mayor de edad?: "+esMayorEdad(edad));
        entrada.close();
    }
}
