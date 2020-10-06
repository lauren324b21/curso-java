package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		double num, soma = 0, media;


		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			num = sc.nextDouble();
			
			soma += num;


		}
		
		media = soma / 5;
		
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		

	}
}
