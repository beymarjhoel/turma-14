package lista5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String args[]) {

		Scanner leia = new Scanner(System.in);
		
		double vetorReal[] = new double[5];
		int vetorInteiro[] = new int[5];
		int contador;
		int opcao;
		
		for(contador = 0; contador < 5; contador++) {
			System.out.print("Digite o " + (contador + 1) + "º número: ");
			vetorReal[contador] = leia.nextDouble();
		}
		
		System.out.print("\nDigite [1] - Ordem direita\n");
		System.out.print("Digite [2] - Ordem inversa\n");
		System.out.print("Digite [0] - Finalizar programa\n");
		System.out.print("\nDigite opção: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1: 
				for(contador = 0; contador < 5; contador++) {
					System.out.print("[" + vetorReal[contador] + "] ");
				}
		break;
		
		case 2:
				for(contador = 5-1; contador >= 0; contador--) {
					System.out.print("[" + vetorReal[contador] + "] ");
				}
		break;
		
		case 0:
				System.out.print("Fim do programa.\n");
		}
		
		System.out.print("\n----------------------------------------------------------------\n");
		
		for(contador = 0; contador < 5; contador++) {
			System.out.print("Digite o " + (contador + 1) + "º número: ");
			vetorInteiro[contador] = leia.nextInt();	
		}		
		
		System.out.print("\nDigite [1] - Ordem direita\n");
		System.out.print("Digite [2] - Ordem inversa\n");
		System.out.print("Digite [0] - Finalizar programa\n");
		System.out.print("\nDigite opção: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1: 
				for(contador = 0; contador < 5; contador++) {
					System.out.print("[" + vetorInteiro[contador] + "] ");
				}
		break;
		
		case 2:
				for(contador = 5-1; contador >= 0; contador--) {
					System.out.print("[" + vetorInteiro[contador] + "] ");
				}
		break;
		
		case 0:
			System.out.print("Fim do programa.\n");
		}
		

		
	}

}
