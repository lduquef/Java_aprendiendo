package com.mycompany.intro_poo;
// import javax.swing.JOptionPane;
public class ClasePrincipal{

public static void main(String[] args){
    // String temp;
    // temp = javax.swing.Joptionpane("esta fria?");

    bebidas Gaseosa = new bebidas();
    // System.out.println("esta bebida tiene un total de: "+Gaseosa.cantAzucar+" % de su contenido en azúcar");

    // System.out.println(Gaseosa.get_cantAzucar());
    // System.out.println(Gaseosa.get_sabor());
    // Gaseosa.set_sabor();
    System.out.println(Gaseosa.get_datosGenerales());
    Gaseosa.set_light("no");
    System.out.println(Gaseosa.getLight());
    Gaseosa.set_temp("fria");
    System.out.println(Gaseosa.get_temp());

}
}