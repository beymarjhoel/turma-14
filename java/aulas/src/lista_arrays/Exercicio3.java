package lista_arrays;

import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		//int numerosMaiorDez[][] = new int[3][3];
		int linha, coluna;
		int maiorDez = 0;
		
		Random r = new Random();
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = r.nextInt(100) + 1;
				if(matriz[linha][coluna] > 10) {
					//numerosMaiorDez[linha][coluna] = matriz[linha][coluna];
					maiorDez = maiorDez + 1;
				}
			}
		}
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.print("[" + matriz[linha][coluna] + "] ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\nNúmeros maiores que 10: \n\n");
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				if(matriz[linha][coluna] > 10) {
					System.out.print("[" + matriz[linha][coluna] + "] ");
				}	
			}
			System.out.print("\n");
		}
		
		System.out.println("\nQuantidade de números maiores que 10: " + maiorDez);
		
		
	}

}
