package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		int fatorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número do qual deseja obter o fatorial: ");
		int num = sc.nextInt();
		
		System.out.println("Fatorial de: " + num);
		
		System.out.print(num + "! = ");
		
		for(int i = num; i > 1; i--) {
			
			fatorial = fatorial * i;
			
			System.out.print(i + ".");
			
			
		}
		
		System.out.print("1 = " + fatorial);
		
	}

}
