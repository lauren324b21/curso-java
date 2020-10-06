package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		double valorCD, soma = 0, media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe a quantidade de CD's:");
		int cds = sc.nextInt();
		
		for(int i = 1; i <= cds; i++) {
			
			System.out.println("Informe o valor do CD " + i);
			valorCD = sc.nextDouble();
			
			soma +=  valorCD;
			
			
		}
		
		media = soma / cds;
		
		System.out.println("O valor total investido é de R$" +soma);
		
		System.out.println("A média de custo é de R$" +media);
		
		
		
		
		
	}

}
