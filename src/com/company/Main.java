package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File archivo = new File("C:"+ File.separator+ "Users"+ File.separator+"roma_"+ File.separator+ "desktop" + File.separator + "TUP-2021");

        String[] nombres = archivo.list();

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
            File archivo2 = new File(archivo.getAbsolutePath(),nombres[i]);
            if(archivo2.isDirectory()){
                String [] subCarpetas = archivo2.list();
                for (int j = 0; j < subCarpetas.length; j++){
                    System.out.println("\t |__"+subCarpetas[j]);
                }
            }
        }



    }
}
