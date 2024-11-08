package com.atividade;//pacote

public class Cobra extends Reptil {//criação da classe Cobra que está herdando da classe Reptil
    public Cobra() {//construtor
        super("Cobra");//chama  contrutor da classe Reptil, passando Cobra como parâmetro. Isso inicializa o nome do reptil como "Cobre" na classe base.
    }

    @Override//sobrescreve o método respirar
    public void respirar() {
        System.out.println("Cobra respira.");//mensagem de saída
    }

    @Override
    public void emitirSom() {//sobrescreve o método emitirSom
        System.out.println("Cobra emite som.");//mensagem de saída
    }
}
