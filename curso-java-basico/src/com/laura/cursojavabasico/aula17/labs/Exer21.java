package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		int numAlunos;
		boolean valido = false;
		int soma = 0;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Informe a quantidade de turmas: ");
		int numTurmas = sc.nextInt();
		
		for(int i = 1; i <= numTurmas; i++ ) {
			
			do {
				System.out.println("Informe a quantidade de alunos da turma " + (i));
				numAlunos = sc.nextInt();
				
				if(numAlunos <= 40) {
					valido = true;
					
				} else {
					System.out.println("Número de alunos inválido. Tente novamente.");
				}
				
			} while(!valido);
			
			
			soma += numAlunos;
			
			
		}
		
		double media = soma / numTurmas; 
		
		System.out.println("Média de alunos por turma: " + media);

	}

}
