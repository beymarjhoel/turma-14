package lista5;

import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		Random sorteia = new Random();
		
		int vetor[] = new int[3];
		int matriz[][] = new int[3][3];
		int contador;
		int linha, coluna;
		
		
		System.out.println("VETOR: ");
		for(contador = 0; contador < 3; contador++) {
			vetor[contador] = sorteia.nextInt(3 - 1 + 1) + 1;
			System.out.print("[" + vetor[contador] + "] ");
		}
		
		System.out.print("\n------------------------------------------------------------\n");
		
		System.out.println("MATRIZ: ");
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = sorteia.nextInt(5 - 1) + 1;
				System.out.print("[" + matriz[linha][coluna] + "] ");
			}
			System.out.print("\n");
		}
		
		System.out.print("------------------------------------------------------------\n");
		
		System.out.println("MATRIZ ATUAL: ");
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = matriz[linha][coluna] * vetor[linha]; 
				System.out.print("[" + matriz[linha][coluna] + "] ");
			}
			System.out.print("\n");
		}
		
			
		
		
	}
	
}
