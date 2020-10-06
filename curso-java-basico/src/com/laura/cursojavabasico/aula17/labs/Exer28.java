package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número:");
		int num = sc.nextInt();

		boolean primo = true;


		for (int i = 2; i < num; i++){
			if (num % i == 0){
				System.out.println("Não é primo - divisível por " + i);
				primo = false;
				
			}
		}

		if (primo){
			System.out.println("É primo");
		}
	}

}


