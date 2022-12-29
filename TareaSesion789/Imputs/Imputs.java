package TareaSesion789.Imputs;

import java.io.*;

public class Imputs {
    public static void input(String fileIn, String fileOut){
        try {
            InputStream entrada = new FileInputStream("C:/Users/USUARIO/Desktop/Villagaming_/Practica de Programacion/OPEN BOOTCAMP/ClasesSmart/ejemplo.txt");
            byte []entradas = entrada.readAllBytes();

            FileOutputStream salida = new FileOutputStream(String.valueOf(entradas));

            System.out.println(fileOut.concat(salida.toString()));

        } catch (FileNotFoundException e){
            System.out.println("");
            System.out.println("El archivo que intenta leer no existe.");

        }catch (IOException e){

            System.out.println("El archivo esta vacio");

        }
    }
}


