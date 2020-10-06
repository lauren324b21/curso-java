package com.laura.cursojavabasico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você não é maior de idade");

		}

		//barato <= 10
		//10 < valor < 15 - pedir desconto
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro

		System.out.println("Informe o preço do item: ");
		double valor = sc.nextDouble();

		if (valor <= 10){
			System.out.println("Está barato, pode comprar.");
		} else if (valor > 10 && valor <= 15){
			System.out.println("Você pode pedir um desconto.");
		} else if (valor > 15  && valor < 17){
			System.out.println("Pode pesquisar mais.");
		} else { // valor >= 17
					System.out.println("Muito caro, não compre!");
				}

	}

}
