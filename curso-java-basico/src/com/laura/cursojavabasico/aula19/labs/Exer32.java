package com.laura.cursojavabasico.aula19.labs;
import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int [5];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			A[i] = sc.nextInt();
		}
		
		
		
		for(int i = 0; i < A.length; i++) {
			System.out.println();
			System.out.println("Tabuada de: " + A[i]);
			for(int j = 1; j <= 10; j++) {
				System.out.println(A[i]+"x"+ j + " = " + A[i] * j );
				
			}
		}

	}

}
