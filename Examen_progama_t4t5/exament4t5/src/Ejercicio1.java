import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Ejercicio1 {
    public static void main(String[] args)  {
        int numAleatorio,intentos=10,numeroRespuesta;
        numAleatorio=ThreadLocalRandom.current().nextInt(1,100+1);
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce el número que creas posible");
        numeroRespuesta=entrada.nextInt();

        if(numeroRespuesta<numAleatorio){
           
            numeroRespuesta=(numeroRespuesta+numAleatorio)/2 ;
            intentos=intentos-1;
             System.out.println("El numero que buscas es mayor, te quedan "+ intentos+ " intentos");
            
            
            }else if( numeroRespuesta>numAleatorio){
                     numeroRespuesta=(numeroRespuesta-numAleatorio)/2;
                    intentos=intentos-1;
                    System.out.println("el numero que buscas es menor, te quedan "+ intentos+ " intentos ");
              
               } else if(numeroRespuesta==numAleatorio){
                        intentos=intentos-1;
                     System.out.println("CORRECTO! el "+numeroRespuesta+" era el numero que estabas buscando, has necesitado "+ intentos+ "intentos");
                    
                    }else {
                    System.out.println(" Has perdido el numero aleatorio era "+ numAleatorio);
                    }
        
        entrada.close();



    }

}
