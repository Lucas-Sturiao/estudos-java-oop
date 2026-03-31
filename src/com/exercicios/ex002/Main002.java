package com.exercicios.ex002;

public class Main002 {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Lucas";
        conta1.saldo = 0;

        conta1.depositar(100);
        conta1.sacar(30);
        conta1.sacar(100);
        conta1.mostrarSaldo();

    }
}
