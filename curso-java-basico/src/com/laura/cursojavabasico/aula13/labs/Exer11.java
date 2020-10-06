package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int num1 = sc.nextInt();
		
		System.out.println("Informe um número inteiro: ");
		int num2 = sc.nextInt();
		
		System.out.println("Informe um número double: ");
		double num3 = sc.nextDouble();
		
		double resultado1 = (2 * num1) * ( num2 / 2); // erro --> teste com 1 e 1
		double resultado2 = (3 * num1) + (num3);
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);


	}

}
