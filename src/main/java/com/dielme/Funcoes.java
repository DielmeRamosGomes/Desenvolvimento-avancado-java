package com.dielme;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {

        Function<String, String> retornaNomeaoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteStringParaInteiroECalculaDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(converteStringParaInteiroECalculaDobro.apply("5"));
        System.err.println(retornaNomeaoContrario.apply("João"));

    }
}
