package Clases;

public class SmartPhone extends SmartDevice{

    int numPhone;

    boolean bluetooth;

    boolean wifi;

    boolean sennial;

    public SmartPhone(){}

    public SmartPhone(int numPhone, boolean bluetooth, boolean wifi, boolean sennial, String modelo, String marca, int alto, int ancho, int grosor, String tipo){
        super(modelo,marca,alto,ancho,grosor,tipo);
        this.bluetooth = bluetooth;
        this.numPhone = numPhone;
        this.wifi = wifi;
        this.sennial = sennial;

    }

    public SmartPhone(int numPhone, boolean bluetooth, boolean wifi, boolean sennial){
        this.numPhone = numPhone;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.sennial = sennial;
    }

    void llamar(){
        if(numPhone > 0){
            System.out.println("Esta llamando!");
        }else{
            System.out.println("Sin chip telefonico");
        }
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numPhone=" + numPhone +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", sennial=" + sennial +
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
