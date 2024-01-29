package segundaParte;
/*24.Escribe un programa que pida cinco precios y muestre por pantalla el precio de
venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función */
import java.util.Scanner;
public class Ejercicio24 {

    public static double precioConIVA(double precio){
        double conIVA=precio*1.21;
        return conIVA;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Intruduce el precio de 5 articulos");
        double precio1=entrada.nextDouble();
        double precio2=entrada.nextDouble();
        double precio3=entrada.nextDouble();
        double precio4=entrada.nextDouble();
        double precio5=entrada.nextDouble();

        
        System.out.println(precioConIVA(precio1));
        System.out.println(precioConIVA(precio2));
        System.out.println(precioConIVA(precio3));
        System.out.println(precioConIVA(precio4));
        System.out.println(precioConIVA(precio5));

        entrada.close();
    }
}
