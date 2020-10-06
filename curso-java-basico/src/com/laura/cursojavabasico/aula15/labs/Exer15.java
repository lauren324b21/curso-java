package com.laura.cursojavabasico.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o LADO1 do triângulo: ");
		double l1 = sc.nextDouble();

		System.out.println("Informe o LADO2 do triângulo: ");
		double l2 = sc.nextDouble();

		System.out.println("Informe o LADO3 do triângulo: ");
		double l3 = sc.nextDouble();
		
		if(((l1 + l2) > l3) || 
				((l1+l3) > l2 || 
				((l2 + l3) > l1))) {
			
			if( l1 == l2 && l2 == l3 && l3 == l1) {
				System.out.println("Triângulo Équilátero");
				
			} else if (l1 == l2 || l2 == l3 || l3 == l1) {
				System.out.println("Triângulo Isóceles");
				
			} else if (l1 != l2 && l2!= l3 && l3 != l1) {
				System.out.println("Triângulo Escaleno");
			}
			
		} else {
			System.out.println("Não é um triângulo");
		}


	}

}
