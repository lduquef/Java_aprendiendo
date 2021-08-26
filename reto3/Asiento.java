public abstract class Asiento {
    //Inserte acá los atributos
    private char tipo ;
    private String ID;
    private boolean pantallaEncendida = false;
    private double inclinacionSilla = 90;
    private boolean luzLecturaEncendida =false;
    private boolean luzAsistenciaEncendida = false;
    private boolean aireAcondicionadoEncendido= false;
    //Inserte acá el método constructor
    public  Asiento(String ID,char tipo) {   
        this.ID = ID;
        this.tipo = tipo;  
    }
    //Inserte acá los SETTERS Y GETTERS
    //setters 
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }
    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }
    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }
    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }
    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }
    //getters
    public char getTipo() {
        return tipo;
    }
    public String getID() {
        return ID;
    }
    public boolean isPantallaEncendida(){
        return pantallaEncendida;
    }
    public double getInclinacionSilla() {
        return inclinacionSilla;
    }
    public boolean isLuzLecturaEncendida(){
        return luzLecturaEncendida;
    }
    public boolean isLuzAsistenciaEncendida(){
        return luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido(){
        return aireAcondicionadoEncendido;
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void gestionarAireAcondicionado() {
        if (isAireAcondicionadoEncendido() == false){
            setAireAcondicionadoEncendido(true);
        }else{
            setAireAcondicionadoEncendido(false);
        }
    }
    public void gestionarPantalla() {
        if (isPantallaEncendida()==false) {
            setPantallaEncendida(true);
        }else{
            setPantallaEncendida(false);
        }
    }
    public void gestionarLuzLectura() {
        if (isLuzLecturaEncendida()==false) {
            setLuzLecturaEncendida(true);
        } else {
            setLuzLecturaEncendida(false);
        }
    }
    public void gestionarLuzAsistencia() {
        if (isLuzAsistenciaEncendida()==false) {
            setLuzAsistenciaEncendida(true);
        } else {
            setLuzAsistenciaEncendida(false);
        }
    }
    public void aumentarInclinacion(double d) {
        if (getInclinacionSilla()+d > 135) {
            setInclinacionSilla(135);
        } else {
            setInclinacionSilla(getInclinacionSilla()+d);
        }
    }
    public void disminuirInclinacion(double d) {
        if (getInclinacionSilla()-d <0) {
            setInclinacionSilla(0);
        } else {
            setInclinacionSilla(getInclinacionSilla()-d);
        }
    }
    public abstract String imprimirMenuPantalla();
}