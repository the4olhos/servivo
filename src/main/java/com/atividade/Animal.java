package com.atividade;//pacote

public abstract class Animal extends SerVivo {//criação da classe abstrata Animal que está herdando da classe SerVivo
    public Animal(String nome) {//construtor que tem um parâmetro
        super(nome);//chama o construtor da classe SerVivo
    }

    public void locomover() {//método locomover
        System.out.println(nome + " está se locomovendo.");//mensagem de saída
    }
}
