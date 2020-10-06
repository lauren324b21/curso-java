package com.laura.cursojavabasico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = sc.nextLine();
		System.out.println("Seu nome completo é: " +nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = sc.next();
		System.out.println("Seu primeiro nome é: " +primeiroNome); 
		
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Sua idade é: " +idade);
		
		System.out.println("Digite a sua altura: ");
	    double altura = sc.nextDouble();
		System.out.println("Sua idade é: " +altura);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
		String primeiroNome1 = sc.next();
		int idade1 = sc.nextInt();
		byte qtdFilhos = sc.nextByte();
		float altura1 = sc.nextFloat();
		boolean temPet = sc.nextBoolean();

		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome1);
		System.out.println("Idade: " + idade1);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura1);
		System.out.println("Tem bichinho de estimação? " + temPet);
	}

}
