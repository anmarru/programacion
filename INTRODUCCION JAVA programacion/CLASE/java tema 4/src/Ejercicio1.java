import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) { 
        String nombre;
        Scanner entrada=new Scanner(System.in);
        System.out.print("introduce tu nombre: ");
        nombre=entrada.nextLine();
        System.out.println("Buenos dias "+nombre);
        entrada.close();
    }
}


