public class ClasePlataforma {

    private  final  String identificador;
    private  final String descripcion;

    public  ClasePlataforma(String descripcion){
        this.descripcion=descripcion;
        this.identificador=identificador;
    }

    @Override
    public String toString() {
        return "ClasePlataforma []";
    }

    public  String getIdentificador() {
        return identificador;
    }

    public String setIdentificador(String descripcion){
        return this.descripcion;
    }


    

}
