package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora? ");
		double valorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		int horaMes = sc.nextInt();
		
		double salario = (valorHora*horaMes);
		System.out.println("Seu salário é de R$" +salario);
		
	}

}
