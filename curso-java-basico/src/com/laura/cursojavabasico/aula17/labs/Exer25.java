package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String compra;
		boolean realizar = false;
		int qtdProduto;
		double preco, total = 0, pago, troco;
		String saida;





		do {


			System.out.println("Deseja contabilizar uma nova compra?\n S - SIM\n N - NÃO");
			compra = sc.next();

			if(compra.equalsIgnoreCase("S")) {

				realizar = true;
				
				saida = "Lojas Tabajara\n";

				System.out.print("Informe a quantidade de produtos da compra: ");
				qtdProduto = sc.nextInt();




				for(int i = 1; i <= qtdProduto; i++) {
					System.out.println("Informe o preço do produto " + i);
					preco = sc.nextDouble();
					
					total +=preco;
					saida+= "Produto " + i + ": R$" + preco + "\n";


				}
				
				System.out.print("Informe o valor pago: ");
				pago = sc.nextDouble();
				
				System.out.print(saida);
				
				System.out.println("Total: R$" + total);
				
				System.out.println("Dinheiro: R$" + pago);
				
				troco = pago - total;
				
				System.out.println("Troco: R$" + troco);
				
				



			} else if (compra.equalsIgnoreCase("N")) {
				realizar = false;

			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (realizar == true);

	}

}
