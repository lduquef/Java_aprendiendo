import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        int ingreso;
        int acomu=1;
        Scanner entradaScanner = new Scanner(System.in);
        ingreso = entradaScanner.nextInt();
        for (int i = 1; i <= ingreso; i++) {
            acomu = acomu*i;
        }
        System.out.println(acomu);
        entradaScanner.close();
    }
}
