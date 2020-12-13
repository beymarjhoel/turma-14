package condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int numero;

		System.out.print("Digite um n�mero: ");
		numero = scan.nextInt();
		linha();
		pula();
		System.out.print(imparPar(numero));
		pula();
		System.out.print(positivoOuNegativo(numero));
		scan.close();
	}
	// String imparPar() � a fun��o que ser� devolvida e int numero � vari�vel que
	// vem para parametro

	public static String positivoOuNegativo(int numero) {
		String maisOuMenos;
		if (numero >= 0) {
			maisOuMenos = "N�mero positivo";
		} else {
			maisOuMenos = "N�mero negativo";
		}

		return maisOuMenos;
	}

	public static String imparPar(int numero) {

		String tipo;
		if (numero % 2 == 0) {
			tipo = "� par!";
		} else {
			tipo = "� �mpar!";
		}

		return tipo;
	}

	// se � void � sem retorno e n�o precisa de parametros
	public static void pula() {
		System.out.println("\n");
	}

	public static void linha() {
		System.out.println(
				"=======================================================================================================");
	}
}