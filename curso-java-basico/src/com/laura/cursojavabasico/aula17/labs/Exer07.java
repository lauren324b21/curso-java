package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			num = sc.nextInt();
			
			if(num > maior) {
				maior = num;
			}
		
		}
		
		System.out.println("O maior número digitado foi: " + maior);
	}

}
