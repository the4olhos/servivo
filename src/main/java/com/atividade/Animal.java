package com.atividade;//importação do pacote

public abstract class Animal extends SerVivo {//criação da classe abstrata Animal que está herdando da classe SerVivo
    public Animal(String nome) {//construtor que tem um parâmetro
        super(nome);//chama o construtor da classe pai (SerVivo)
    }

    public void locomover() {//m~etodo locomover
        System.out.println(nome + " está se locomovendo.");//mensagem de saída
    }
}
