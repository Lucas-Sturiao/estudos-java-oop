package com.exercicios.ex07;

public class Lampada {
    String marca;
    int potencia;
    boolean ligada;

    Lampada(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    void ligar() {
        if (ligada) {
            System.out.println("A lâmpada já está ligada!");
        } else {
            ligada = true;
            System.out.println("A lâmpada foi ligada!");
        }
    }

    void desligar() {
        if (!ligada) {
            System.out.println("A lâmpada já está desligada");
        } else {
            ligada = false;
            System.out.println("A lâmpada foi desligada");
        }
    }

    void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Potência: " + potencia);
        if (ligada) {
            System.out.println("Estado: Ligada");
        } else {
            System.out.println("Estado: Desligada");
        } // ou: sout("Estado: " + (ligada ? "ligada" : "Desligada"));
    }


}
