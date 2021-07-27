package com.mycompany.intro_poo;
public class ClasePrincipal{

    public static void main(String[] args){
        //crear instancia de tipo bebidas
        licor vino = new licor(32,1999);
        vino.set_sabor("uva");

        vino.set_temp("no");
        System.out.println(vino.getDatosLicor()+vino.get_sabor()+vino.get_temp());
    }
}