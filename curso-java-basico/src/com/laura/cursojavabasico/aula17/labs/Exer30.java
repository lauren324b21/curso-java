package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		boolean valido = true;

		Scanner sc = new Scanner(System.in);
		
		int tabuada, comecar, terminar;
		
		
		do {
			
			System.out.print("Montar a tabuada do: ");
			tabuada = sc.nextInt();
			
			System.out.print("Começar por: ");
			comecar = sc.nextInt();
			
			System.out.print("Terminar em: ");
			terminar = sc.nextInt();
			
			if(terminar < comecar) {
				
				valido = false;
				
			}
			
		} while (valido == false);
		
		
		
		
		System.out.println("Vou montar a tabuada do " + tabuada + " começando em " + comecar + " e terminando em " + terminar);
		
		for(int i = comecar; i <= terminar; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
		
		
				

	}

}
