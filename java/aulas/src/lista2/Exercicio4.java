package condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		linha();
		pula();
		System.out.print(imparPar(numero));
		pula();
		System.out.print(positivoOuNegativo(numero));
		scan.close();
	}
	// String imparPar() é a função que será devolvida e int numero é variável que
	// vem para parametro

	public static String positivoOuNegativo(int numero) {
		String maisOuMenos;
		if (numero >= 0) {
			maisOuMenos = "Número positivo";
		} else {
			maisOuMenos = "Número negativo";
		}

		return maisOuMenos;
	}

	public static String imparPar(int numero) {

		String tipo;
		if (numero % 2 == 0) {
			tipo = "É par!";
		} else {
			tipo = "É ímpar!";
		}

		return tipo;
	}

	// se é void é sem retorno e não precisa de parametros
	public static void pula() {
		System.out.println("\n");
	}

	public static void linha() {
		System.out.println(
				"=======================================================================================================");
	}
}