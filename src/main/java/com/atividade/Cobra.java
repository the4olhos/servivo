package com.atividade;

public class Cobra extends Reptil {
    public Cobra() {
        super("Cobra");
    }

    @Override
    public void respirar() {
        System.out.println("Cobra respira.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cobra emite som.");
    }
}