package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int num1,num2, soma = 0;

		System.out.println("Informe o primeiro número");
		num1 = sc.nextInt();

		System.out.println("Informe o segundo número");
		num2 = sc.nextInt();
		


		if(num2 > num1) {
			for(int i = num1; i <= num2; i++) {
				System.out.println(i);
				
				soma+= i;
			} System.out.println(soma);

		} else {
			for(int i = num2; i <= num1; i++) {
				System.out.println(i);
				soma += i;
			} System.out.println("Soma: " + soma);
		}
	}

}
