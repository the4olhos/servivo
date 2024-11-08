package com.atividade;//pacote

public class Borboleta extends Inseto {//criação da classe Borboleta que está herdando da classe Inseto
    public Borboleta() {//construtor
        super("Borboleta");//chama o construtor da classe Inseto, passando "Borboleta" como argumento. Isso inicializa o nome do inseto como "Borboleta" na classe base.
    }

    @Override//sobrescreve o método respirar
    public void respirar() {
        System.out.println("Borboleta respira.");//mensagem de saída
    }

    @Override//sobrescreve o método emitirSom
    public void emitirSom() {
        System.out.println("Borboleta emite um som.");//mensagem de saída
    }
}

