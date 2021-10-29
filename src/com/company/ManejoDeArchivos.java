package com.company;

import java.io.*;
import java.util.Scanner;

public class ManejoDeArchivos {
    public static void main(String[] args) {
        System.out.println("Nombre de Carpeta:");
        Scanner lectura = new Scanner(System.in);
        String nombreArchivo = lectura.nextLine();
        File archivo = new File("C:" + File.separator + "Users" + File.separator + "uriel" + File.separator + "Desktop" + File.separator + "TUP-2021"+ File.separator + nombreArchivo);
        archivo.mkdir();
    }
}
