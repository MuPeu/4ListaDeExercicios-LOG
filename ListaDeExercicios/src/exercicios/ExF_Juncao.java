package exercicios;

import java.util.Scanner;

public class ExF_Juncao {

	public static void main(String[] args) {
		//Declaração de Variaveis
				int i, r;
				int A[] = new int[15];
				int B[] = new int[15];
				int C[] = new int[30];
				
				Scanner sc = new Scanner(System.in);
				
				//Entrada
				System.out.println("Digite os 15 primeiros números:");
				
				for(i=0; i<15; i++) {
					A[i] = sc.nextInt();
					
				}
				
				System.out.println("\nDigite os outros 15 números:");
				
				for(i=0; i<15; i++) {
					B[i] = sc.nextInt();
					
				}
				
				//Processamento e Saída
				System.out.println("\n\nEste é o vetor decorrentes da junção do vetor A, com o B: ");
				
				for(i=0; i<15; i++) {
					C[i] = A[i];
					System.out.println(C[i]);
				} 
				
				for(i=0; i<15; i++) {
					r = i + 15;
					C[r] = B[i];
					System.out.println(C[r]);
				} 

	}

}
