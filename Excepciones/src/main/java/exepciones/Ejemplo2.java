package exepciones;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
public class Ejemplo2 {

    public static void main(String[] args) {
        VentanaConImagen lasImagenes =  ;        
    }
}
class VentanaConImagen extends JFrame{
    public VentanaConImagen(){
    setTitle("Ventana de imagen");
    setBounds(750,300,300,300);
    LaminaConImagen laLamina = new LaminaConImagen();
    add(laLamina);
    }
}

class LaminaConImagen extends JPanel{
    private Image imagen;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    File laimagen=new File("Captura.JPG");
    try{
    imagen = ImageIO.read(laimagen);
    g.drawImage(imagen, 5, 5, null);
    }catch(IOException e){
        System.out.println("se produjo un error al leer la imagen");
        g.drawImagen(imagen,5,5,null)
    }      
    }
    
}
