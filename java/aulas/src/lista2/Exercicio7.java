package lista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		double altura, base, area = 0;

		System.out.print("Digite o valor da base do tri�ngulo: ");
		base = scan.nextDouble();
		System.out.print("Digite o valor da altura do tri�ngulo: ");
		altura = scan.nextDouble();
		scan.close();
		if (base > 0 && altura > 0) {
			area = (base * altura) / 2;
		}

		System.out.println("A �rea do tri�ngulo �: " + Math.round(area));
	}

}
