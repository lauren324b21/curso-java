package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		int maior = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int [10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			A[i] = sc.nextInt();
			
			if(A[i] > 35) {
				maior++;
				
				
				
			}
			
			
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.print("\nQuantidade de pessoas com idade superior a 35: " + maior);
		
	}

}
