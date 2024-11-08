package com.atividade;

public class Borboleta extends Inseto {
    public Borboleta() {
        super("Borboleta");
    }

    @Override
    public void respirar() {
        System.out.println("Borboleta respira.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Borboleta emite um som.");
    }
}

