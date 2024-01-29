public class ClaseVideojuego {
    
    
    private String titulo;
    private int pegi;
    private int unidades;
    private double precio;
    private int valoracion;
    private double campaña;


    


    public ClaseVideojuego(String titulo, int pegi, int unidades, double precio, int valoracion, double campaña) {
        this.titulo = titulo;
        this.pegi = pegi;
        this.unidades = unidades;
        this.precio = precio;
        this.valoracion = valoracion;
        this.campaña = campaña;
    }





    public String getTitulo() {
        return titulo;
    }





    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }





    public int getPegi() {
        return pegi;
    }





    public void setPegi(int pegi) {
        this.pegi = pegi;
    }





    public int getUnidades() {
        return unidades;
    }





    public void setUnidades(int unidades) {
        if(this.unidades>=0)
        this.unidades = unidades;
    }





    public double getPrecio() {
        return precio;
    }





    public void setPrecio(double precio) {
        if(this.precio>=0)
        this.precio = precio;
    }





    public int getValoracion() {
        return valoracion;
    }





    public void setValoracion(int valoracion) {
        if(this.valoracion>=0 || this.valoracion>=5)
        this.valoracion = valoracion;
    }





    public double getCampaña() {
        return campaña;
    }





    public void setCampaña(double campaña) {
        if(this.campaña>=0)
        this.campaña = campaña;
    }
        

    



}
