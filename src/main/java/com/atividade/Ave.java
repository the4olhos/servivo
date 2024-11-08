package com.atividade;//importação do pacote

public abstract class Ave extends Animal {//criação da classe abstrata Ave que está herdando da classe Animal
    public Ave(String nome) {//construtor com um parâmetro
        super(nome);//chama o construtor da classe pai(SerVivo)
    }

    @Override//sobescreve o método mover
    public void mover() {
        System.out.println(nome + " está se locomovendo.");//mensagem de saída
    }
}
