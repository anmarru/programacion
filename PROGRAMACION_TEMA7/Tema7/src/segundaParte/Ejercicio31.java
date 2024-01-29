package segundaParte;
/*31.Hacer una función llamada CalcularDiasMes que se le pase como parámetro un
año y un mes y devuelva los días que tiene ese mes, teniendo en cuenta los años
bisiestos. A continuación, realizar un programa al que se le introduzca una fecha y
nos informe de los días pasados desde el 1 de enero de ese año. */
public class Ejercicio31 {
    
    public static int calcularDiasMes(int mes, int año){
        if (mes==1||mes==3|| mes==5||mes==7||mes==8|| mes==10||mes==12){
            return 31;
        }
        else if(mes==2){
            if(año%400==0|| año%4==0 && año %100==0){
                return 29;
            }
            return 28;
        }else
        return 20;
    }

    public static void main(String[] args) {
        
    }
}
