package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		double num1 = sc.nextDouble();
		

		System.out.println("Informe o primeiro n�mero:");
		double num2 = sc.nextDouble();
		
		if(num1 > num2) {

			System.out.println("O maior n�mero �: " +num1);
			
		} else {
			System.out.println("O maior n�mero �: " +num2);
			
		}
		
		

	}

}
