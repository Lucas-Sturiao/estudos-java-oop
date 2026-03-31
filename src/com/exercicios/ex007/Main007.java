package com.exercicios.ex007;

public class Main007 {

    public static void main(String[] args) {

        Lampada lampada = new Lampada("Fiat Lux", 15);

        lampada.mostrarEstado();
        lampada.ligar();
        lampada.ligar();
        lampada.desligar();
        lampada.mostrarEstado();

    }
}