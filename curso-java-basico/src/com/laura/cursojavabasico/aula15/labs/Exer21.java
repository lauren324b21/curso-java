package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos litros de compustível você deseja?");
		double litros = sc.nextDouble();
		
		System.out.println("Qual tipo de combustível você deseja?\nA - álcool\nG - gasolina");
		String tipo = sc.next();
		
		double precoG = 2.5;
		double precoA = 1.9;
		double total = 0;
		double desconto = 0;
		double aPagar = 0;
		int percentual = 0;
		
		
		if(tipo.equalsIgnoreCase("A")) {
			if(litros <= 20) {
				percentual = 3;
				
			} else {
				percentual = 5;
			}
			
			total = litros * precoA;
			
		} else if(tipo.equalsIgnoreCase("G")){
			if(litros <= 20) {
				percentual = 4;
			} else {
				percentual = 6;
			}
			
			total = litros * precoG;
			
			
	}
		
		desconto = ( total / 100) * percentual;
		
		aPagar = total - desconto;
		
		
		
		System.out.println("Total a pagar: " + aPagar);
		
	}

}
