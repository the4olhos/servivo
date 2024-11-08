package com.atividade;

public class Cachorro extends Mamifero {
    public Cachorro() {
        super("Cachorro");
    }

    @Override
    public void respirar() {
        System.out.println("Cachorro respira.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro está latindo.");
    }
}