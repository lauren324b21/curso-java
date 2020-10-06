package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		double pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("Seu peso ideal é: " +pesoIdeal + " kilos");
		
		

	}
}
