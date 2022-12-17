package Clases;

public abstract class SmartDevice {
    public String modelo;
    public String marca;
    public int alto;
    public int ancho;
    public int grosor;
    public String tipo = "Android";

    public boolean encendido = false;

    public SmartDevice(){}

    public SmartDevice(String modelo, String marca, int alto, int ancho, int grosor, String tipo){
        this.modelo = modelo;
        this.marca = marca;
        this.alto = alto;
        this.ancho = ancho;
        this.grosor = grosor;
        this.tipo = tipo;

    }

    public void encender(){
        if(encendido == false){
            this.encendido = true;
        }
    }
    public void apagar(){
        if(encendido == true){
            this.encendido = false;
        }
    }
}
