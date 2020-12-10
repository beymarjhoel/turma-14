package loja;

import java.util.Scanner;

public class TesteCadLoja {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char generoCliente;
		char opcaoMenu;
		char op;
		String nomeCliente;
		int kc;
		
		do {
		linha();
		System.out.println("\nDungeons & Gincanas");
		System.out.println("[SLOGAN LEGAL]");
		linha();
		pula();
		//Menu Principal
		System.out.println("[1] - Comprar Produtos");
		System.out.println("[2] - Gerenciar Estoques");
		System.out.println("[3] - Sair");
		pula();
		System.out.print("Digite a opção:► ");
		opcaoMenu = scan.next().charAt(0);
		pula();
		switch(opcaoMenu) {
			case '1':
				linha();
				System.out.println("\nDungeons & Gincanas");
				linha();
				System.out.print("\nNome do cliente: ");
				nomeCliente = scan.next().toUpperCase();	//por o nome dele em maiusculo o 1 nome
				System.out.print("Gênero do cliente [M] Masculino [F] Feminino [O] Outro: ");
				generoCliente = scan.next().toUpperCase().charAt(0);
			
				if(voltaGenero(generoCliente) == "Masculino") {
					pula();
					System.out.printf("Seja bem vindo a loja %s!",nomeCliente);
					System.out.print("\nDeseja continuar [S] ou [N]: ");
					op = scan.next().toUpperCase().charAt(0);
					while ( op != 'S' && op != 'N') {
						System.out.print("\nDeseja continuar [S] ou [N]: ");
						op = scan.next().toUpperCase().charAt(0);
					}
				} else if (voltaGenero(generoCliente) == "Feminino") {
					pula();
					System.out.printf("Seja bem vinda a loja %s!",nomeCliente);
					System.out.print("\nDeseja continuar [S] ou [N]: ");
					op = scan.next().toUpperCase().charAt(0);
					while ( op != 'S' && op != 'N') {
						System.out.print("Deseja continuar [S] ou [N]: ");
						op = scan.next().toUpperCase().charAt(0);
					}
				} else if (voltaGenero(generoCliente) == "Outros") {
					pula();
					System.out.printf("Seja bem vindx a loja %s!",nomeCliente);
					System.out.print("\nDeseja continuar [S] ou [N]: ");
					op = scan.next().toUpperCase().charAt(0);
					while ( op != 'S' && op != 'N') {
						System.out.print("\nDeseja continuar [S] ou [N]: ");
						op = scan.next().toUpperCase().charAt(0);
					}
				}
				
			break;
			
			case '2':
				pula();
				System.out.println("WIP");	//Work in progress
				System.out.print("\nDeseja continuar [S] ou [N]: ");
				op = scan.next().toUpperCase().charAt(0);
			break;
			
			case '3':
				pula();
				System.out.println("Obrigado por visitar a nossa loja, adoramos sua visita!");
				System.out.print("\nDeseja continuar [S] ou [N]: ");
				op = scan.next().toUpperCase().charAt(0);
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

	public static void linha() {
		//System.out.print("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
		int	numeroLinhas = 80;
		
		for(int kc = 1; kc <= numeroLinhas; kc++) {
			System.out.print("▬");
		}
	}

}
