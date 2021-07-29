
package bebida;

class Licor extends Bebida {

    private String marca;
    private int gradoAlcohol;
    
    public Licor(String nom,int cant, String marca, int gradoAlcohol) { 
        
        super(nom,cant);
        
        this.marca=marca;
        this.gradoAlcohol=gradoAlcohol; 
    }
    
    public String getDescripcion() {
        return "Esta bebida es un licor"+ " de marca "+marca+" y tiene: "+gradoAlcohol + " grados de alcohol";
    }
}
