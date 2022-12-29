package TareaSesion789.arraysLists;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.LinkedList;

public class arraysLists {
    public static void arraysLists() {

        System.out.println("");

        ArrayList<String> variable1 = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            variable1.add("Cadena numero " + i);
            System.out.println(variable1.get(i));
        }

        System.out.println("");

        LinkedList<String> variable2 = new LinkedList<>(variable1);
        for (int i = 0; i < variable2.size(); i++) {
            System.out.println(variable2.get(i));
        }

        System.out.println("");

        ArrayList<Integer> enteros = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            enteros.add(i);
            System.out.println(enteros);
        }

        System.out.println("");

        ArrayList<Integer> impares = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){
                continue;
            }impares.add(i);
            System.out.println(impares);
        }

    }
}
