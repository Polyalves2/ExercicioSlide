package org.atividade.slide;

import java.util.Scanner;
import java.util.Locale;

 public class metabolismoBasal {

	 /**
	     *Exercício (Calcular o Metabolismo Basal – Parte 2):
	     *Solicite ao usuário a identificação de gênero;
		 *Solicite ao usuário a entrada da idade em anos;
		 *Informe a saída exibindo o metabolismo em Kcal. 
		 *Idade 18 a 30 anos;     Homens 15,057xpeso(kg)+679;     Mulheres 14,7xpeso(kg)+486,6;
	     *Idade 30 a 60 anos;     Homens 11,6xpeso(kg)+879;       Mulheres 8,7xpeso(kg)+829;
	     *Idade >60 anos;         Homens 13,5xpeso(kg)+487;       Mulheres 10,5xpeso(kg)+596;
	     */ 


	     public static void main(String[] args) {
	         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	         System.out.println("Por favor, digite seu gênero (M para masculino, F para feminino):");
	         char genero = scanner.next().charAt(0);

	        
	         System.out.println("Por favor, digite sua idade em anos:");
	         int idade = scanner.nextInt();

	         System.out.println("Por favor, digite seu peso em quilogramas:");
	         double peso = scanner.nextDouble();

	         
	         double metabolismoBasal = calcularMetabolismoBasal(genero, idade, peso);

	        
	         System.out.println("Seu metabolismo basal é aproximadamente: " + metabolismoBasal + " Kcal.");

	         scanner.close();
	     }

	     public static double calcularMetabolismoBasal(char genero, int idade, double peso) {
	         double metabolismoBasal;

	         if (idade >= 18 && idade <= 30) {
	             if (genero == 'M' || genero == 'm') {
	                 metabolismoBasal = 15.057 * peso + 679;
	             } else if (genero == 'F' || genero == 'f') {
	                 metabolismoBasal = 14.7 * peso + 486.6;
	             } else {
	                 System.out.println("Gênero inválido.");
	                 return 0; 
	             }
	         } else if (idade > 30 && idade <= 60) {
	             if (genero == 'M' || genero == 'm') {
	                 metabolismoBasal = 11.6 * peso + 879;
	             } else if (genero == 'F' || genero == 'f') {
	                 metabolismoBasal = 8.7 * peso + 829;
	             } else {
	                 System.out.println("Gênero inválido.");
	                 return 0; 
	             }
	         } else if (idade > 60) {
	             if (genero == 'M' || genero == 'm') {
	                 metabolismoBasal = 13.5 * peso + 487;
	             } else if (genero == 'F' || genero == 'f') {
	                 metabolismoBasal = 10.5 * peso + 596;
	             } else {
	                 System.out.println("Gênero inválido.");
	                 return 0; 
	             }
	         } else {
	             System.out.println("Idade fora do intervalo válido.");
	             return 0; 
	         }

	         return metabolismoBasal;
	     }
	 }

