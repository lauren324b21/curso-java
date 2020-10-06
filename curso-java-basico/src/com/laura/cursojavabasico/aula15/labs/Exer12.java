package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora?");
		double ganhaHora = sc.nextDouble();

		System.out.println("Quantas horas você trabalha por mês?");
		double horaMes = sc.nextDouble();

		double salarioBruto = ganhaHora * horaMes;

		int percentualIR = 0;

		if(salarioBruto <= 900) {
			percentualIR = 0;

		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}

		double ir = (salarioBruto / 100) * percentualIR;
		double sindicato = (salarioBruto / 100)* 3;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salário Bruto: (" + ganhaHora + " * " + horaMes + "): R$" + salarioBruto );
		System.out.println("(-) IR ("+percentualIR+ "%): R$" +ir );
		System.out.println("(-) INSS (3%): R$" +sindicato );
		System.out.println("FGTS (11%): R$" +fgts);
		System.out.println("Total de descontos: R$" +totalDescontos);
		System.out.println("Salário Líquido: R$" +salarioLiquido );





	}

}
