package exemplos;

import java.util.Scanner;

public class ExemploVetor {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		String times[] = {"Corinthians","Palmeiras","Santos","SPFC"};
		int pontos[] = new int[4];
		
		for(int contador = 0; contador < 4; contador++) {
			//System.out.printf("Rodada %d do campeonato\n", (contador+1));
			System.out.printf("Time: %s \n", times[contador]);
			System.out.print("Quantos pontos 3/1/0: ");
			pontos[contador] = scan.nextInt();
		}
		System.out.println("Resultado da rodada\n");
		for(int kc = 0; kc < 4; kc++) {
			if(pontos[kc] <= 1 ) {
				System.out.printf("Time %s tem %d ponto\n",times[kc],pontos[kc]);
			} else {
				System.out.printf("Time %s tem %d pontos\n",times[kc],pontos[kc]);
			}
			
		}
		
	}
}
