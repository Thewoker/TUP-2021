package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File archivo = new File("Archivo de prueba.txt");
        System.out.println(archivo.getAbsoluteFile());

        if (archivo.exists()) {
            System.out.println("El archivo existe");
        }
        else System.out.println("No existe");
    }
}
