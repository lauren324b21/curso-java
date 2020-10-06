package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		double media = 0, nota;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número de notas que deseja calcular: ");
		int numNotas = sc.nextInt();
		
		for(int i = 0; i < numNotas; i++) {
			
			System.out.println("Informe a nota " + (i+1));
			nota = sc.nextDouble();
			
			media += nota / numNotas;
			
		}
		
		System.out.print("Média: " + media);
	}

}
