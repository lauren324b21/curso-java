package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, pares = 0, impares = 0;
		
		
		for(int i = 1 ; i <= 10; i++) {
			System.out.println("Informe o " + i + "� n�mero");
			num = sc.nextInt();
			
			if( num % 2 == 0) {
				pares++;
				
				
			} else {
				 impares++;
				
			
			
		}
		
		}
		

		System.out.println(pares + " n�meros s�o pares");
		System.out.println(impares + " n�meros s�o �mpares");

	}

}
