package com.dielme;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "João","Paulo", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals("João")){
                nomesParaImprimir += nomes[i];
            }
        }

        System.out.println("Nome do for: " + nomesParaImprimir);

        String varStream = Stream.of(nomes)
            .filter(nome -> nome.equals("João"))
            .collect(Collectors.joining());

        System.out.println("Nome do Stream: " + varStream);
    }

    public static void imprimirTodosNomes(String... nomes){
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void imprimirDobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros) {
            System.out.println(numero*2);
        }
    }

}
