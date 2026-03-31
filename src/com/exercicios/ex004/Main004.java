package com.exercicios.ex004;

public class Main004 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.adicionarNota1(7.5);
        aluno1.adicionarNota2(8.0);
        aluno1.calcularMedia();
        aluno1.mostrarMedia();
    }
}
