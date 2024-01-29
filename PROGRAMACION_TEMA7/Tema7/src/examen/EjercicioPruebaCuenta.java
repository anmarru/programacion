package examen;

public class EjercicioPruebaCuenta {

    private String titular;
    private double cantidad;

    public EjercicioPruebaCuenta(String titular) {
        this.titular = titular;
    }

    public EjercicioPruebaCuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "EjercicioPruebaCuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
        if (cantidad < 0) {
            System.out.println("ERROR! la cantidad es negativa ");
        }
    }

    public void retirar(double cantidad){
        if(cantidad<=this.cantidad){
        this.cantidad-=cantidad;
        }else{
            this.cantidad = 0;
        }
    }
    
}