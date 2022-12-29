package TareaSesion789.Vectores;
import java.util.Vector;

public class Vetores {
    public static void Vetores() {
        Vector<String> vector1 = new Vector<>();
        vector1.add("Patricio");
        vector1.add("Juan");
        vector1.add("Esponja");
        vector1.add("Calamardo");
        vector1.add("DonCangrejo");
        vector1.remove(3);
        vector1.remove(2);
        System.out.println("");
        System.out.println(vector1);

        /*
        El principal problema de los vectores con el tema "Capacidad"
        Es que por defecto su aumento es duplicar la cantidad que este tenia al comienzo
        y tambien que para actualizar la capacidad de un vector, esta misma clase crea de manera
        automatica otro vector COPIANDO todo el contenido del vector original o principal para luego
        copiarlo en el nuevo lo cual generaria una carga masiva en memoria.
         */


    }
}
