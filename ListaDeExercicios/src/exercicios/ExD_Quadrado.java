package exercicios;

import java.util.Scanner;

public class ExD_Quadrado {

	public static void main(String[] args) {
		//Declaração de Variaveis
				int i;
				int A[] = new int[15];
				int B[] = new int[15];
				Scanner sc = new Scanner(System.in);
				
				//Entrada
				System.out.println("Digite os 15 números:");
				
				for(i=0; i<15; i++) {
					A[i] = sc.nextInt();
					
				}
				
				//Processamento e Saída
				System.out.println("\nAqui estão os números ao quadrado:");
				
				for(i=0; i<15; i++) {
					B[i] = A[i] * A[i];
					System.out.println(A[i] + " - " + B[i]);
					
				}
				sc.close();

	}

}
