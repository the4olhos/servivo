package com.atividade;

public abstract class SerVivo implements Acoes {
    protected String nome;

    public SerVivo(String nome) {
        this.nome = nome;
    }

    public abstract void respirar();

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo um som.");
    }
}
