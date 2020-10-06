package com.laura.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		
		boolean primo = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int num = sc.nextInt();
		
		
		
		for(int i = 1; i <= num; i++) {
			
			primo = true;
			
			for(int j = 2; j < i; j++){
				if(i % j == 0) {
					primo = false;
					
				}
				
				
				
			}
			
			if(primo == true) {
				System.out.println(i);
			
		}
		
		
		}
			
	}

}

