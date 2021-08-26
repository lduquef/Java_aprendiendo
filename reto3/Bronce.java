    public class Bronce extends Asiento {
        // ^ hereda de Asiento   
    //Inserte acá el método constructor
    public Bronce(String ID,char tipo){
    super(ID, tipo);
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public String imprimirMenuPantalla() {
        return "BRONCE"; //ojo modificar 
    }
    }
