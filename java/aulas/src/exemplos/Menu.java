package exemplos;

import java.util.Scanner;

public class Menu {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		//Para - Quando se tinha um tamanho definido.
		//Enquanto - Quando n�o sabe onde para e testa no IN�CIO.
		//Fa�a Enquanto - N�o sabe onde para, mas roda ao menos uma vez e testa no final.
		
		/*
		 * int tamanho;
		 * 
			System.out.println("Digite o tamanho de linhas: ");
			tamanho = scan.nextInt();
		
			for(int indice = 1; indice <= tamanho; indice++) {
			System.out.print("=");
			}
		 */
		
		char opcao;
		
		System.out.print("Come�a o programa? [S] ou [N]: ");
		opcao = scan.next().toUpperCase().charAt(0);
		
		while(opcao == 'S') {
			for(int kc = 0; kc <= 20; kc++) {
				System.out.print("=");
			}
			
			System.out.print("\nSistema de Cadastro\n");
			
			for(int kc = 0; kc <= 20; kc++) {
				System.out.print("=");
			}
			
			System.out.print("\nContinua [S] ou [N]");
			opcao = scan.next().toUpperCase().charAt(0);
		
		}
		
		System.out.println("FIM DO PROGRAMAsS");
	}
	
}
