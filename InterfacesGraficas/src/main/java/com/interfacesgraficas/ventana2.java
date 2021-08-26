
package com.interfacesgraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
public class ventana2 extends JFrame {
    public ventana2(){
        Toolkit laVentana = Toolkit.getDefaultToolkit();
        Dimension tamanioVentana=laVentana.getScreenSize();
        int altoVentana = tamanioVentana.height;
        int anchoVentana =tamanioVentana.width;
        setSize(anchoVentana/2,altoVentana/2);
        setLocation(anchoVentana/4,altoVentana/4);
        setTitle("mi Primera Ventana");
    
    }
}
