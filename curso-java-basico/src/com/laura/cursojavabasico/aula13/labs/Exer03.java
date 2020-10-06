package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		System.out.println("Informe o primeiro número: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Informe o primeiro número: ");
		double numero2 = sc.nextDouble();
		
		double soma = numero1 + numero2;
		System.out.println("A soma dos números é: " + soma);

	}

}
