
public class CuentaBanco{
    //Inserte acá los atributos
    private String numeroCuenta;
    private String nombrePropietario;
    private double saldo;
    
    //Inserte acá el método constructor
    public  CuentaBanco( String numeroCuenta , String nombrePropietario, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo=saldo;
    }
    //Inserte acá los SETTERS Y GETTERS
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }   
    public String getNombrePropietario() {
        return nombrePropietario;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void depositar(double c){
        saldo +=c;
    }
    public void retirar(double c) {
        double condi = c + 0.05*c;
        if (condi<= saldo) {
            saldo -= c - condi;
        }
    }
    
}