package com.dielme;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estadoVazio = valor -> valor.isEmpty();
        System.out.println(estadoVazio.test(""));
        System.out.println(estadoVazio.test("João"));
    }
}
