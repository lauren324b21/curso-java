package com.laura.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exer14 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o tamanho do arquivo, em MB: ");
		double tamArq = sc.nextDouble();
		
		System.out.println("Informe a velocidade da internet, em Mbps: ");
		double velNet = sc.nextDouble();
		
		double tempDownload = tamArq / velNet;
		
		
		System.out.println("O tempo de download é de: " + tempDownload + " minutos");
	}

}
