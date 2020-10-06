package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe uma letra:");
		String letra = sc.nextLine();

		if (letra.length() > 1){
			System.out.println("O valor informado não é uma letra.");
		} else {
			switch(letra){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("A letra informada é uma vogal."); break;
			default: System.out.println("A letra informada é uma consoante.");  
			}
		}
	}

}
