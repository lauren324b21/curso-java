package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] A = new int [10];
		int [] B = new int [A.length];
		int [] C = new int [A.length];

		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i + " para o vetor A");
			A[i] = sc.nextInt();
			
		}
		   for(int i = 0; i < B.length; i++) {
			System.out.println("Entre com o valor da posição " + i + " para o vetor B");
			B[i] = sc.nextInt();

			if(A[i] > B[i]) {
				C[i] = 1;
			}

			else if(A[i] == B[i] ) {
				C[i] = 0;

			}

			else {
				C[i] = -1;
			}

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

		System.out.println();





	}


}