package com.atividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SerVivo animalEscolhido;

        while (true) {
            System.out.println("Escolha um animal:");
            System.out.println("1. Formiga");
            System.out.println("2. Borboleta");
            System.out.println("3. Cachorro");
            System.out.println("4. Gato");
            System.out.println("5. Cobra");
            System.out.println("6. Jacaré");
            System.out.println("0. Sair");
            System.out.print("Numero selecionado: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: animalEscolhido = new Formiga(); break;
                case 2: animalEscolhido = new Borboleta(); break;
                case 3: animalEscolhido = new Cachorro(); break;
                case 4: animalEscolhido = new Gato(); break;
                case 5: animalEscolhido = new Cobra(); break;
                case 6: animalEscolhido = new Jacare(); break;
                case 0: System.out.println("Encerrando o programa."); return;
                default: System.out.println("Opção inválida."); continue;
            }

            executarAcoes(animalEscolhido);
        }
    }

    public static void executarAcoes(SerVivo ser) {
        System.out.println("Ações de " + ser.nome + ":");
        ser.respirar();
        ser.mover();
        ser.emitirSom();
        System.out.println();
    }
}
