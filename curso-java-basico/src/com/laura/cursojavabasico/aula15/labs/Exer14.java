package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String conceito = "";
		
		if(media > 9 && media <= 10) {
			conceito = "A";
		} else if (media > 7.5 && media <= 9) {
			conceito = "B";
		} else if (media > 6 && media <= 7.5) {
			conceito = "C";
		} else if (media > 4 && media <= 6) {
			conceito = "D";
		} else if(media > 0 && media <= 4) {
			conceito = "E";
		}
		
		System.out.println("Suas notas são: " + nota1 + " e " + nota2);
		System.out.println("Sua média é: " + media);
		System.out.println("Seu conceito é: " + conceito);
		
		switch (conceito) {
		case "A": 
		case "B":
		case "C": System.out.println("APROVADO");
		break;
		
		case "D":
		case "E": System.out.println("REPROVADO");
			
		}
		
	

	}

}
