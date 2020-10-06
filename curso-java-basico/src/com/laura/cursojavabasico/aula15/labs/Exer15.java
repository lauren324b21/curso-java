package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o LADO1 do tri�ngulo: ");
		double l1 = sc.nextDouble();

		System.out.println("Informe o LADO2 do tri�ngulo: ");
		double l2 = sc.nextDouble();

		System.out.println("Informe o LADO3 do tri�ngulo: ");
		double l3 = sc.nextDouble();
		
		if(((l1 + l2) > l3) || 
				((l1+l3) > l2 || 
				((l2 + l3) > l1))) {
			
			if( l1 == l2 && l2 == l3 && l3 == l1) {
				System.out.println("Tri�ngulo �quil�tero");
				
			} else if (l1 == l2 || l2 == l3 || l3 == l1) {
				System.out.println("Tri�ngulo Is�celes");
				
			} else if (l1 != l2 && l2!= l3 && l3 != l1) {
				System.out.println("Tri�ngulo Escaleno");
			}
			
		} else {
			System.out.println("N�o � um tri�ngulo");
		}


	}

}
