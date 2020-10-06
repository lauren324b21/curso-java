package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a temperatura em Celsius: ");
		double grausC = sc.nextDouble();

		double grausF = (grausC*1.8) + 32 ;

		System.out.println(grausC + " graus Celsius é igual a " + grausF + " graus Farenheit");


	}

}
