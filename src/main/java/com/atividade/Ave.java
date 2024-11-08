package com.atividade;//pacote

public abstract class Ave extends Animal {//criação da classe abstrata Ave que está herdando da classe Animal
    public Ave(String nome) {//construtor com um parâmetro
        super(nome);//chama o construtor da classe Animal
    }

    @Override//sobrescreve o método mover
    public void mover() {
        System.out.println(nome + " está se locomovendo.");//mensagem de saída
    }
}
