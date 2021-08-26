import java.util.ArrayList;
public class Condominio {
    //Inserte acá los atributos
    private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

    //Inserte acá el método constructor
    public Condominio(){
        inmuebles = new ArrayList<>();
    }
    //Inserte acá los SETTERS Y GETTERS
    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarInmueble(Inmueble i) {
        this.inmuebles.add(i);
    }
    public void eliminarInmueble(String ID) {
        int a =  inmuebles.size();
        for (int i = 0; i < a-1; i++) {
            if (inmuebles.get(i).getnCasa() ==ID) {
                inmuebles.remove(i);
            } 
        }
    }
    
    public double calcularArriendoMensualCondominio() {
        double suma=0;
        for (int i = 0; i < inmuebles.size(); i++) {
            suma =+ inmuebles.get(i).getCostoMensual();
        }
        return suma;
    }
    public double promedioCostoInmueble() {
        double prom=0;
        prom = calcularArriendoMensualCondominio()/inmuebles.size();
        return prom;

    }
    public double desviacionEstandarCostoInmueble() {
        double n = inmuebles.size();
        double prom = promedioCostoInmueble();
        double dif = 0; 
        double suma= 0;
        double desv;
        for (int i = 0; i < n; i++) {
            dif = (inmuebles.get(i).getCostoMensual() -prom );
            suma =+ Math.pow(dif, 2);
        }
        desv = Math.sqrt(suma/n);
        return desv;
    }
}
