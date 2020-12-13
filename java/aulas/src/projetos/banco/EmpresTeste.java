package banco;

import java.util.Scanner;

public class Empresa {

	public static void main() {
		
		Scanner leia = new Scanner(System.in);
		/*
		 * EMPRESA - EMPRESTIMO [1000 - 10000] - PODE PEDI EMPRESTADO O VALOR A QUALQUER TEMPO,
		 * NÃO PODE FICA NEGATIVO. O EMPRESTIMO É SOLICITADO.
		 * O SALDO DO EMPRESTIMO É CORRIGIDO A CADA USO.
		 */
		
		int emprestimo;
		int movimentos;
		int escolha;
		System.out.print("");
		
		System.out.print("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬ MENU INICIAL ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n\n");
		System.out.print("[1] - MOVIMENTAÇÃO\n");
		System.out.print("[2] - SALDO\n");
		System.out.print("[3] - SAIR\n");
		escolha = leia.nextInt();
		
		for(movimentos = 1; movimentos <= 10; movimentos++) {
			
			switch(escolha) {
		
				case 1:
					System.out.print("Movimentos permitidos: " + movimentos);
				break;
		
				case 2:
								
				break;
				
				case 3:
					
				break;
			}
		
		}//fim for
	}
	
}
