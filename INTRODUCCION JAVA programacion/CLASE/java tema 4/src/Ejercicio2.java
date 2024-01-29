import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args) {
    Scanner entrada= new Scanner (System.in);
    System.out.println("introduce tu nombre ");
    String nombre=entrada.nextLine();
    System.out.println("introduce tus apellidos");
    String apellidos=entrada.nextLine ();
        System.out.println("Buenos dias "+nombre + apellidos);
        entrada.close();
    }
}