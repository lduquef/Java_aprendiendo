
package com.colecciones;

public class Cliente {
    private String nombre;  
    private String codigo;
    private double deuda;
    
    public Cliente(String nombre,String codigo,double deuda){
        this.nombre=nombre;
        this.codigo=codigo;
        this.deuda=deuda;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getcodigo(){
        return codigo;
    } 
    public double getdeuda(){
        return deuda;
    }
          
    
}
