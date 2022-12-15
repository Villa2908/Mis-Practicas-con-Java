import java.text.DecimalFormat;

public class ObtenerPrecio {
    static float getIVA(float a){
        return a * 0.18f;
    }
    public static void main(String[] args) {

        //Configuramos la cantidad de decimales que queremos mostrar con la clase DecimalFormat

        DecimalFormat dosDecimales = new DecimalFormat("#.00");
        
        //Creamos los precios o variables que contengan los precios

        float precio = 49.90f;
        float total = getIVA(precio) + precio;

        //Mostramos en pantalla

        System.out.println("EL precio mas su IVA es: " + dosDecimales.format(total) + "/s");
    }
    
    
}
