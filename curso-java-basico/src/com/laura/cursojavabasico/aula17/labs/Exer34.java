package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double soma = 0;

		System.out.println("Informe o valor de N: ");
		int n = sc.nextInt();

		System.out.print("H = ");
		
		for(int i = 1; i <= n; i++) {


			System.out.print(   "1/" + (i) + " + ");
			
			soma += 1 / i ;
			
			
 
		}
		
		System.out.println("\nSoma = " + soma);
		
		

	}

}
