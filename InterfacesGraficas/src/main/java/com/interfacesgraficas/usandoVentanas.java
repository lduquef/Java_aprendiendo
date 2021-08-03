/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfacesgraficas;
import javax.swing.*;
/**
 *
 * @author USER
 */
public class usandoVentanas {
    
    public static void main(String[] args){
        ventana ventana1 = new ventana();
        ventana1.setVisible(true);//muestra la ventana
      ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ventana1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
