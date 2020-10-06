package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma letra (F ou M)");
		String letra = sc.nextLine();
		
		if(letra.equalsIgnoreCase("f")) {
			System.out.println("F - feminino");
			
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
