package lista3;

import java.util.Scanner;

public class Exercicio_2_Enquanto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.print("Digite um n�mero: ");
		numero = scan.nextInt();
		pula();
		System.out.print("Sequ�ncia: ");
		System.out.print(numero + " ");

		while (numero < 100) {
			numero = numero * 3;
			System.out.print(numero + " ");
		}
		scan.close();
	}

	public static void pula() {
		System.out.print("\n");
	}
}
