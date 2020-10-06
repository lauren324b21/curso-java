package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número:");
		double num1 = sc.nextDouble();


		System.out.println("Informe o segundo número:");
		double num2 = sc.nextDouble();


		System.out.println("Informe o terceiro número:");
		double num3 = sc.nextDouble();

		if(num1 > num2 && num1 > num3) {
			System.out.println("O primeiro número é maior: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo número é maior: " + num2);

		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O terceiro número é maior: " + num3);


			if(num1 < num2 && num1 < num3) {
				System.out.println("O primeiro número é menor: " + num1);
			} else if (num2 < num1 && num2 < num3) {
				System.out.println("O segundo número é menor: " + num2);

			} else if (num3 < num1 && num3 < num2) {
				System.out.println("O terceiro número é menor: " + num3);



			}

		}
	}
}
