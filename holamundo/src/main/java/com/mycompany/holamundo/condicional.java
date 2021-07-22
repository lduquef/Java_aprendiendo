package com.mycompany.holamundo;
import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese día de la semana en números");
        int v = sc.nextInt();
        String dia;
        
        switch(v){
            case 1:
                dia= "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
        default:
            dia = "Dia incorrecto debe ingresar un día habil";

        }
        System.out.println("el día ingresado es: "+dia);
    }
}
