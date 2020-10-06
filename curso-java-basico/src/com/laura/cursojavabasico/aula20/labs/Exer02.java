package com.laura.cursojavabasico.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {

		int [][] numerosAleatorios = new int [10][10];

		Random aleatorio = new Random();

		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;


		for(int i = 0; i < numerosAleatorios.length; i++) {

			for(int j = 0; j < numerosAleatorios[i].length; j++) {

				numerosAleatorios[i][j] = aleatorio.nextInt(10);

			}

		}

		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
				
				if(numerosAleatorios[5][j] > maiorL5) {
					maiorL5 = numerosAleatorios[5][j];
					
				} else if(numerosAleatorios[5][j] < menorL5) {
					menorL5 = numerosAleatorios[5][j];
					
				} else if (numerosAleatorios[i][7] > maiorC7) {
					maiorC7 = numerosAleatorios[i][7];
					
				} else if( numerosAleatorios[i][7] < menorC7) {
					menorC7 = numerosAleatorios[i][7];
				}
			}
			System.out.println();
		}
		
		System.out.println("Maior número da linha 5 = " + maiorL5);
		System.out.println("Menor número da linha 5 = " + menorL5);
		System.out.println();
		System.out.println("Maior número da coluna 7 = " + maiorC7);
		System.out.println("Menor número da coluna 7 = " + menorC7);
		
		
	}
}