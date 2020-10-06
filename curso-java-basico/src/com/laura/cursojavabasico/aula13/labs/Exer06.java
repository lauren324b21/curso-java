package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		

		System.out.println("Informe o raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " +area);
		
		

	}

}
