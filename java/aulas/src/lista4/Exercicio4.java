package lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int TAMANHO = 3;
		int matriz[][] = new int[TAMANHO][TAMANHO];
		int contadorLinha, contadorColuna;
		int totalNumeros = 0, totalDiagonal = 0;

		for (contadorLinha = 0; contadorLinha < TAMANHO; contadorLinha++) {
			for (contadorColuna = 0; contadorColuna < TAMANHO; contadorColuna++) {
				System.out.print("Digite o valor da posição [" + contadorLinha + "][" + contadorColuna + "]: ");
				matriz[contadorLinha][contadorColuna] = scan.nextInt();
				totalNumeros = totalNumeros + matriz[contadorLinha][contadorColuna];
				if (contadorLinha == contadorColuna) {
					totalDiagonal = totalDiagonal + matriz[contadorLinha][contadorColuna];
				}
			}
			System.out.print("\n");
		}

		System.out.print("Matriz Atual: \n");

		for (contadorLinha = 0; contadorLinha < TAMANHO; contadorLinha++) {
			for (contadorColuna = 0; contadorColuna < TAMANHO; contadorColuna++) {
				System.out.print(matriz[contadorLinha][contadorColuna] + " ");
			}
			System.out.print("\n");
		}

		System.out.print("\nTotal de valores é: " + totalNumeros);
		System.out.print("\nTotal da diagonal é: " + totalDiagonal);

	}

}
