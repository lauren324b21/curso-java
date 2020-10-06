package com.laura.cursojavabasico.aula17.labs;

import java.text.DecimalFormat;

public class Exer31 {

	public static void main(String[] args) {
		
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		double salario = 1000;
		double percentual = 1.5;
		double percentualAtual;
		
		
		salario = salario +(salario/100)*percentual;
		 

		for(int i = 1997; i <= 2020; i++) {
			percentual = percentual * 2;
			
			salario = salario +(salario/100)*percentual;
			
			System.out.println(i + " - R$" + format.format(salario) + " - " + percentual + "%");
			
		}
		
		
	}

}
