package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		boolean notaValida = false;
		
		do {
			System.out.println("Informe a nota: ");
			double nota = sc.nextDouble();
			
			if(nota <= 10 && nota > 0) {
				System.out.println("Nota v�lida");
				notaValida = true;
			}
			
			else {
				System.out.println("Nota v�lida, tente novamente");
				
			}
		} while(notaValida == false);
		
	}

}

