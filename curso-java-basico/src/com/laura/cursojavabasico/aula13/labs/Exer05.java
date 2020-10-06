package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade em metros: ");
		double metros = sc.nextDouble();
		double cm = metros*100;
		System.out.println(metros + " metros é igual a " +cm + " centímetros");


	}

}
