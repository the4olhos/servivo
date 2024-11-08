package com.atividade;

public abstract class Animal extends SerVivo {
    public Animal(String nome) {
        super(nome);
    }

    public void locomover() {
        System.out.println(nome + " está se locomovendo.");
    }
}
