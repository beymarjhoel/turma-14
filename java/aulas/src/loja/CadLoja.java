package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String codigos[] = new String[10];
		String produtos[] = new String[10];
		double precoUnitarios[] = new double[10];
		int estoque[] = new int[10];
		
		char generoCliente;
		char opcaoMenu, opcao;
		String nomeCliente;
		
		do { 
			inseriLinha(80, "▬");
			
			System.out.println("\t\t\t        DRAGON PLATINUM");
			System.out.println("\t\t\t    [Juntos jogamos melhor]");
			inseriLinha(80, "▬");
			pula();
	
			System.out.println("[1] - Comprar Produtos");
			System.out.println("[2] - Gerenciar Estoques");
			System.out.println("[3] - Sair");
			pula();
			System.out.print("Digite a opção: ");
			opcaoMenu = scan.next().charAt(0);
			pula();
			
			switch(opcaoMenu) {
				case '1':
					inseriLinha(80, "▬");
					System.out.println("Dragon Platinum");
					inseriLinha(80, "▬");
					System.out.print("Nome do cliente: ");
					nomeCliente = scan.next().toUpperCase();
					System.out.print("Gênero do cliente [M] Masculino [F] Feminino [O] Outro: ");
					generoCliente = scan.next().toUpperCase().charAt(0);
				
					if(voltaGenero(generoCliente) == "Masculino") {
						pula();
						System.out.printf("Seja bem vindo a loja %s!",nomeCliente);
						pula();
						System.out.print("Deseja continuar ? [S/N]: ");
						opcao = scan.next().toUpperCase().charAt(0);
						
						
					} else if (voltaGenero(generoCliente) == "Feminino") {
						pula();
						System.out.printf("Seja bem vinda a loja %s!",nomeCliente);
						do {
							System.out.print("Deseja continuar ? [S/N]: ");
							opcao = scan.next().toUpperCase().charAt(0);
						} while(opcao == 'S');
					} else if (voltaGenero(generoCliente) == "Outros") {
						pula();
						System.out.printf("Seja bem vindx a loja %s!",nomeCliente);
						do {
							System.out.print("Deseja continuar ? [S/N]: ");
							opcao = scan.next().toUpperCase().charAt(0);
						} while(opcao == 'S');
					}
					
				break;
				
				case '2':
					pula();
					System.out.println("WIP");	//Work in progress
				break;
				
				case '3':
					pula();
					System.out.println("Obrigado por visitar a nossa loja, adoramos sua visita!");
				break;
			}
			
		} while(opcaoMenu != '3');
	
	
	
	
	
	
	
	
	
	
	}
	
	public static String voltaGenero(char generoCliente) {

		String tipo;
		if (generoCliente == 'M') {
			tipo = "Masculino";
		} else if (generoCliente == 'F') {
			tipo = "Feminino";
		} else if (generoCliente == 'O') {
			tipo = "Outros";
		} else {
			tipo = "N/D"; // sem dados
		}

		return tipo;
	}

	public static void pula() {
		System.out.print("\n");
	}

	public static void inseriLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}
}

