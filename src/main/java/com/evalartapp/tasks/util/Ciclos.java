package com.evalartapp.tasks.util;

public class Ciclos {

    public static String CicloLetras(String letras, int numero) {
        String letra = letras ;
        for(int i = 0;  i < numero; i++) {
            letra += letras;
        }
        System.out.print(letra);
        return letra;
    }
}
