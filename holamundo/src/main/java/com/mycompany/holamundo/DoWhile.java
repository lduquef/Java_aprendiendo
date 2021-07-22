package com.mycompany.holamundo;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
      
        double n = Math.random();
        int aleatorio = (int)(n*100);
        System.out.println(aleatorio);

        Scanner entra = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;
        do {
            intentos++;
            System.out.println("intentos: "+intentos+"  Ingrese el número");
            numero = entra.nextInt();

            if(aleatorio<numero){
                System.out.println("ingrese un número menor");
            }
            else if(aleatorio>numero){
                System.out.println("debe ingresar uno mayor");
            }
        } while(numero!=aleatorio);
        System.out.println("felicidades ese es el numero");
    } 

}
