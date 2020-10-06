package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int [11];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = (int) Math.pow(2, i);
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

}
