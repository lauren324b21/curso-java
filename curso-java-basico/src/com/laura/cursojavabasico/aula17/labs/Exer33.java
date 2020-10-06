package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Informe o valor de n: ");
		int n = sc.nextInt();
		
		System.out.print("S = ");
		for(int i = 1, j = 1; i <= n; i++, j+=2) {
			
			
			System.out.print( (i) + "/" + (j) + " + ");
			
			soma += i / j; 
			
		}

		System.out.println("\nSoma = " + soma);
	}

}
