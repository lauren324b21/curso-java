package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		double grausF = sc.nextDouble();
		
		double grausC = (5 * (grausF-32) / 9);
		
		System.out.println(grausF + " graus Farenheit é igual a " + grausC + " graus Celsius");
	
	}

}
