package com.exercicios.ex08;

public class Conta {

    private String titular;
    private double saldo;

    Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Seu saldo atual é: R$" + String.format("%.2f", saldo));
        }
    }

    void transferir(double valor, Conta destino) {
        if(saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo Insuficiente. Seu saldo atual é: R$" + saldo);
        }
    }


    void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }

}
