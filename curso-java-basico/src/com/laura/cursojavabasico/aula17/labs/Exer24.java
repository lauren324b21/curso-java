package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);


		System.out.print("Pre�o do p�o R$: ");
		double precoPao = sc.nextDouble();

		


		System.out.println("Panificadora P�o de Ontem - TABELA DE PRE�OS\n");

		for(int i = 1; i <= 50; i++) {

			System.out.println(i + " - R$ " + i * precoPao);

		}

	}
}