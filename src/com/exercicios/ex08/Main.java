package com.exercicios.ex08;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta("Lucas", 100);
        Conta conta2 = new Conta("Bia", 50);
        conta1.transferir(30, conta2);
        conta1.transferir(100, conta2);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
    }
}
