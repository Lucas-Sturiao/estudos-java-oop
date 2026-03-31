package com.exercicios.ex002;

public class ContaBancaria {

    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Tá duro, dorme!");
        }
    }
    void mostrarSaldo() {
        System.out.println("Seu saldo atual é de: R$"+saldo);
    }

}
