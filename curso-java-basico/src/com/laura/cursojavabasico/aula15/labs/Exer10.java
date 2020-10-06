package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Em qual turno você estuda?\n M - Matutino\n V - Vespertino\n N - Noturno");
		String turno = sc.nextLine();
		
		if(turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
			
		} else if(turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Turno inválido!");
			
		}
	}

}
