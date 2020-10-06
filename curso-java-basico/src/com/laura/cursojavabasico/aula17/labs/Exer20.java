package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		int idade; 
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de idades que deseja calcular");
		int numIdade = sc.nextInt();
		
		for(int i = 0; i < numIdade; i++) {
			System.out.println("Informe a idade " +(i+1));
			idade = sc.nextInt();
			
			media += idade / numIdade;
		}
		
		System.out.println("Média da turma: " + media + " anos");
		
		if(media >= 0 && media <= 25) {
			System.out.println("Turma jovem");
			
		} else if(media >= 26 && media <= 60) {
			System.out.println("Turma adulta");
			
		} else if(media > 60) {
			System.out.println("Turma idosa");
		}

	}

}
