package com.atividade;//pacote

public class Gato extends Mamifero {//criação da classe Gato que está herdando da classe Mamifero
    public Gato() {//construtor
        super("Gato");//chama o construtor da classe Mamifero, passando gato como parâmetro. Isso inicializa o nome do mamifero como "Gato" na classe base.
    }

    @Override//sobrescreve o método respirar
    public void respirar() {
        System.out.println("Gato respira.");//ensagem de saída
    }

    @Override//sobrescreve o método emitirSom
    public void emitirSom() {
        System.out.println("Gato está miando.");//mensagem de saída
    }
}
