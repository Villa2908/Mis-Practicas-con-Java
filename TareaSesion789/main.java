package TareaSesion789;

import TareaSesion789.DividePorcero.DividePorCero;
import TareaSesion789.Imputs.Imputs;
import TareaSesion789.Vectores.Vetores;
import TareaSesion789.arrays.arrays;
import TareaSesion789.arraysLists.arraysLists;
import TareaSesion789.funcionReverse.funcion;

public class main {
    public static void main(String[] args) {

        //Aqui llamo y muestro la funcion "reverse"
        String alReves = funcion.reverse("Hola Mundo!");
        System.out.println(alReves);
        System.out.println("");

        //En esta llamada se encuentran ambos arrays solicitados en la actividad.
        arrays.arrayS();

        //Llamamos a la clase Vectores para mostraslos
        Vetores.Vetores();

        //Llamamos a los arrayList y arraysLinkedList
        arraysLists.arraysLists();

        //Llamamos a la funcion DividePorCero
        DividePorCero.DividePorCero(1);

        //inputs
        Imputs.input("ejemplo.txt", "Salida.txt");
    }
}
