package lista3;

public class Exercicio_2_Para {

	public static void main(String args[]) {

		int soma = 0;
		int kc;

		for (kc = 1; kc <= 500; kc++) {
			if (kc % 2 != 0 && kc % 3 == 0) {
				soma = soma + kc;
			}
		}

		System.out.print(soma);

	}

}
