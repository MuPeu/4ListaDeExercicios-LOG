package exercicios;

import java.util.Scanner;

public class ExA_Nomes {

	public static void main(String[] args) {
		//Declaração de Variaveis
		int i;
		String nomes[] = new String[10];
		Scanner sc = new Scanner (System.in);
		
		//Entrada
		System.out.println("Digite os 10 nomes:");
		
		for (i=0; i<10; i++) {
			System.out.print((i + 1) + "- ");
			nomes[i] = sc.nextLine();
		}
		
		
		//Processamento e Saída
		System.out.println("\nOs nomes são:");
		
		for (i=0; i<10; i++) {
			System.out.println("- " + nomes[i]);
		}
		sc.close();
		
	}

}