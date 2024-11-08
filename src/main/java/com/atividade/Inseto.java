package com.atividade;//pacote

public abstract class Inseto extends Animal {//criação da classe abstrata Inseto que está herdando da classe Animal
    public Inseto(String nome) {//construtor com um parâmetro
        super(nome);//chama o construtor da classe Animal
    }

    @Override//sobrescreve o método mover
    public void mover() {
        System.out.println(nome + " está se movendo.");//mensagem de saída
    }
}
