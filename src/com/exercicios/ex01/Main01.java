package com.exercicios.ex01;

public class Main01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Renaut";
        carro1.modelo = "sandero";
        carro1.velocidade = 0;

        carro1.acelerar();
        carro1.acelerar();
        carro1.mostrarVelocidade();
    }

}
