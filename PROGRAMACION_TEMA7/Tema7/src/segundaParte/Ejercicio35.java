package segundaParte;
/*35.Crea las siguientes funciones matemáticas:
a). masPrimo: Devuelve el siguiente menor primo que es mayor a un número que
se le pasa como parámetro, b). digitos. Devuelve el número de dígitos que tiene un número que se le pasa
como parámetro, c). digitoN. Devuelve el dígito en la pasición n de un número entero que se le pasa
como parámetro. Si no lo encuentra devuelve -1, d). posicionDigito. Devuelve la primera posición de un dígito en un número
entero. Devuelve -1 si no lo encuentra. */

public class Ejercicio35 {
    
    public static int masPrimo(int n){//a
        for(int i=n+1; ;i++){
            if( Ejercicio33.cantidadDividores(i)==2){
                return i;
            }
            return -1;
        }
    }


    public static int digitos(double digito){
        int cont=0;
        for(int i=1;i<=99;i++){
            cont++;
            digito=digito/10;
        }
            if(digito<=0){
                return cont;
            }
        
    
    }

    public static int posicionDigito(int numero, int posicion){
        //pasar el numero a cadena
        String cadena= ""+ numero;
        //recorrer todos los caracteres de la cadena si el cararter es igual al que estoy buscando devuelve posicion sino devuelvo -1
        for(int i=0; i< cadena.length();i++){
           // char c=String.valueOf(posicion).charAt(0);
            if(cadena.charAt(i)==(""+posicion).charAt(0)){
                return i+1;
            }
            
        }
        return -1;
    }






}
