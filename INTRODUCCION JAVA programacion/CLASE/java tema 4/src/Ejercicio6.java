import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        Double pinta= 0.473176,pintas;
        System.out.println(" Cuantas pintas te has tomado?: ");
        pintas=entrada.nextDouble();
        System.out.println("Te has tomado "+pintas*pinta +" Litros");
        entrada.close();//se debe cerrar el Scanner para que no de error
    }
    
}
