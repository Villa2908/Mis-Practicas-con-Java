package TareaSesion789.funcionReverse;

public class funcion {
    public static String reverse(String texto) {
        String resultado ="";
        for (int i = texto.length() - 1; i >= 0; i--){
            resultado += texto.charAt(i);
        }
        return resultado;
    }

}


