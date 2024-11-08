package com.atividade;

public abstract class Ave extends Animal {
    public Ave(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se locomovendo.");
    }
}