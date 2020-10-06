package com.laura.cursojavabasico.aula20.labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
		int [][] numerosAleatorios = new int [4][4];
		
		Random aleatorio = new Random();
		
		int maior  = Integer.MIN_VALUE;
		int linha  = 0;
		int coluna = 0;
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				
				numerosAleatorios[i][j] = aleatorio.nextInt(9);
				System.out.print(numerosAleatorios[i][j] + " ");
				
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					
					linha = i;
					coluna = j;
				}
				
				
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna " + coluna);
		
		
		
		
	}

}
