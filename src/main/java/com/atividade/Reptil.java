package com.atividade;

public abstract class Reptil extends Animal {
    public Reptil(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se movendo.");
    }
}
