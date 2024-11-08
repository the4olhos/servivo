package com.atividade; //define o pacote onde a classe está localizada

import java.util.Scanner; //importa a classe Scanner para ler entradas do usuário

public class Main { //criação da classe principal
    public static void main(String[] args) { //método executor
        Scanner scanner = new Scanner(System.in); //criação do objeto Scanner para ler as entradas do usuário
        SerVivo animalEscolhido; //declaração da variável que armazenará o animal escolhido pelo usuário

        while (true) { //inicia um loop infinito para o menu de seleção
            System.out.println("Escolha um animal:"); //exibe a mensagem para o usuário escolher um animal
            System.out.println("1. Formiga"); 
            System.out.println("2. Borboleta"); 
            System.out.println("3. Cachorro"); 
            System.out.println("4. Gato"); 
            System.out.println("5. Cobra"); 
            System.out.println("6. Jacaré"); 
            System.out.println("0. Sair"); 
            System.out.print("Numero selecionado: "); //solicita ao usuário que insira a opção desejada
            int opcao = scanner.nextInt(); //lê a opção escolhida pelo usuário

            switch (opcao) { //inicia a estrutura de decisão com base na opção escolhida
                case 1: 
                    animalEscolhido = new Formiga(); //instancia um objeto Formiga
                    break; //sai do switch
                case 2: 
                    animalEscolhido = new Borboleta(); //instancia um objeto Borboleta
                    break; //sai do switch
                case 3: 
                    animalEscolhido = new Cachorro(); //instancia um objeto Cachorro
                    break; //sai do switch
                case 4: 
                    animalEscolhido = new Gato(); //instancia um objeto Gato
                    break; //sai do switch
                case 5: 
                    animalEscolhido = new Cobra(); //instancia um objeto Cobra
                    break; //sai do switch
                case 6: 
                    animalEscolhido = new Jacare(); //instancia um objeto Jacaré
                    break; //sai do switch
                case 0: 
                    System.out.println("Encerrando o programa."); //informa que o programa será encerrado
                    return; //sai do método main, encerrando o programa
                default: 
                    System.out.println("Opção inválida."); //informa que a opção escolhida é inválida
                    continue; //continua o loop para uma nova tentativa
            }

            executarAcoes(animalEscolhido); //chama o método para executar as ações do animal escolhido
        }
    }

    public static void executarAcoes(SerVivo ser) { //método que executa ações do animal selecionado
        System.out.println("Ações de " + ser.nome + ":"); //exibe as ações do animal
        ser.respirar(); //chama o método respirar do objeto SerVivo
        ser.mover(); //chama o método mover do objeto SerVivo
        ser.emitirSom(); //chama o método emitirSom do objeto SerVivo
        System.out.println(); //imprime uma linha em branco para separar as informações
    }
}
