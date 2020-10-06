package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o n-ésimo termo da sequência Fibonacci");
		n = sc.nextInt();
		
		// 1, 1, 2, 3, 5, 8
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3; i <= n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
			
			
			
			
			
		}

	}

}
