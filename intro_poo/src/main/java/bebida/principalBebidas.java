package bebida;
import java.util.Arrays;
public class principalBebidas {
    public static void main(String[] args) {
        //crear instancia de los diferentes objetos
        //y almacena un array
        Bebida[] lasbebidas = new Bebida[3];
        lasbebidas[0]= new Licor("vino",20,"GatoNegro",25);
        lasbebidas[1]= new Licor("whisky",10, "Old Pard", 37);
        lasbebidas[2]=new refresco("fanta",1,"jugo", "manzana");
        
        // if(lasbebidas[2] instanceof Bebida){
        //     System.out.println("es estancia de bebida");         
        // }
        
        Arrays.sort(lasbebidas);
        for(Bebida b:lasbebidas){
            System.out.println("cantidad: "+b.getCantidad()+" "+b.getNombre()+", "+b.getDescripcion());
        }
    }
}
