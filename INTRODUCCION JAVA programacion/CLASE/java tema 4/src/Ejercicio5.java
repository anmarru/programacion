import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
    Scanner leer=new Scanner(System.in);
    double horas,minutos,segundos,dias;//como ya se cuanto vale cada variable las defino
    horas=24;
    minutos=60;
    segundos=60;
    System.out.println("introduce el número de días: ");
    dias=leer.nextDouble();
    System.out.println ("horas "+(horas=horas*dias)+ " minutos "+(minutos=horas* segundos)+ ( " segundos "+(segundos=minutos*segundos)));
    leer.close();
    }
}