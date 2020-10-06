package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int [10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			A[i] = sc.nextInt();
		}

	}

}
