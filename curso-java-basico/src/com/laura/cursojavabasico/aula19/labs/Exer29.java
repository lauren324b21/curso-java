package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] A = new int [10];
		int [] B = new int [A.length];
		int [] C = new int [A.length * 2];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i + " para o vetor A");
			A[i] = sc.nextInt();
			
			C[i] = A[i];
		}
		
		for(int i = 0; i < B.length; i++) {
			System.out.println("Entre com o valor da posição " + i + " para o vetor B");
			B[i] = sc.nextInt();
			
			C[A.length + i] = B[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		
	}

}
