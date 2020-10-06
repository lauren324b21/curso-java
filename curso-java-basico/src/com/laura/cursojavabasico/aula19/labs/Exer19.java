package com.laura.cursojavabasico.aula19.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		double [] nota1 = new double [10];
		double [] nota2 = new double [nota1.length];
		double [] result = new double [nota1.length]; 

		for(int i = 0; i < nota1.length; i++) {

			System.out.println("Entre com a nota 1 do aluno " +(i+1));
			nota1[i] = sc.nextDouble();

			System.out.println("Entre com a nota 2 do aluno " +(i+1));
			nota2[i] = sc.nextDouble();

			result[i] = (nota1[i] + nota2[i]) / 2;




		}
		
		 System.out.print("Notas 1: ");
		 for(int i = 0; i < nota1.length; i++){
			 System.out.print(nota1[i] + " ");
			 
			 
			 
			
		}
		 
		 System.out.println();
		 
		 System.out.print("Notas 2: ");
		 for(int i = 0; i < nota2.length; i++){
			 System.out.print(nota2[i] + " ");
			 
			 
			 
			
		}
		 
		 System.out.println();
		 
		 System.out.println("Resultados:");
		 for(int i = 0; i < result.length; i++) {
			 
			 if(result[i] >= 7) {
				 System.out.println("Aluno " + (i+1) + " - média: " + result[i] + " - APROVADO");
			 } 
			 
			 else {
				 System.out.println("Aluno " + (i+1) + " - média: " + result[i] + " - REPROVADO");
				 
			 }
		 }

	}

}
