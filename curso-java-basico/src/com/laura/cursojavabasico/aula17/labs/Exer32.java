package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
	
		
		int cod, qtd;
		double total = 0;
		
		Scanner sc = new Scanner(System.in);
		boolean finalizar = false;
		
		
		System.out.println("|| Especificação   || Código || Preço\r\n" + 
		        "\n" +
				"|| Cachorro Quente || 100    || R$1,20\r\n" + 
				"|| Bauru Simples   || 101    || R$1,30\r\n" + 
				"|| Bauru com ovo   || 102    || R$1,50\r\n" + 
				"|| Hambúrguer      || 103    || R$1,20\r\n" + 
				"|| Cheeseburguer   || 104    || R$1,30\r\n" + 
				"|| Refrigerante    || 105    || R$1,00");
		
		
		do {
			
			System.out.println("\n === PARA FINALIZAR O PEDIDO DIGITE 0 EM AMBOS OS CAMPOS ===\n");
			System.out.print("Informe o código do produto: ");
			cod = sc.nextInt();
			
			System.out.print("Informe a quantidade do produto: ");
			qtd = sc.nextInt();
			
			if(cod == 0 && qtd == 0) {
				finalizar = true;
			} else {
				if(cod == 100) {
					total += 1.20 * qtd;
				} else if(cod == 101) {
					total += 1.30 * qtd;
					
				} else if(cod == 102) {
					total += 1.50 * qtd;
					
				} else if(cod == 103) {
					total += 1.20 * qtd;
					
				} else if(cod == 104) {
					total += 1.30 * qtd;
					
				} else if(cod == 105) {
					total += 1.00* qtd;
					
				}
			}
		} while (finalizar == false);
		
      System.out.println("\nTotal do pedido: R$" + total);
	}

}
