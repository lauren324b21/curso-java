package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número:");
		double num1 = sc.nextDouble();

		System.out.println("Informe o segundo número:");
		double num2 = sc.nextDouble();


		System.out.println("Qual operação você deseja realizar? \n+\n-\n*\n/");
		String operacao = sc.next();

		
		boolean valido = true;
		double resultado = 0;
		
		switch(operacao) {
		case "+":
			resultado = num1 + num2;
			System.out.println("A soma dos números é: " + resultado);
			break;
		case "-":
			resultado = num1 - num2;
			System.out.println("A subtração dos números é: " + resultado);
			break;
		case "*":
			resultado = num1 * num2;
			System.out.println("A multiplicação dos números é: " + resultado);
			break;
		case "/":
			resultado = num1 / num2;
			System.out.println("A divisão dos números é: " + resultado);
			break;
		default: 
			System.out.println("Operação inválida");	
			valido = false;
		}
		
		if(resultado >= 0) {
			System.out.println("O resultado é positivo");
			
		} else {
			System.out.println("O resultado é negativo");
		}
		
		if(resultado % 2 == 0) {
			System.out.println("O resultado é par");
		} else {
			System.out.println("O resultado é ímpar");
		}

	}

}
