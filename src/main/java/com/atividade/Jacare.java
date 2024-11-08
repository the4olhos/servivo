package com.atividade;//pacote

public class Jacare extends Reptil {//criação da classe Jacare que está herdando da classe Reptil
    public Jacare() {//construtor
        super("Jacaré");//chama o construtor da classe Reptil, passando jacare como argumento. Isso inicializa o nome do reptil como "Jacaré" na classe base.
    }

    @Override//sobrescreve o mpetodo respirar
    public void respirar() {
        System.out.println("Jacaré respira.");//mensagem de saída
    }

    @Override//sobrescreve o método emitirSom
    public void emitirSom() {
        System.out.println("Jacaré emite um som.");//mesagem de saída
    }
}
