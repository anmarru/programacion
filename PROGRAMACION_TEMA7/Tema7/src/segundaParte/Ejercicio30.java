package segundaParte;
import java.util.Scanner;
/*30.Programa que presente un menú y permita calcular repetidas veces a) el área de
círculo (necesitará el radio) , b) el área de cuadrado (ecesitará el lado) , c) el área de
triángulo (necesitará base y altura) d) Salir. Usar funciones para cada una de las 3
opciones. */
public class Ejercicio30 {
    
    public static double areaCirculo(double r){
        double radio= 3.14*r*r;
        return radio;
    }

    public static double areaCuadrado(double l){
        double lado=l*2;
        return lado;

    }

    public static double areaTriangulo(double base, double altura){
        double area=base*altura/2;
        return area;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige la opcion que deseas: ");
        int opcion=4;
        do{
            System.out.println("""
                \n 1)Calcular area de un circulo
                2)Calcular area de un cuadrado2
                3)Calcular area de un triángulo
                4) Salir
                    """);
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("introduce el radio del circulo: ");
                double radio=entrada.nextDouble();
                    
                    System.out.println("El area del circulo es: "+areaCirculo(radio));
                    break;
            
                case 2:
                System.out.println("Introduce el lado del cuadrado: ");
                double lado=entrada.nextDouble();
                System.out.println("El area del cuadrado es: "+ areaCuadrado(lado));
                    break;

                case 3:
                System.out.println("Introduce la base y la altura: ");
                double base=entrada.nextDouble();
                double altura=entrada.nextDouble();
                System.out.println("El área del triangulo es: "+areaTriangulo(base, altura));
                    break;
                case 4:
                System.out.println("SALIR");
                    break;
            }

        }while(opcion!=4);
        entrada.close();
    }
}
