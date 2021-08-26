
package com.reto1;

    public class Autobus {
        public String nombreConductor;
        public int nMaximoPasajeros;
        public boolean puertaAbierta;
        public int nPasajeros = 0;
        public double cantidadDinero = 0;
        public double localizacionX=0;
        public double localizacionY=0;
        public boolean aireAcondicionadoActivado =false;
        public boolean motorEncendido = false;
        public boolean wifiEncendido = false;
        public boolean enMarcha = false;
        public Autobus(String a, int b ,boolean c){
            nombreConductor =a;
            nMaximoPasajeros = b;
            puertaAbierta=c;
        }
    
        public void recogerPasajero(int estrato){
            if ( puertaAbierta && nPasajeros<nMaximoPasajeros ){
                if ((estrato==3)||(estrato==4)) {
                    cantidadDinero = cantidadDinero + 2600;
                    nPasajeros+=1;
                } else if ((estrato==1)||(estrato==2)||(estrato==0)) {
                    cantidadDinero = cantidadDinero + 1500;
                    nPasajeros+=1;
                } else if  ((estrato==5)||(estrato==6))  {
                    cantidadDinero = cantidadDinero + 3000;
                    nPasajeros+=1;
                }
                }
            }
        public void dejarPasajero(){
            if (puertaAbierta){
                nPasajeros-=1; 
            }
        }
        public double calcularDistanciaAcopio(){
            double distancia;
            distancia = Math.sqrt(Math.pow(localizacionX,2) + Math.pow(localizacionY,2)) ; 
            return distancia;
        }
        public void gestionarPuerta(){
            if (enMarcha) {
                    puertaAbierta=false;
            }else{
                if (puertaAbierta){
                    puertaAbierta=false;
                }else{
                    puertaAbierta=true;
                }
            }
        }
        public void gestionarAireAcondicionado(){
            if (motorEncendido) {
                if (aireAcondicionadoActivado) {
                    aireAcondicionadoActivado=false;
                }else{
                    aireAcondicionadoActivado=true;
                }
            } else {
                aireAcondicionadoActivado=false;
            }
        }
        public void gestionarMotor(){
            if (motorEncendido) {
                motorEncendido=false;
                gestionarAireAcondicionado();
                gestionarMarcha();
                gestionarWifi();
            }else{
                motorEncendido=true;
            }
        }
        public void gestionarWifi(){
            if (motorEncendido) {
                if (wifiEncendido) {
                    wifiEncendido=false;
                }else{
                    wifiEncendido=true;
                }
            }else{
                wifiEncendido=false;
            }
        }
        public void gestionarMarcha(){
            if (motorEncendido && (puertaAbierta==false) ) {
                if (enMarcha) {
                    enMarcha=false;
                }else{
                    enMarcha=true;   
                }
            }else{
                enMarcha=false;
            }
        }
        public void moverDerecha(double d){
            if (enMarcha) {
                localizacionX+= d;
            }
            
        }
        public void moverIzquierda(double d){
            if (enMarcha) {
                localizacionX-= d;
            }
        }
        public void moverArriba(double d) {
            if (enMarcha) {
                localizacionY+=d;
            }
        }
        public void moverAbajo(double d) {
            if (enMarcha) {
                localizacionY-= d;
            }
        }
    public int getnMaximoPasajeros(){
            return nMaximoPasajeros;
        }
        public boolean ispuertaAbierta(){
            return puertaAbierta;
        }
        public int getnPasajeros(){
            return nPasajeros;
        }
        public double getCantidadDinero(){
            return cantidadDinero;
        }
        public String getNombreConductor(){
            return nombreConductor;
        }
        public boolean isAireAcondicionadoActivado(){
            return aireAcondicionadoActivado;
        }
        public boolean isWifiEncendido(){
            return wifiEncendido;
        }
        public double getLocalizacionX(){
            return localizacionX;
        }
        public double getLocalizacionY(){
            return localizacionY;
        }
        public boolean isMotorEncendido(){
            return motorEncendido;
        }
        public boolean isEnMarcha(){
            return enMarcha;
        }
        public boolean isPuertaAbierta(){
            return puertaAbierta;
        }
        public void setPuetaAbierta(){
            gestionarPuerta();
        }
    }
 