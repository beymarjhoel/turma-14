package lista4;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {

		int contador, maior = 0;
		Random r = new Random();

		int vetor[] = new int[5];

		System.out.print("Valores de pontuação: ");
		for (contador = 0; contador < 5; contador++) {
			vetor[contador] = r.nextInt(100) + 1;
			System.out.print("[" + vetor[contador] + "] ");
			if (vetor[contador] > maior) {
				maior = vetor[contador];
			}
		}

		System.out.print("\n\nO maior pontuação é: " + maior);

	}

}
