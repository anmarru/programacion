package segundaParte;
import java.util.Scanner;
/*25.Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
pantalla su área y su perímetro. Implementa y utiliza las funciones: */
public class Ejercicio25 {
    
    public static double perimetroRectangulo(double ancho, double alto){
        double perimetro=((ancho+alto)*2);
        return perimetro;
    }
    
    public static double areaRectangulo(double ancho, double alto){
        double area=(ancho*alto);
        return area;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduche el ancho y el alto del rectangulo: ");
        double ancho=entrada.nextDouble();
        double alto=entrada.nextDouble();

        System.out.println("El perimetro es: "+ perimetroRectangulo(ancho, alto)+" El area es: "+ areaRectangulo(ancho, alto));

        entrada.close();
    }
}
