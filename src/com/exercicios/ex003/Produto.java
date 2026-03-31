package com.exercicios.ex003;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    void mostrarEstoque() {

        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + String.format("%.2f", preco));
        System.out.println("Quantidade em estoque:" + quantidade);
    }

}
