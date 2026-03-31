package com.exercicios.ex08;

public class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor insuficiente para depósito. Favor depositar um valor maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Seu saldo atual é: R$" + String.format("%.2f", saldo));
        }
    }

    public void transferir(double valor, Conta destino) {
        if(saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo Insuficiente. Seu saldo atual é: R$" + String.format("%.2f", saldo));
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }

}
