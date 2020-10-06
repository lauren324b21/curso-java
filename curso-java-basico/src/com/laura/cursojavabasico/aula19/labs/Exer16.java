package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0, menor = 0, igual = 0, soma = 0, soma1 = 0, media = 0;
		
		int [] A = new int [10];
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();
			
			if(A[i] < 15 ) {
				
				soma += A[i];
				menor++;
				
			}
			
			else if(A[i] == 15) {
				igual++;
				
				
			}
			
			else if(A[i] > 15) {
				maior++;
				soma1 += A[i];
				media = soma1 / maior;
			}
		}
		
		
		System.out.print("Vetor A = ");
		
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.print("\nQuantidade de elementos menores que 15: " + menor);
		System.out.print("\nSoma dos elementos menores que 15: " + soma);
		
		System.out.print("\nQuantidade de elementos iguais a 15: " + igual);
		
		System.out.print("\nQuantidade de elementos maiores que 15: " + maior);
		System.out.print("\nMédia de elementos maiores que 15: " + media );
		

	}

}
