package exercicios;

import java.util.Scanner;

public class ExB_Multiplicacao {

	public static void main(String[] args) {
		//Declaração de Variaveis
		int i;
		int A[] = new int[8];
		int B[] = new int[8];
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite os 8 números:");
		
		for(i=0; i<8; i++) {
			A[i] = sc.nextInt();
			
		}
		
		//Processamento e Saída
		System.out.println("\nEste são os mesmos números, mutiplicados por 3:");
		
		for(i=0; i<8; i++) {
			B[i] = A[i] * 3;
			System.out.println("- " + B[i]);
			
		}
		sc.close();
		
	}

}