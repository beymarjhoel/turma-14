package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int numero[] = new int[4];
		int quadrado[] = new int[4];
		int kc;

		for (kc = 0; kc < 4; kc++) {
			System.out.print("Digite o " + (kc + 1) + "º número: ");
			numero[kc] = scan.nextInt();
		}

		for (kc = 0; kc < 4; kc++) {
			quadrado[kc] = numero[kc] * numero[kc];
		}
		linha();
		if (quadrado[2] >= 1000) {
			System.out.println("\nO valor de [" + numero[2] + "] ao quadrado é: " + quadrado[2]);
		} else {
			for (kc = 0; kc < 4; kc++) {
				System.out.print("\n" + (kc + 1) + "º Número é [" + numero[kc] + "] e seu quadrado é: " + quadrado[kc]);
			}
		}

	}

	public static void linha() {
		System.out.println(
				"\n=======================================================================================================");
	}

}
