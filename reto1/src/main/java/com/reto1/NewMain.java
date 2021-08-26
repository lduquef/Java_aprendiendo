
package com.reto1;

public class NewMain {
    public static void main(String[] args) {
        
    Autobus1 bus = new Autobus1("carlos",30, false);
    //     System.out.println(bus.isPuertaAbierta());
    //     bus.gestionarPuerta();
    //     System.out.println(bus.isPuertaAbierta());  
    //     bus.recogerPasajero(1); 
    //     bus.gestionarMarcha();
    //     bus.moverArriba(10); 
    //     System.out.println(bus.isPuertaAbierta());
    //     bus.gestionarPuerta();
    //     System.out.println(bus.isPuertaAbierta());
    //     bus.gestionarMarcha();
    //     bus.moverIzquierda(10);
    //     bus.moverArriba(3); 
    //     System.out.println(bus.isPuertaAbierta());
    //     System.out.println(bus.calcularDistanciaAcopio());

        bus.moverDerecha(5);
        bus.gestionarWifi();
        bus.gestionarAireAcondicionado();
        bus.gestionarMarcha();
        bus.gestionarMotor();
        bus.gestionarMarcha();
        bus.moverDerecha(5);
        bus.recogerPasajero(2);
        System.out.println(bus.nPasajeros);
        System.out.println(bus.cantidadDinero);
        bus.gestionarPuerta();
        bus.moverArriba(10);
        bus.gestionarMarcha();
        bus.gestionarPuerta();
        System.out.println(bus.nPasajeros);
        bus.recogerPasajero(1);
        System.out.println(bus.nPasajeros);
        bus.recogerPasajero(4);
        System.out.println(bus.nPasajeros);
        bus.recogerPasajero(6);
        System.out.println(bus.nPasajeros);
        System.out.println(bus.cantidadDinero);
        bus.gestionarWifi();
        bus.gestionarAireAcondicionado();
        bus.gestionarMarcha();
        bus.moverIzquierda(2);
        bus.dejarPasajero();
        System.out.println(bus.nPasajeros);
        System.out.println(bus.calcularDistanciaAcopio());
    }
    
}
