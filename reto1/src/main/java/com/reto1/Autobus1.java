
public class Autobus1{
    //Inserte acá los atributos
    private String nombreConductor;
    public int nPasajeros = 0;
    public double cantidadDinero = 0;
    private int nMaximoPasejeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;
    
    //Inserte acá el método constructor
    
    public void Autobus1(String nombreConductor, int nMaximoPasejeros, boolean PuertaAbierta){
        this.nombreConductor = nombreConductor;
        this.nMaximoPasejeros = nMaximoPasejeros;
        this.puertaAbierta = PuertaAbierta;//aquio
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerPasajero(int estrato){
        if(this.enMarcha==false && this.puertaAbierta==true && this.nPasajeros < this.nMaximoPasejeros){
            if(estrato >=0 && estrato <=2){
                this.cantidadDinero += 1500;
            }
            else if (estrato >=3 && estrato <=4){
                this.cantidadDinero += 2600;
            }
            else if(estrato >=5 && estrato <=6){
                this.cantidadDinero += 3000;
            }
            this.nPasajeros ++;  
        }
    }
    
    public void dejarPasajero(){
        if( this.enMarcha && ! this.puertaAbierta && this.nPasajeros >0){
            this.nPasajeros --;
        }
    }
    
    public double calcularDistanciaAcopio(){
        return Math.sqrt(Math.pow(this.localizacionX, 2) + Math.pow(this.localizacionY, 2));
    }
    
    public void gestionarPuerta(){
        if (!this.enMarcha)
        this.puertaAbierta = !this.puertaAbierta;
        }
    
    
    public void gestionarAireAcondicionado(){
        if(this.motorEncendido){
            this.aireAcondicionadoActivado = ! this.aireAcondicionadoActivado;
        }
    }
    
    public void gestionarMotor(){
        this.motorEncendido = ! this.motorEncendido;
        if(!this.motorEncendido){
            this.wifiEncendido = false;
            this.aireAcondicionadoActivado = false;
        }
    }
    
    public void gestionarWifi(){
        if( this.motorEncendido){
           this.wifiEncendido = ! this.wifiEncendido; 
        }
        
    }
    
    public void gestionarMarcha(){
        if(this.motorEncendido && ! this.puertaAbierta){
            this.enMarcha = ! this.enMarcha;
        }
    }
    
    public void moverDerecha(double d){
        if(this.motorEncendido &&   this.enMarcha){
        this.localizacionX += d;
        }
    }
    
    public void moverIzquierda(double d){
        if( this.motorEncendido &&  this.enMarcha){
        this.localizacionX -= d;
        }
    }
    
    public void moverArriba(double d){
        if(this.motorEncendido && this.enMarcha){
        this.localizacionY += d;
        }
    }
    
    public void moverAbajo(double d){
        if(this.motorEncendido && this.enMarcha){
        this.localizacionY -= d;
        }
    }
    
    //Inserte acá los SETTERS Y GETTERS
    
    public String getNombreConductor(){
        return nombreConductor;
    }
    
    public void setNombreConductor(String nombreConductor){
        this.nombreConductor = nombreConductor;
    }
    
    public int getnPasajeros(){
        return nPasajeros;
    }
    public void setnPasajeros(int nPasajeros){
        this.nPasajeros = nPasajeros;
    }
    public double getCantidadDinero(){
        return cantidadDinero;
    }
    public void setCantidadDinero(double cantidadDinero){
        this.cantidadDinero = cantidadDinero;
    }
    public int getnMaximoPasajeros(){
        return nMaximoPasejeros;
    }
    public void setnMaximoPasejeros(int nMaximoPasejeros){
        this.nMaximoPasejeros = nMaximoPasejeros;
    }
    public double getLocalizacionX(){
        return localizacionX;
    }
    public void setLocalizacionX(double localizacionX){
        this.localizacionX = localizacionX;
    }
    public double getLocalizacionY(){
        return localizacionY;
    }
    public void setLocalizacionY(double localizacionY){
        this.localizacionY = localizacionY;
    }
    public boolean isPuertaAbierta(){
        return puertaAbierta;
    }
    public void setisPuertaAbierta(boolean puertaAbierta){
        this.puertaAbierta = puertaAbierta;
    }
    public boolean isAireAcondicionadoActivado(){
        return aireAcondicionadoActivado;
    }
    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado){
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }
    public boolean isMotorEncendido(){
        return motorEncendido;
    }
    public void setMotorEncendido(boolean motorEncendido){
        this.motorEncendido = motorEncendido;
    }
    public boolean isWifiEncendido(){
        return wifiEncendido;
    }
    public void setWifiEncendido(boolean wifiEncendido){
        this.wifiEncendido = wifiEncendido;
    }
    public boolean isEnMarcha(){
        return enMarcha;
    }
    public void setEnMarcha(boolean enMarcha){
        this.enMarcha = enMarcha;
    }
}