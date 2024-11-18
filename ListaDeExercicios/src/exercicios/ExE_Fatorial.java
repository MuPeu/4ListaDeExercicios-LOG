package exercicios;

import java.util.Scanner;

public class ExE_Fatorial {

	public static void main(String[] args) {
		//Declaração de Variaveis
		int i, r, s;
		int A[] = new int[5];
		int B[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite os 15 números:");
		
		for(i=0; i<5; i++) {
			A[i] = sc.nextInt();
			
		}
		
		//Processamento e Saída
		System.out.println("\nAqui estão os faroriais dos números:");
		
		for(i=0; i<5; i++) {
			B[i] = A[i];
			r = A[i];
			r--;
			for(s=r; s>1; s--) {
				B[i]*=s;
			}
			System.out.println(A[i] + " - " + B[i]);
			
		}
		sc.close();

	}

}
