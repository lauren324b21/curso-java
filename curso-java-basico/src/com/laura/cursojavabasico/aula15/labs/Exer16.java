package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de a: ");
		int a = sc.nextInt();

		if(a == 0) {

			System.out.println("A equa��o n�o � de segundo grau.");

		} else {


			System.out.println("Informe o valor de b: ");
			int b = sc.nextInt();


			System.out.println("Informe o valor de c: ");
			int c = sc.nextInt();

			double delta = (b*b) - (4*a*c);

			if(delta < 0) {
				
				System.out.println("Delta: " + delta);
				System.out.println("A equa��o n�o possui ra�zes reais.");

			} else if (delta > 0){

				

                double raiz1 = ((-b) + Math.sqrt(delta)) / (2*a);
                double raiz2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("Delta: " + delta);

				System.out.println("As ra�zes da sua equa��o s�o: " + raiz1 + " e " + raiz2);

			} else if (delta == 0) {
				
				double raiz1 = (((-b) + Math.sqrt(delta)) / 2*a);
				
				System.out.println("Delta: " + delta);
				System.out.println("A ra�z da sua equa��o �: " + raiz1);

			}

		}
	}

}
