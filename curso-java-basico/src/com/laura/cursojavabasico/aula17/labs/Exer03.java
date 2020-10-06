package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean infoValida = false;


		do {

			System.out.println("Informe seu nome: ");
			nome = sc.nextLine();

			if(nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome inv�lido");
			}

		} while(infoValida == false);	



		infoValida = false;

		do {

			System.out.println("Informe sua idade: ");
			idade = sc.nextInt();

			if(idade <= 150 && idade >=0) {
				infoValida = true;
			} else {
				System.out.println("Idade inv�lida.");
			}

		} while(infoValida == false);



		infoValida = false;

		do {

			System.out.println("Informe seu sal�rio: ");
			salario = sc.nextDouble();

			if(salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Sal�rio inv�lido.");
			}

		} while(infoValida == false);



		infoValida = false;

		do {

			System.out.println("Informe seu sexo: ");
			System.out.println("F - feminino");
			System.out.println("M - masculino");
			sexo = sc.next();




			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo inv�lido");
			}
		} while(infoValida == false);


		infoValida = false;

		do {

			System.out.println("Informe seu Estado Civil: ");
			System.out.println("S - solteiro");
			System.out.println("C - casado");
			System.out.println("V - vi�vo");
			System.out.println("D - divorciado");
			estadoCivil = sc.next();




			if(estadoCivil.equalsIgnoreCase("s")
					|| estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") 
					|| estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado Civil inv�lido");
			}
		} while(infoValida == false);

		
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Sal�rio: R$" +salario);
		System.out.println("Sexo: " +sexo);
		System.out.println("Estado Civil: " +estadoCivil);





	}

}
