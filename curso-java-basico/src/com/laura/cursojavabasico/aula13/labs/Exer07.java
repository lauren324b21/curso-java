package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do lado do quadrado: ");
		double lado = sc.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("O dobro da área do quadrado é:  " +(area*2));
	}

}
