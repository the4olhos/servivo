package com.atividade;

public abstract class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está correndo.");
    }
}