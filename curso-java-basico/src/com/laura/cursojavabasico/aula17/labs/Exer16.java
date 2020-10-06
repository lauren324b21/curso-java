package com.laura.cursojavabasico.aula17.labs;

public class Exer16 {

	public static void main(String[] args) {
		
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		do {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);

	} while (proximo <= 500);

}
}