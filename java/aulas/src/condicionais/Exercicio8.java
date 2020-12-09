package condicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numerico;

		System.out.print("Digite um valor númerico: ");
		numerico = scan.nextInt();
		pula();
		scan.close();
		if (numerico > 100) {
			System.out.println(numerico);
		} else {
			numerico = 0;
			System.out.println(numerico);
		}

	}

	public static void pula() {
		System.out.print("\n");
	}

}
