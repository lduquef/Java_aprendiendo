public class Inmueble {
    
    //Inserte acá los atributos
    private String nCasa;
    private String IDArrendador;
    private double costoMensual;
    private int cantidadMesesArrendado;
    //Inserte acá el método constructor
    public  Inmueble(String nCasa,String IDArrendador,double costoMensual,int cantidadMesesArrendado) {
        this.nCasa = nCasa;
        this.IDArrendador = IDArrendador;
        this.costoMensual = costoMensual;
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }
    //Inserte acá los SETTERS Y GETTERS
    // setters
    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }
    public void setIDArrendador(String iDArrendador) {
        IDArrendador = iDArrendador;
    }
    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }
    public void setCantidadMesesArrendado(int cantidadMesesArrendado) {
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }
    public String getnCasa() {
        return nCasa;
    }
    public String getIDArrendador() {
        return IDArrendador;
    }
    public double getCostoMensual() {
        return costoMensual;
    }
    public int getCantidadMesesArrendado() {
        return cantidadMesesArrendado;
    }
}
