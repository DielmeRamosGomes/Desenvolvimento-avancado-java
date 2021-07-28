package com.dielme;

public class FuncAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a+b;
        Calculo subtracao = (a, b) -> a-b;
        Calculo multiplicacao = (a, b) -> a*b;
        Calculo divisao = (a, b) -> a/b;
        System.out.println("Soma é: " + executarOperacao(soma, 4, 3));
        System.out.println("Subtracao é: " + executarOperacao(subtracao, 4, 3));
        System.out.println("Multiplicacao é: " + executarOperacao(multiplicacao, 4, 3));
        System.out.println("Divisao é: " + executarOperacao(divisao, 4, 3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }

}

@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);
}
