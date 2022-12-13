package com.Practica;

import java.util.List;
import java.util.ArrayList;

public class tiposDeDatos {

    String Texto = "Hola, soy un texto";
    int numeroEntero = 2;
    double decimal = 1.9;
    long numeroGrande = 10000;
    boolean siOno = true;

    @Override
    public String toString() {
        return "tiposDeDatos{" +
                "Texto= '" + Texto + '\'' +
                ", numeroEntero= " + numeroEntero +
                ", decimal= " + decimal +
                ", numeroGrande= " + numeroGrande +
                ", siOno= " + siOno +
                '}';
    }

}
