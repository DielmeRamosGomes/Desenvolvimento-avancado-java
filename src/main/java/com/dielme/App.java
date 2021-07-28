package com.dielme;

import java.util.Arrays;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        // pega um numero par do vetor e multiplica por 2

        int[] valores = {1,2,3,4};
        /*
        Arrays.stream(valores)
            .filter(numero -> numero % 2 == 0)
            .map(numero -> numero * 2)
            .forEach(numero -> System.out.println(numero));
        */

        Funcao1 colocarPrefixoSenhorNaString = valor -> "Sr. " + valor ;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));


    } // main

} // App

@FunctionalInterface
interface Funcao1{
    String gerar(String valor);

}

