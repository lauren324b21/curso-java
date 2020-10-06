package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		double temperatura, media;
		double soma = 0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de temperaturas a calcular: ");
		int qtdTemperatura = sc.nextInt();
		
		for(int i = 1; i <= qtdTemperatura; i++) {
			
			System.out.println("Informe a temperatuda " + i);
			temperatura = sc.nextDouble();
			
			soma += temperatura;
			
			
			if(temperatura > maior) {
				maior = temperatura;
			}
			if (temperatura < menor) {
				menor = temperatura;
			}
		}
		
		System.out.println("Maior temperatura informada: " + maior);
		System.out.println("Menor temperatura informada: " + menor);
		System.out.println("Média das temperaturas informadas: " + (soma/qtdTemperatura));
	}

}
