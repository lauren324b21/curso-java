package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double [] A = new double [20];
		double cotacao;
		
		System.out.println("Entre com a cotação do dolar: ");
		cotacao = sc.nextDouble();
		
		for(int i = 0; i < A.length; i++) {
			A[i] = cotacao * (i+1);
			
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}

	}

}
