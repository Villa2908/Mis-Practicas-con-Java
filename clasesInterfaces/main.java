package clasesInterfaces;

public class main {
    public static void main(String[] args) {
        CocheCRUDImpl variable = new CocheCRUDImpl();

        System.out.println(variable.save());
        System.out.println(variable.findAll());
        System.out.println(variable.delete());
    }
}
