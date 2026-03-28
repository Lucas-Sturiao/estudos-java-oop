package com.exercicios.ex01;

public class Carro {

    String marca;
    String modelo;
    int velocidade;

    void acelerar() {
        velocidade += 10;
    }

    void mostrarVelocidade() {
        System.out.println("A velocidade atual do " + marca + " " + modelo + " é: " + velocidade + " km/h.");
    }

}
