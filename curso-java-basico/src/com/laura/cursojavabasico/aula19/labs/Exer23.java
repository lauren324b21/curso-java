package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int [10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o n�mero da posi��o " + i);
			A[i] = sc.nextInt();
			
			if(A[i] % 2 != 0) {
				System.out.println("N�mero n�o par. Tente novamente");
				break;
			}
		}
	}

}
