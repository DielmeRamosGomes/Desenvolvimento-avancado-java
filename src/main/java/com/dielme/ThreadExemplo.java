package com.dielme;

public class ThreadExemplo {
    public static void main(String[] args) {
        BarraDeCarregamento2 obj2 = new BarraDeCarregamento2();
        obj2.start();
        BarraDeCarregamento2 obj22 = new BarraDeCarregamento2();
        obj22.start();


    }
}

class GerarPDF implements Runnable{
    @Override
    public void run() {
        System.out.println("Gerar PDF");

    }
}

class BarraDeCarregamento implements Runnable{
    @Override
    public void run() {
        System.out.println("Loading...");

    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Rodei " + this.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

