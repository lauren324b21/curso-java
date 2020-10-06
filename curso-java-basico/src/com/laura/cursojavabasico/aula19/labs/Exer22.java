package com.laura.cursojavabasico.aula19.labs;

public class Exer22 {

	public static void main(String[] args) {
		
		int [] A = new int [10];
		int qtd0 = 0, qtd1 = 0;
		
		
		for(int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * 1);
			
			
			if(A[i] == 0) {
				qtd0++;
			}
			
			else {
				qtd1++;
			}
		}
		
		double porc0 = (100*qtd0) / A.length;
		double porc1 = (100*qtd1) / A.length;
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("\nNúmeros 0: " + porc0 + "%");
		System.out.print("\nNúmeros 1: " + porc1 + "%");
		
		
		

	}

}
