package exercicios;

import java.util.Scanner;

public class ExC_Subtração {

	public static void main(String[] args) {
		//Declaração de Variaveis
		int i;
		float A[] = new float[20];
		float B[] = new float[20];
		float C[] = new float[20];
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite os 20 primeiros números:");
		
		for(i=0; i<20; i++) {
			A[i] = sc.nextFloat();
			
		}
		
		System.out.println("\nDigite os outros 20 números:");
		
		for(i=0; i<20; i++) {
			B[i] = sc.nextFloat();
			
		}
		
		//Processamento e Saída
		System.out.println("\n\nEstes são os valores decorrentes da subritração do vetor A, com o B: ");
		
		for(i=0; i<20; i++) {
			C[i] = A[i] - B[i];
			System.out.println("- " + (int)C[i]);
			
		} 

	}

}
