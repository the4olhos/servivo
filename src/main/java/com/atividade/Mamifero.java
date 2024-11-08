package com.atividade;//pacote

public abstract class Mamifero extends Animal {//criação da classe abstrata Mamifero que está herdando da classe Animal
    public Mamifero(String nome) {//construtor
        super(nome);//chama o construtor da classe Animal
    }

    @Override//sobrescreve o método mover
    public void mover() {
        System.out.println(nome + " está correndo.");//mensagem de saída
    }
}
