package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do primeiro produto:");
		double preco1 = sc.nextDouble();


		System.out.println("Informe o valor do segundo produto:");
		double preco2 = sc.nextDouble();


		System.out.println("Informe o valor do terceiro produto:");
		double preco3 = sc.nextDouble();

		if(preco1 < preco2 && preco1 < preco3) {
			System.out.println("Compre o primeiro produto");

		} else if (preco2 < preco1 && preco2 < preco3){
			System.out.println("Compre o segundo produto");

		} else if (preco3 < preco1 && preco3 < preco2){
			System.out.println("Compre o terceiro produto");

		}
	}

}
