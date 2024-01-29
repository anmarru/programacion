package segundaParte;
/*23.Escribe un programa que pida un valor entero en millas y muestre su equivalente
en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y
utiliza la función: */
import java.util.Scanner;
public class Ejercicio23 {
    
    public static double millas_a_kilometros(int millas){
        double milla= 1.60934;
        milla=millas*milla;
        return milla;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un valor entero en millas");
        int millas=entrada.nextInt();
        System.out.println(millas_a_kilometros(millas)+" kilometos");

        entrada.close();
    }
}
