package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		int popA,popB;
		double taxaA, taxaB;


		Scanner sc = new Scanner(System.in);

		boolean infoValida = false;



		do {
			System.out.println("Informe a população de A: ");
			popA = sc.nextInt();

			if(popA>0) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("População deve ser maior que 0");
			}
		} while(infoValida == false);

		do {
			System.out.println("Informe a população de B: ");
			popB= sc.nextInt();

			if(popB>0) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("População deve ser maior que 0");
			}
		} while(infoValida == false);

		do {
			System.out.println("Informe a taxa de crescimento de A: ");
			taxaA = sc.nextDouble();

			if(taxaA > 0){
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Taxa de crescimento deve ser maior que 0");
			}
		} while(infoValida == false);
		
		do {
			System.out.println("Informe a taxa de crescimento de B: ");
			taxaB = sc.nextDouble();

			if(taxaB > 0){
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Taxa de crescimento deve ser maior que 0");
			}
			
		} while(infoValida == false);
		
		int cont = 0;
		

		while(popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			
			cont++;
		}
		
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de anos: " + cont);

		
	} 

}

