
package exepciones;
import javax.swing.JOptionPane;
public class Ejemplo1 {
    public static void main(String[] args) {
        int[] matriz = new int[5];
        matriz[0]=3;
        matriz[1]=34;
        matriz[2]=13;
        matriz[3]=67;
        matriz[4]=-6;
        //matriz[5]=4;
        for(int i=0;i<5;i++){
            System.out.println("posición"+i+" = "+matriz[i]);
        }
        String nombre = JOptionPane.showInputDialog("cual es tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("cual es tu edad"));
        System.out.println("felicidades: "+nombre+" disfruta tus: "+edad);
    }
}
