package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtdMultiplo = 0;
		
		int [] A = new int [10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();
			
			if(A[i] % 5 == 0) {
				qtdMultiplo++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");

			
		}
		
		System.out.println();
		System.out.println("Quantidade de números múltiplos de cinco: " + qtdMultiplo);

	}

}
