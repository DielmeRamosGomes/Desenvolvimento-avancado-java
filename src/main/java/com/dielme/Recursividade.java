package com.dielme;

import javax.swing.JOptionPane;

public class Recursividade {

    public static void main(String[] args) {
        System.out.println("O Fatorial é: " + fatorial(10));

    } // main

    public static int fatorial(int value){
        if(value == 1){
            return value;
        } else{
            return value * fatorial((value -1));
        }
    } // fatorial



} // Recursividade
