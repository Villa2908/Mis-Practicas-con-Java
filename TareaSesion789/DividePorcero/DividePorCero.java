package TareaSesion789.DividePorcero;

public class DividePorCero {
    public static void DividePorCero(int x)throws ArithmeticException{
        System.out.println("");
        try{
            int resultado = x / 0;
        }catch (ArithmeticException e) {
            System.out.println("Esto no puede suceder");
        }
    }
}
