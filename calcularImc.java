package org.atividade.slide;

import java.util.Scanner;
import java.util.Locale;

 public class calcularImc {


 /** Exercício (Calcular o IMC – Parte 1):
    *Solicite ao usuário a entrada do nome;
    *Solicite ao usuário a entrada do peso do mesmo em Kg;
    *Solicite ao usuário a entrada da altura do mesmo em metros;
    *Informe a saída exibindo o IMC.
	     IMC = peso * altura2
	 *Modifique o programa para que a saída obedeça a seguinte condição:
	 * Valor do IMC               Classificação
	 * IMC < 19                   Abaixo do peso
	 * 19 < iMC < 25              Peso normal
	 * 25 < IMC < 30              Sobrepeso  
	 * 30 < IMC < 40              Obesidade do tipo 1
	 * IMC > 40                   Obesidade Mórbida
	 */

	 
	     public static void main(String[] args) {
	        
	         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	         
	         System.out.println("Por favor, digite seu nome:");
	         String nome = scanner.nextLine();

	         
	         System.out.println("Olá, " + nome + "! Por favor, digite seu peso em quilogramas:");
	         double peso = scanner.nextDouble();

	        
	         System.out.println("Agora, digite sua altura em metros:");
	         double altura = scanner.nextDouble();

	         
	         double imc = peso / (altura * altura);

	    
	         System.out.println("Seu IMC é: " + imc);

	         if (imc < 19) {
	             System.out.println("Você está abaixo do peso.");
	         } else if (imc >= 19 && imc < 25) {
	             System.out.println("Seu peso está normal.");
	         } else if (imc >= 25 && imc < 30) {
	             System.out.println("Você está com sobrepeso.");
	         } else if (imc >= 30 && imc < 40) {
	             System.out.println("Você está com obesidade do tipo 1.");
	         }  else if(imc > 40 ) {
	        	 System.out.println("Você está com obesidade mórbida."); 
	        	 
	         }

	         scanner.close();
	     }
	 }