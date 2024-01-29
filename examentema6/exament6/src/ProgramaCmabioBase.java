import java.util.Scanner;

public class ProgramaCmabioBase {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero decimal a convertir");
        double numero=entrada.nextDouble();

       
        System.out.println("1. ABinario \n 2. A Octal\n 0. Salir\n Introduce la opcion deseada: " );
         int opcion=entrada.nextInt();

        while (opcion==1 || opcion==2 || opcion==0){

        
            switch (opcion) {
            case 1:
                double resto=numero /2 ;
                double resto2=resto/2;
                double resto3=resto2/1;
                System.out.println(resto3+resto2+resto);

                break;
        
            case 2:
                double octal=numero/8;
                   
                double octal2=octal/8;
                double octal3=octal2/8;
                System.out.println(octal3+octal2+octal);
                break;

            case 0:
            System.out.println("Feliz examen");
             break;
        }

       } 
       entrada.close();
    }
}
