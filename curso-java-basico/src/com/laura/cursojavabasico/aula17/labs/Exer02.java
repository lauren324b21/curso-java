package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean infoValidas = false;
		
		do {
		
		System.out.println("Informe seu nome de usu�rio:");
		String user = sc.nextLine();
		
		System.out.println("Informe sua senha:");
		String senha = sc.nextLine();
		
		if(user.equalsIgnoreCase(senha)) {
			infoValidas = false;
			System.out.println("Usu�rio e senha n�o podem ser iguais. Tente novamente.");
			
		} else {
			infoValidas = true;
			System.out.println("Senha e usu�rio v�lidos.");
			
			
		}
		
	} while(infoValidas == false);
		
		
		
	}

}
