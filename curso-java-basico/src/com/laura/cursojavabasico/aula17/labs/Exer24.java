package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);


		System.out.print("Preço do pão R$: ");
		double precoPao = sc.nextDouble();

		


		System.out.println("Panificadora Pão de Ontem - TABELA DE PREÇOS\n");

		for(int i = 1; i <= 50; i++) {

			System.out.println(i + " - R$ " + i * precoPao);

		}

	}
}