package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int base, exp;
		
		System.out.println("Informe a base");
		base = sc.nextInt();
		
		System.out.println("Informe o expoente");
		exp = sc.nextInt();
		
		// 2^4 2*2*2*2
		
		int resultado = base;
		
		for(int i = 1; i < exp; i++) {
			
			resultado = base * resultado;
			
			
			
		}
		
		System.out.println(base +"^" + exp + " = " + resultado);

	}

}
