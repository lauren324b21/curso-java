package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int [] A = new int [20];
		int [] B = new int [A.length];
		int [] C = new int [A.length];
		int posB = 0, posC = 0;

		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();

			if(A[i] % 2 == 0) {

				B[posB] = A[i];
				posB++;
				

			}

			else {


				C[posC] = A[i];
				posC++;
			}
		}

		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for(int i = 0; i < posB; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for(int i = 0; i < posC; i++) {
			System.out.print(C[i] + " ");
		}

	}

}
