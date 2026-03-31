package com.exercicios.ex003;

public class Main003 {

    public static void main(String[] args) {
        Produto sapato = new Produto();
        sapato.nome = "nike";
        sapato.preco = 299.00;

        sapato.adicionarEstoque(10);
        sapato.removerEstoque(3);
        sapato.removerEstoque(20);
        sapato.mostrarEstoque();
    }
}
