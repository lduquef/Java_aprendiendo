
package exepciones;
import java.util.*;
public class ejemplo3 {

    public static void main(String[] args) {
      System.out.println("¿Qué deseas hacer?");
      System.out.println("1. Ingresar pedido");
      System.out.println("2.salir");
      
      Scanner entrada= new Scanner (System.in);
      int decision = entrada.nextInt();
      if(decision==1){
          pedirDatos();
      }else{
          System.out.println("vuelve pronto");
      }
    }
    
    static void pedirDatos(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escriba su nombre");
        String nombre_usuario=entrada.nextLine();
        System.out.println("cuantos refrescos comprar");
        int cant=entrada.nextInt();
        System.out.println("hola "+nombre_usuario+" se le servirán "+cant);
    }
}
