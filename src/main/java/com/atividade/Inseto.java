package com.atividade;

public abstract class Inseto extends Animal {
    public Inseto(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se movendo.");
    }
}