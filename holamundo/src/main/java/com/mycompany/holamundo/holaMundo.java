package com.mycompany.holamundo;
import java.util.Scanner;

public class holaMundo {
    public static void main(String[] args) {
        // solicita un input
        Scanner sc = new Scanner(System.in);
        System.out.println("favor ingrese su nombre");
        String nombre ;
        nombre = sc.nextLine();
        System.out.println("Bienvenido" + nombre);
        sc.close();
    }
}
