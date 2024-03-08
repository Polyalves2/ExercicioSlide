package org.atividade.slide;


import java.util.Scanner;

public class calculadora {
	
	 /**
	  * Exercício (Integração – Parte 4):
     *Crie um algoritmo para identificar se o número é PAR ou
     *ÍMPAR e acrescente na estrutura do programa anterior
     *atribuindo a opção de MENU ‘NUMERO’.
	  */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular Metabolismo Basal");
            System.out.println("3. Verificar se o número é Par ou Ímpar");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularIMC(scanner);
                    break;
                case 2:
                    calcularMetabolismoBasal(scanner);
                    break;
                case 3:
                    verificarParImpar(scanner);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        }
    }

    public static void calcularIMC(Scanner scanner) {
        
    	
        System.out.println("Função para calcular o IMC.");
    }

    public static void calcularMetabolismoBasal(Scanner scanner) {
      

        System.out.println("Função para calcular o metabolismo basal.");
    }

    public static void verificarParImpar(Scanner scanner) {
        System.out.println("Digite um número para verificar se é Par ou Ímpar:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número Par.");
        } else {
            System.out.println(numero + " é um número Ímpar.");
        }
    }
}

