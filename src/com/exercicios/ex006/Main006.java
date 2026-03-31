package com.exercicios.ex006;

public class Main006 {

    public static void main(String[] args) {
        Celular celularDoLucas = new Celular("Samsung", "A52", 50);

        celularDoLucas.usar(90);
        celularDoLucas.carregar(30);
        celularDoLucas.mostrarStatus();

        Celular celularDaBia = new Celular("Xiaomi", "Redmi 9", 40);

        celularDaBia.usar(30);
        celularDaBia.carregar(60);
        celularDaBia.mostrarStatus();
    }
}
