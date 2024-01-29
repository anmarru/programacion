package segundaParte;
/*28.Realiza una función llamada contarCeros() que se le pasa una cadena y devuelve la
cantidad de ceros que tiene. */
import java.util.Scanner;
public class Ejercicio28 {
    
    public static int contarCeros(String cadena){
        int ceros=0;
        for (int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)== '0'){
                ceros++;
            }
        }
        return ceros;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce una cadena que contenga ceros para contarlos: ");
        String cadena=entrada.nextLine();
        int ceros=contarCeros(cadena);
        System.out.println("Tú cadena tiene: "+ ceros+" ceros");
        entrada.close();
    }



}
