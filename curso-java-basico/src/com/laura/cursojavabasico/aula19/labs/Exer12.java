package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		int [] A = new int [10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();
			
			soma += A[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");

			
		}
		
		System.out.println();
		System.out.println("Soma: " + soma);
	}

}
