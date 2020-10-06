package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		int num, fatorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número do qual deseja obter o fatorial:");
		num = sc.nextInt();
       
		System.out.print(num + "! = ");
		
		for(int i = num; i > 1; i--) {
			fatorial = fatorial * i;
			
			System.out.print(i +  "*");
			
		}
		
		
		System.out.print("1 = " + fatorial);
	}

}
