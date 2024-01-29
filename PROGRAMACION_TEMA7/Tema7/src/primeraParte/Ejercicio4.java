package primeraParte;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=entrada.nextLine();
        System.out.println("Dime tu primer apelledo");
        String apellido1=entrada.nextLine();
        System.out.println("Dime tu segundo apellido");
        String apellido2=entrada.nextLine();

        String s1=nombre.substring(0,3);
        String s2=apellido1.substring(0,3);
        String s3=apellido2.substring(0,3);
        System.out.println(s1.toUpperCase()+s2.toUpperCase()+s3.toUpperCase());

        entrada.close();

    }
}