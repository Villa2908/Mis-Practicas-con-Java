import Clases.*;
public class Main {
    public static void main(String[] args) {

        SmartPhone samsungS = new SmartPhone();
        samsungS.marca = "Samsung";
        samsungS.modelo = "S20";
        samsungS.encender();

       SmartWhatch i8 = new SmartWhatch(5,35, "i8", "Generica", 40, 16, 3, "inteligente");
       String laHora = i8.getHour();

        System.out.println(samsungS);
        System.out.println(i8);
        System.out.println(laHora);
    }
}