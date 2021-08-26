
package grafico2;
import java.awt.*;
import javax.swing.*;


public class PrincipalDibujos {
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaDibujo laVentana = new VentanaDibujo();
        laVentana.setVisible(true);
        laVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class VentanaDibujo extends JFrame{
    public VentanaDibujo(){   
    setTitle("Ventana Dibujo");
    setSize(400,270);
    LaminaDibujo lalamina = new LaminaDibujo();
    add(lalamina);
    }
}

class LaminaDibujo extends JPanel{
    public void paintComponent(g){
        g.drawRect(0,0,400,400);
    }
}    


