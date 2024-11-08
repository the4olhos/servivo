package com.atividade;//pacote

public class Cachorro extends Mamifero {//criação da classe Cachorro que está herdando da classe Mamifero
    public Cachorro() {//construtor
        super("Cachorro");//chama o construtor da classe Mamifero, passando Cachorro como parâmetro, isso inicializa o nome do mamifero como "Cachorro" na classe base.
    }

    @Override//sobrescreve o método rrespirar
    public void respirar() {
        System.out.println("Cachorro respira.");//mensagem de saída
    }

    @Override
    public void emitirSom() {//sobrescreve o método emitirSom
        System.out.println("Cachorro está latindo.");//mensagem de saída
    }
}
