package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		

		System.out.println("Quanto voc� ganha por hora? ");
		double valorHora = sc.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		int horaMes = sc.nextInt();
		
		double salarioBruto = (valorHora*horaMes);
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
				
		System.out.println("Seu sal�rio bruto �: R$" +salarioBruto);
		System.out.println("Desconto do INSS: R$" +inss);
		System.out.println("Desconto do sindicato: R$" +sindicato);
		System.out.println("Desconto do Imposto de Renda: R$" +ir);
		System.out.println("O total de descontos �: R$" +totalDescontos);
		System.out.println("Seu sal�rio l�quido �: R$" +salarioLiquido);
		
	}

}
