package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File archivo = new File("C:" + File.separator + "Users" + File.separator + "Usuario" + File.separator + "Desktop" + File.separator + "TUP-2021");

        String[] nombres = archivo.list();

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

    }
}
