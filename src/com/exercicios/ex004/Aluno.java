package com.exercicios.ex004;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    void adicionarNota1(double nota) {
        this.nota1 = nota;
    }

    void adicionarNota2(double nota) {
        this.nota2 = nota;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void mostrarMedia() {
        double media = calcularMedia();
        System.out.println("A média escolar do aluno " + nome + " é: " + String.format("%.2f", media));
    }

}
