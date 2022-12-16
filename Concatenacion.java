public class Concatenacion {

    public static void main(String[] args) {
        String[] nombres = {"Andres", "Juan", "Felipe", "Jesus"};

        String todos = "";

       for (String x : nombres) {
        todos += x;
        todos += " ";

       }

       System.out.println(todos);

    }
}
    
