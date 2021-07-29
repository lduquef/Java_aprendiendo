package bebida;
import java.lang.Comparable;
abstract class Bebida implements Comparable{
    private String nombre;
    private int cantidad;
    public Bebida(String nom,int cantidad){
        nombre = nom;
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public abstract String getDescripcion();
    public int compareTo(Object miObjeto){
        Bebida objetoBebida=(Bebida) miObjeto;
        if(this.cantidad<objetoBebida.cantidad){
            return -1;
        }
        if (this.cantidad>objetoBebida.cantidad) {
            return 1;
        }
        else{
            return 0;
        }

    }
}

