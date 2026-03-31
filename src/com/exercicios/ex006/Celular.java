package com.exercicios.ex006;

public class Celular {
    String marca;
    String modelo;
    int bateria;

    Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    void usar(int tempo) {
        bateria -= tempo;
        if (bateria <= 0) {
            bateria = 0;
            System.out.println("Bateria Insuficiente!");
        }

    }

    void carregar(int carga) {
        bateria += carga;
        if (bateria >= 100) {
            bateria = 100;
            System.out.println("Seu celular já está carregado");
        }
    }

    void mostrarStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }
}
