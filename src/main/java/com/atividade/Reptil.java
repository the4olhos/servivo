package com.atividade;//pacote

public abstract class Reptil extends Animal {//criação da classe abstrata Reptil que esta herdando da classe Animal
    public Reptil(String nome) {//construtor
        super(nome);//chama o construtor da classe Animal
    }

    @Override//sobrescreve o método mover
    public void mover() {
        System.out.println(nome + " está se movendo.");//mensagem de saída
    }
}
