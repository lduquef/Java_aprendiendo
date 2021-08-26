
package EjemploSerial;
import java.io.*;
import java.util.*;
public class Ejemplo2 {
    public static void main(String[] args) {

        Animal[] animalitos = new Animal[4];
        animalitos[0] = new Perro("sasha",12,30000,2021,8,9);
        animalitos[1] = new Perro("muñeco",1,20000,2021,8,10);
        animalitos[2] = new Perro("rambo",3,34000,2021,8,11);
        animalitos[3] = new Perro("Firulais",10,15000,2021,8,12);
        
        //serializacion
        try{
            ObjectOutputStram escribiendoArchivo =  new FileOutputStram(new FileOutputStram("D:/USER/mintic/fundamentos2/EjemploSerial/src/main/java/EjemploSerial/animal.txt")) ;
            escribiendo.writeObject(animalitos);
            escribiendoArchivo.close();
        
        }catch(Exeption e){
            System.out.println("rayos Algo anda mal");
        }   
    }
    
    //nueva clase
    class Animal implements Serializable{
        private String nombre;
        private int edad;
        private Date fechaAtencion;
        private double valorConsulta;
        
        public Animal(String n, int e, double precio,int agno,int mes,int dia){
            nombre = n;
            edad = e;
            valorConsulta = precio;
            GregorianCalendar calendario = new GregorianCalendar(agno,mes,dia);
            fechaAtencion = calendario.getTime();
        }
            public String getNombre(){
                
                return nombre;
            }
            public int getEdad(){
                return edad;
            }
            public Date getFechaAtencio(){
                return fechaAtencion;
            }
            public double getValorConsulta(){
                return 70000;
            }
            public void bajarvalorConsulta(int edad){
                double descuento = valorConsulta*edad/100;
            }
            public String toString(){
                return ("el nombre es: "+nombre+" la edad es: "+edad+" la fecha consulta: "+fechaAtencion);
            }
        }
    }


class Perro extends Animal{
    private double incentivo;
    public Perro(String n,int e ,double precio ,int agno,int mes ,int dia){
        //se llama clase padre
        super(n,e,precio,agno,mes,dia);
    }
    public void setIncentivo(double incentivo){
        incentivo= 10000;
    }
    public double getTotalConsulta(){
        double consultaBase = super.getValorConsulta();
        return consultaBase -incentivo;
    }
    public String toString(){       
    return super.toString;
    }
    
}



