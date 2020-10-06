package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double qtdImpar = 0, media = 0, soma = 0;
		
		int [] A = new int [10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();
			
			if(A[i] % 2 != 0) {
				soma += A[i];
				qtdImpar++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");

			
		}
		
		System.out.println();
		System.out.println("Média dos números impares: " + (media = soma / qtdImpar));

	}

}
