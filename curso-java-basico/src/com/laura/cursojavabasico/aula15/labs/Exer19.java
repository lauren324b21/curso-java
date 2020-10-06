package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero:");
		double num1 = sc.nextDouble();

		System.out.println("Informe o segundo n�mero:");
		double num2 = sc.nextDouble();


		System.out.println("Qual opera��o voc� deseja realizar? \n+\n-\n*\n/");
		String operacao = sc.next();

		
		boolean valido = true;
		double resultado = 0;
		
		switch(operacao) {
		case "+":
			resultado = num1 + num2;
			System.out.println("A soma dos n�meros �: " + resultado);
			break;
		case "-":
			resultado = num1 - num2;
			System.out.println("A subtra��o dos n�meros �: " + resultado);
			break;
		case "*":
			resultado = num1 * num2;
			System.out.println("A multiplica��o dos n�meros �: " + resultado);
			break;
		case "/":
			resultado = num1 / num2;
			System.out.println("A divis�o dos n�meros �: " + resultado);
			break;
		default: 
			System.out.println("Opera��o inv�lida");	
			valido = false;
		}
		
		if(resultado >= 0) {
			System.out.println("O resultado � positivo");
			
		} else {
			System.out.println("O resultado � negativo");
		}
		
		if(resultado % 2 == 0) {
			System.out.println("O resultado � par");
		} else {
			System.out.println("O resultado � �mpar");
		}

	}

}
