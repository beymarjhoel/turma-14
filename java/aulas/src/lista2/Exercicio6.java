package condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int idade;

		System.out.println("Digite a idade do nadador: ");
		idade = scan.nextInt();

		if (idade >= 1 && idade <= 4) {
			System.out.println("Aguarde um pouco mais para nadar");
		} else if (idade >= 5 && idade <= 7) {
			System.out.println("Categoria: Infantil A");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Categoria: Infantil B");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println("Categoria: Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		} else if (idade >= 18) {
			System.out.println("Categoria: Adulto");
		} else {
			System.out.println("Idade Inválida!");
		}

		scan.close();
	}
}