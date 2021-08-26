
package pruebaUnitaria;
public class PruebaUnitaria {
    public static void main(String[] args) {
        calculadoraPrueba objeto = new calculadoraPrueba();
        int suma=objeto.getSumarNumeros(3, 5);
        System.out.println("el resultado de la suma es: " + suma);
        int resta=objeto.getRestarNumeros(8,5);
        System.out.println("el resultado de la resta es: " + resta);
        int multi = objeto.getMultiplicar(4, 2);
        System.out.println("el resultado de la multiplicación es: " + multi);
        int modu = objeto.Residuo(6, 4);
        System.out.println("el resultado de la modu es: " + modu);
    }
}
