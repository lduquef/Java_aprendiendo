package com.mycompany.intro_poo;


public class bebidas {
    //la funcion del private hace que NO lo pueda 
    //llamar desde afuera de la public class
    //en este caso no lo puedo llamar desde la clase principal
// donde +(publico) #(protegido) - (privado)
    private String sabor;
    private int tamanio ;
    private String tipoEnvase;
    double cantAzucar; 
    private int precio; 
    private boolean light;
    private boolean fria;

    public bebidas(){
        sabor = "manzana";
        tamanio = 350  ;
        tipoEnvase="Pet";
        cantAzucar=5.0;
        precio=500;  }
    // si se desea modificar atributos no se necesita retornar nada
    // se usa void, si por el contrario se desea retornar se usa String o int

    public String get_cantAzucar(){
        return "la cantidad de azucar es"+ cantAzucar;}
    public void set_sabor() {
        sabor ="Naranja" ;   }
    public String get_sabor() {
        return "el sabor es: " + sabor;}
    public String get_datosGenerales() {
        return "la bebida es sabor: " + sabor+"   tamaño: "+tamanio+"ml"
        +"tipo de envase: " + tipoEnvase+ " cantidad de azúcar:"+cantAzucar+"  precio:"+precio;    
    }
    public void set_light(String light){
        if(light.equalsIgnoreCase("si")){
            this.light=true;}
        else{
        this.light=false;}
    }
    public String getLight(){
        if(light==true){
        return "la bebida es light";
        }
        else{
        return "la bebida no es baja en azúcar";}
    }
    public void set_temp(String temp){
        if(temp.equalsIgnoreCase("fria")){
            this.fria=true;}
        else{
        this.fria=false;}
        }
    public String get_temp(){
        if(fria==true){
        return "la bebida esta fría";
        }
        else{
        return "Eche metela a la nevera culé calor";
        }
}
}