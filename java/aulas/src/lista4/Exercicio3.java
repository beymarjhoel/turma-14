package lista4;

import java.util.Scanner;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random numeroRandomico = new Random();

		final int LINHA = 4, COLUNA = 6;
		int n1[][] = new int[LINHA][COLUNA];
		int n2[][] = new int[LINHA][COLUNA];
		int m1[][] = new int[LINHA][COLUNA];
		int m2[][] = new int[LINHA][COLUNA];
		int kcLinha, kcColuna;

		System.out.print("Dados N1: \n\n");

		for (kcLinha = 0; kcLinha < LINHA; kcLinha++) {
			for (kcColuna = 0; kcColuna < COLUNA; kcColuna++) {
				n1[kcLinha][kcColuna] = numeroRandomico.nextInt(4 - 3 + 1) + 3;
				System.out.print("[" + n1[kcLinha][kcColuna] + "] ");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		System.out.print("Dados de N2:\n\n");
		for (kcLinha = 0; kcLinha < LINHA; kcLinha++) {
			for (kcColuna = 0; kcColuna < COLUNA; kcColuna++) {
				n2[kcLinha][kcColuna] = numeroRandomico.nextInt(2 - 1 + 1) + 1;
				System.out.print("[" + n2[kcLinha][kcColuna] + "] ");
			}
			System.out.print("\n");
		}

		System.out.print("\n");

		System.out.print("Dados de M1:\n\n");

		for (kcLinha = 0; kcLinha < LINHA; kcLinha++) {
			for (kcColuna = 0; kcColuna < COLUNA; kcColuna++) {
				m1[kcLinha][kcColuna] = n1[kcLinha][kcColuna] + n2[kcLinha][kcColuna];
				System.out.print("[" + m1[kcLinha][kcColuna] + "] ");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		System.out.print("Dados de M2:\n\n");

		for (kcLinha = 0; kcLinha < LINHA; kcLinha++) {
			for (kcColuna = 0; kcColuna < COLUNA; kcColuna++) {
				m2[kcLinha][kcColuna] = n1[kcLinha][kcColuna] - n2[kcLinha][kcColuna];
				System.out.print("[" + m2[kcLinha][kcColuna] + "] ");
			}
			System.out.print("\n");
		}

	}

}
