package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		int ePar = 0, eImpar=0;
		double percentualPar = 0;
		double percentualImpar = 0;


		Scanner sc = new Scanner(System.in);

		int [] A = new int [10];

		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();

			if(A[i] % 2 == 0) {
				ePar++;
				
			percentualPar = (ePar*100)/A.length;
			}
			else {
				eImpar++;
				
				percentualImpar = (eImpar*100)/A.length;
			}



		}

		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");

		}

		System.out.println();
		System.out.println("Percentual de números pares: " + percentualPar + "%");
		System.out.println("Percentual de números impares: " + percentualImpar + "%");
	}

}
