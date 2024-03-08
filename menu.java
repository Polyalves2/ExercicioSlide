package org.atividade.slide;


import java.util.Scanner;

 public class menu {

	/**
	 * Exercício (Integração – Parte 3):
      *Crie uma estrutura de menu para os dois algoritmos criados,
      *em que o usuário deve escolher uma opção para calcular o IMC
      *e outra para calcular o metabolismo. Também deve haver uma
      *opção para o escape do programa. 
	 */
	 
	 
	 
	     public static void main(String[] args) {
	         Scanner scanner = new Scanner(System.in);

	         while (true) {
	             System.out.println("\nSelecione uma opção:");
	             System.out.println("1. Calcular IMC");
	             System.out.println("2. Calcular Metabolismo Basal");
	             System.out.println("3. Sair");

	             int opcao = scanner.nextInt();

	             switch (opcao) {
	                 case 1:
	                     calcularIMC(scanner);
	                     break;
	                 case 2:
	                     calcularMetabolismoBasal(scanner);
	                     break;
	                 case 3:
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
	 }


