package com.mycompany.intro_poo;
// import javax.swing.JOptionPane;
public class licor extends bebidas{
    private int gradoAlcohol;
    private int anejamiento;

    public licor(int gradoAlcohol,int anejamiento){
        super();
        this.gradoAlcohol = gradoAlcohol;
        this.anejamiento=anejamiento;
    }
    public String getDatosLicor(){
        return "el grado de alcohol es: "+gradoAlcohol+" y el año de cosechaes: "+anejamiento;
    }
}