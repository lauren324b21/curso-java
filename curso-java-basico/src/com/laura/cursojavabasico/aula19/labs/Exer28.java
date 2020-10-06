package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int [10];
		int [] B = new int [A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();
			
			B[A.length - i - 1] = A[i];
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
		
		

	}

}
