package com.mycompany.intro_poo;
import java.util.*;
public class clientes{
    public static void main(String[] args){
        construyeClientes[] misClientes = new construyeClientes[4];
        misClientes[0]=new construyeClientes("Juana Gómez",8000,2021,02,18); 
        misClientes[1]=new construyeClientes("Milton López",5000,2021,03,01);     
        misClientes[2]=new construyeClientes("María Pérez",10000,2021,05,30); 
        misClientes[3]=new construyeClientes("Fernando");
    for (construyeClientes c:misClientes){
        System.out.println("nombre: "+c.getNombre()
        +" credito: "+c.getCredito()+" fecha: "+c.getfecha());
    }
    }
}

class construyeClientes{
    private String nombre;
    private double credito;
    private Date fechaServicio;

    public construyeClientes(String nom,double cred,int anio,int mes,int dia){
    nombre =nom;
    credito = cred;
    GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
    fechaServicio = calendario.getTime();
    }
    public construyeClientes(String nom){
//        nombre =nom;
        this(nom,1000,2021,07,21);
    }
    

    public String getNombre(){
        return nombre;
    }
    public double getCredito(){
        return credito;
    }
    public Date getfecha(){
        return fechaServicio;
    }
//    public void setsubeCredito(double porcentaje){
//        double aumento =
//        credito = credito(1+porcentaje);
//    }
}