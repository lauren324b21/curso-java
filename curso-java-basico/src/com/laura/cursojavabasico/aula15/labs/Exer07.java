package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero:");
		double num1 = sc.nextDouble();


		System.out.println("Informe o segundo n�mero:");
		double num2 = sc.nextDouble();


		System.out.println("Informe o terceiro n�mero:");
		double num3 = sc.nextDouble();

		if(num1 > num2 && num1 > num3) {
			System.out.println("O primeiro n�mero � maior: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo n�mero � maior: " + num2);

		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O terceiro n�mero � maior: " + num3);


			if(num1 < num2 && num1 < num3) {
				System.out.println("O primeiro n�mero � menor: " + num1);
			} else if (num2 < num1 && num2 < num3) {
				System.out.println("O segundo n�mero � menor: " + num2);

			} else if (num3 < num1 && num3 < num2) {
				System.out.println("O terceiro n�mero � menor: " + num3);



			}

		}
	}
}
