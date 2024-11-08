package com.atividade;//pacote

public abstract class SerVivo implements Acoes {//criação da classe abstrata SerVico que está implementando a classe Acoes
    protected String nome;//variável nome do tipo string que está protegida

    public SerVivo(String nome) {//construtor que inicializa com a variavel, com o valor passando como parâmetro 
        this.nome = nome;
    }

    public abstract void respirar();//método abstrato respirar

    @Override//sobrescreve o método emitirSom
    public void emitirSom() {
        System.out.println(nome + " está emitindo um som.");//mensgaem dde saída
    }
}
