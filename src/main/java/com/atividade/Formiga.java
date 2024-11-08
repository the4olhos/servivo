package com.atividade;

public class Formiga extends Inseto {
    public Formiga() {
        super("Formiga");
    }

    @Override
    public void respirar() {
        System.out.println("Formiga respira.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Formiga emite um som.");
    }
}
