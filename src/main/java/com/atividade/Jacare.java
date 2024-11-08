package com.atividade;

public class Jacare extends Reptil {
    public Jacare() {
        super("Jacaré");
    }

    @Override
    public void respirar() {
        System.out.println("Jacaré respira.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Jacaré emite um som.");
    }
}
