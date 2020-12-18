package exemplos;

import java.util.Scanner;

public class TesteDeErro {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int op;
		int vetor[] = new int[3];
		
		try {
			System.out.println("CONTINUA, 1 - SIM, 2 - NÃO OU 3 - TALVEZ: ");
			op = scan.nextInt();
			if(op == 1) {
				System.out.println("VOCÊ ESCOLHEU CONTINUA...");
				
			} else if (op == 2) {
				System.out.println("VOCÊ ESCOLHEU PARAR...");
			} else if(op == 3) {
				System.out.println("TU ESCOLHEU TALVEZ, DAR UMA OLHADA..");
			}
			
			for(int x = 0; x < op; x++) {
				
				System.out.println("SEGUNDA PARTE LOOP numero " + (x+1));
				vetor[x] = x + 1;
				
			}
			
		} catch(java.util.InputMismatchException e) {
			System.out.println("VOCÊ DIGITOU UM TIPO DIFERENTE.. TENTE DENOVO!");
			op = scan.nextInt();
		}
		
		System.out.println("FIM DO PROGRAMA..");
		
		
		
	}
	
}
