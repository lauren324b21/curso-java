package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		double nota1 = sc.nextDouble();
		
		System.out.println("Informe a primeira nota:");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com distin��o!");
			
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado.");
		}

	}

}
