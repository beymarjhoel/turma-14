package lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random numeroRandomico = new Random();	//objeto
		
		final int VEZES = 10;
		int lancamentos[] = new int[10];
		double media = 0;
		double total = 0;
		int maior = 0;
		int maiorPontuacao = 0;
		
		for(int contador = 0; contador < VEZES; contador++) {
			lancamentos[contador] = numeroRandomico.nextInt(6)+1;
			System.out.printf("Lançamento %d = %d\n", (contador + 1),lancamentos[contador]);
			total = lancamentos[contador] + total;
			if(lancamentos[contador] > maior) {
				maior = lancamentos[contador];
			}
		} 
		
		for(int kc = 0; kc < 10; kc++) {
			if(lancamentos[kc] == maior) {
				maiorPontuacao = maiorPontuacao + 1;
			}
		}
			
		
			//System.out.printf("Valor no random %.0f",Math.random()*6);
		
		
		
		media = total / VEZES;
		
		System.out.printf("\nMédia: %.2f",media);
		System.out.print("\nA maior pontuação é: " + maior);
		System.out.print("\nOcorrências de maior pontuação: " + maiorPontuacao);
	}

}
