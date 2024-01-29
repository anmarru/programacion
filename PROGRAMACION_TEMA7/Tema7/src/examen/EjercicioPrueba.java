package examen;
import java.util.Scanner;
public class EjercicioPrueba {
    public static void main(String[] args) {
        EjercicioPruebaCuenta cuenta=new EjercicioPruebaCuenta("andrea",1000);

    
        cuenta.retirar(500);
        System.out.println(cuenta.toString());
        cuenta.ingresar(300);
        System.out.println(cuenta.toString());

        Scanner entrada=new Scanner(System.in);
        System.out.println(("ingresa un numero valido para contraseña"));
        String respuesta=entrada.nextLine();

        //if();
    }
}
