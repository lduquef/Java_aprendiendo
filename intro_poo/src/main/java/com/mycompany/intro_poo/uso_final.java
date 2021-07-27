package com.mycompany.intro_poo;    

public class uso_final{
    public static void main(String[] args){
    //instanciar o crear objetos de la clase empleados
    Empleados secretaria = new Empleados("Claudia");
    Empleados gerente = new Empleados("Fabiola Díaz");
    secretaria.setCambiaEstado("Contrato a término indefinido");
    secretaria.setCambiaNombre("Claudia Naranjo");
    System.out.println(secretaria.getDevuelveDatos());
    System.out.println(gerente.getDevuelveDatos());
    System.out.println(Empleados.getIDSiguiente());
    }
}

class Empleados{
// se crean campo de c clases o atributos
private String nombre;
private String estado;
private int ID;
private static int IDSiguiente=1001;
//static indica que es una variable de clase y por defecto pertenece a la clase
//y no al objeto ni sirve para acceder a variables y constantes al menos que tambien sean estatic
//se accede nom_clas.static_name
public Empleados(String nom){
    nombre=nom;
    estado ="periodo de prueba";
    ID=IDSiguiente;
    IDSiguiente++;    
//this.ID = ID;
}
// nuevamente el metodo static pertenece a la clase y no al objeto
public static String getIDSiguiente(){
    return "el ID siguiente es:"+IDSiguiente;
}
//metodo setter
public void setCambiaEstado (String estado){
    this.estado = estado;
}
//metodo getter
public String getDevuelveDatos(){
    return "El empleado "+nombre+" con ID: "+ID+ " y actualmente esta en "+estado;
}
public void setCambiaNombre (String nombre){
    this.nombre = nombre;
}
}