public class CuentaCorriente extends CuentaBanco{
    private double cuotaManejo;

    public CuentaCorriente(String numeroCuenta, String nombrePropietario, double saldo,double c){
        super(numeroCuenta, nombrePropietario, saldo);
        this.cuotaManejo = c;
    }
    public double getCuotaManejo() {
        return cuotaManejo;
    }
    public void setCuotaManejo(double cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }

    public void cobrarCuotaManejo(){
        setSaldo(getSaldo()-this.cuotaManejo);
    } 
}
