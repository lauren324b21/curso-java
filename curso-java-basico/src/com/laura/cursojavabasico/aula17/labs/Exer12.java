package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("De qual número você quer obter a tabuada?");
		num = sc.nextInt();
		
		
		if(num > 0 && num <= 10) {
			
			System.out.println("Tabuada de: " + num );
			
			for(int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num*i));
			}
			
		} else {

			System.out.println("Essa tabuada só suporta números de 1 a 10.");
		}
		
		
		

	}

}
