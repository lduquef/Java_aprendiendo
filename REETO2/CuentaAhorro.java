public class CuentaAhorro extends CuentaBanco {
    public CuentaAhorro(String numeroCuenta, String nombrePropietario, double saldo){
        super(numeroCuenta, nombrePropietario, saldo);
    }
    public double getIEA() {
        if (getSaldo()<1000000) {
            return 0.01;
        }if (getSaldo()>=1000000 && getSaldo()<2000000) {
            return 0.0175;
        }else {
            return 0.023;
        }       
    }
    public void pagarInteres(int dias){
        if (dias>0) {
            for (int i = 0; i <= dias; i++) {
                setSaldo(getSaldo() *(1 + getIEA()/365));
            }
        }
    }
}
