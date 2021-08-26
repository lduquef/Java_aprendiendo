
package pruebaUnitaria;

public class calculadoraPrueba {
    public int getSumarNumeros(int num1,int num2){
        return num1+num2;
    }
    public int getRestarNumeros(int num1,int num2){
        return num1-num2;
    }
    public int getMultiplicar(int num1,int num2){
        return num1*num2;
    }
    public double getDivision(double num1,double num2){
        return num1/num2;
    }
    public int Residuo(int num1,int num2){
        return num1%num2;
    }
    public double getRaiz (int numero){
        double resultado = Math.sqrt(numero);
        return resultado;
    }
    
}
