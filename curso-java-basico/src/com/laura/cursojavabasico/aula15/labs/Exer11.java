package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu salário atual?");
		double salarioAtual = sc.nextDouble();
		
		int percentual = 0;
		
		if(salarioAtual <= 280) {
			percentual = 20; 
		} else if(salarioAtual > 280 && salarioAtual <= 700) {
			percentual = 15;
			
		} else if(salarioAtual > 700 && salarioAtual <= 1500) {
			percentual = 10;
			
		} else if(salarioAtual > 1500) {
			percentual = 5;
		}
	
		double aumento = (salarioAtual / 100) * percentual;
		double salarioAjustado = salarioAtual + aumento;
		
		System.out.println("Salário atual: R$" + salarioAtual);
		System.out.println("Percentual de aumento: " + percentual + "%");
		System.out.println("Valor aumentado: R$" + aumento);
		System.out.println("Novo salário: R$" + salarioAjustado);
		
		
		
		
	}

}
