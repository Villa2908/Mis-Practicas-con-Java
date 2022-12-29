package TareaSesion789.arrays;



public class arrays {
    public static void arrayS() {
        String[] arrayStrings = {"juan", "Pedro", "Jacinto", "Perez"};
        for (int i = 0; i < arrayStrings.length; i++)
            System.out.println(arrayStrings[i]);

        System.out.println("");

        int[][] arraysEnteros = new int[1][6];
        arraysEnteros[0][0] = 1;
        arraysEnteros[0][1] = 10;
        arraysEnteros[0][2] = 100;
        arraysEnteros[0][3] = 1000;
        arraysEnteros[0][4] = 10000;
        arraysEnteros[0][5] = 2;
        for (int i = 0; i < arraysEnteros.length; i++)
            for(int j=0; j < arraysEnteros[i].length; j++){
                System.out.println(arraysEnteros[i][j]);
            }
    }
}
