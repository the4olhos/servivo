package com.atividade;//pacote

public class Formiga extends Inseto {//criação da classe Formiga que está herdando da classe Inseto
    public Formiga() {//construtor
        super("Formiga");//chama o construtor da classe inseto, passando formiga como parâmetro. Isso inicializa o nome do inseto como "Formiga" na classe base.
    }

    @Override//sobrescreve o método respirar
    public void respirar() {
        System.out.println("Formiga respira.");//mensagem de saída
    }

    @Override//sobrescreve o método emitirSom
    public void emitirSom() {
        System.out.println("Formiga emite um som.");//mensagem de saída
    }
}
