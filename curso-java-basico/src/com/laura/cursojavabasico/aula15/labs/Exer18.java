package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero � par.");
			
		} else {
			System.out.println("O n�mero � �mpar.");
		}

	}

}
