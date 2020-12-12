package lista5;

import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {

	public static void main(String args[]) {
		
		Random sorteia = new Random();
		
		int vetor[] = new int[100];
		int contador;
		int ZeroVinteCinco = 0;
		int VinteSeisCinquenta = 0;
		int CinquentaUmSetentaCinco = 0;
		int SetentaSeisCem = 0;
		
		for(contador = 0; contador < 100; contador++) {
			vetor[contador] = sorteia.nextInt(100);
			System.out.print("[" + vetor[contador] + "] ");
			
			if(vetor[contador] < 0) {
				System.out.print("ERRO");
			} else if(vetor[contador] >= 0 && vetor[contador] <= 25) {
				ZeroVinteCinco = ZeroVinteCinco + 1;
			} else if(vetor[contador] >= 26 && vetor[contador] <= 50) {
				VinteSeisCinquenta = VinteSeisCinquenta + 1; 
			} else if(vetor[contador] >= 51 && vetor[contador] <= 75) {
				CinquentaUmSetentaCinco = CinquentaUmSetentaCinco + 1;
			} else if(vetor[contador] >= 76 && vetor[contador] <= 100) {
				SetentaSeisCem = SetentaSeisCem + 1;
			}

		}
		System.out.print("\n\nQuantidade de números entre [0-25]: " + ZeroVinteCinco);
		System.out.print("\nQuantidade de números entre [26-50]: " + VinteSeisCinquenta);
		System.out.print("\nQuantidade de números entre [51-75]: " + CinquentaUmSetentaCinco);
		System.out.print("\nQuantidade de números entre [76-100]: " + SetentaSeisCem);	
			
			
			
		
		
		
	}
	
}
