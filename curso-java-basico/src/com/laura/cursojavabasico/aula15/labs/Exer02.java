package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		double num = sc.nextDouble();
		
		if(num >= 0) {
			System.out.println("O n�mero � positivo");
		} else {
			System.out.println("O n�mero � negativo.");
		}

	}

}
