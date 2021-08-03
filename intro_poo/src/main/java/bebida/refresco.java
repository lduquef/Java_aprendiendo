package bebida;

class refresco extends Bebida implements granizado{
    
    private String tipo;
    private String sabor;
    
    public refresco(String nom,int cant,String tipo,String sabor) {
        super(nom,cant);
        this.tipo =tipo;
        this.sabor = sabor;
    }
    public String llevarOsitio(String llevarOsitio){
        return "el cliente decidio"+llevarOsitio;
    }
    public String getDescripcion(){
        return "Este refresco es de tipo: "+tipo+ " y tiene sabor a:"+sabor;
    }
}
