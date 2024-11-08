package com.atividade;

public class Gato extends Mamifero {
    public Gato() {
        super("Gato");
    }

    @Override
    public void respirar() {
        System.out.println("Gato respira.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato está miando.");
    }
}