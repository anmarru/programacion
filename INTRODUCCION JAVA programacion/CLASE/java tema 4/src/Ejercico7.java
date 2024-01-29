import java.util.Scanner;
public class Ejercico7 {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        int aula=24,pupitres;
        System.out.println("Cuantos pupitres tienes: ");
        pupitres= entrada.nextInt();
        // hago division para saber cuantos pupitres me caben y despues saco el modulo para q me diga lo que me sobra
        System.out.println("puedes llenar " + pupitres/aula+" y te sobran "+ pupitres%aula );
        entrada.close();
    }
}
