package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] A = new int [10];

		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posi��o: " + i);
			A[i] = sc.nextInt();


		}

		boolean primo;
		String msg;

		for(int i = 0; i < A.length; i++) {

			primo = true;

			for(int j = 2; j < A[i]; j++) {


				if(A[i] % j == 0) {
					primo = false;
					break;
				}
			}

			if(primo) {
				msg = " � primo";
			}
			
			

			else {
				msg = " N�o � primo";
			}



			System.out.println("O n�mero " + A[i] + msg);
		}



	}

}
