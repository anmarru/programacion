package examen;

public class ProgramaMM {
    public static void main(String[] args) {
        //import java.util.Date;

        String modelo = "iPhone 15";
        double valoracionTerminal = 120; // Valoración del terminal
        double importeCampaña = 60; // Importe de la campaña
        double importePVP = valoracionTerminal + importeCampaña; // PVP del artículo

        // Verificando si se cumple el requisito de la campaña para iPhone 15
        if (modelo.equals("iPhone 15") && valoracionTerminal >= 60) {
            double descuento = 40;
            double nuevoPVP = importePVP - descuento;

            System.out.println("Venta del iPhone 15 en WWS:");
            System.out.println("Modelo: " + modelo);
            System.out.println("Valoración del terminal: " + valoracionTerminal + "€");
            System.out.println("PVP con valoración: " + importePVP + "€");
            System.out.println("Descuento aplicado: " + descuento + "€");
            System.out.println("Nuevo PVP: " + nuevoPVP + "€");
            
            // Generar documento de venta con los datos del cliente y el artículo de PVP negativo
            generarDocumentoVenta(modelo, nuevoPVP, "1561854");
        } else {
            System.out.println("No se cumple con los requisitos de la campaña para el iPhone 15.");
        }
    }

    public static void generarDocumentoVenta(String modelo, double nuevoPVP, String codigoArticulo) {
        // Aquí iría la lógica para generar el documento de venta
        // Se omite la implementación real por simplicidad en este ejemplo
        System.out.println("Documento de venta generado para el modelo " + modelo + ".");
        System.out.println("Código de artículo de PVP negativo aplicado: " + codigoArticulo);
    }
}
    

