package Clases;

public class SmartWhatch extends SmartDevice{

    public int hora;
    public int minutos;

    public boolean bateria = true;

    public SmartWhatch(){}

    public SmartWhatch(int hora, int minutos, String modelo, String marca, int alto, int ancho, int grosor, String tipo){
        super(modelo, marca, alto, ancho, grosor, tipo);
        this.hora = hora;
        this.minutos = minutos;
    }

    public SmartWhatch(int hora, int minutos){
        this.hora = hora;
        this.minutos = minutos;
    }

    void apagado(){
        if(bateria == true){
            this.bateria = false;
        }
    }

    void prender(){
        if(bateria == false){
            this.bateria = true;
        }
    }

    public String getHour(){
        return "La hora es: " + hora + ":" + minutos;
    }

    @Override
    public String toString() {
        return "SmartWhatch{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", bateria=" + bateria +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", grosor=" + grosor +
                ", tipo='" + tipo + '\'' +
                ", encendido=" + encendido +
                '}';
    }
}
