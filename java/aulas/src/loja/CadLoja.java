package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char generoCliente;
		char opcaoMenu;
		String nomeCliente;
		
		criarDetalhe();
		System.out.println("Dungeons & Gincanas");
		System.out.println("[SLOGAN LEGAL]");
		criarDetalhe();
		pulaLinha();
		//Menu Principal
		System.out.println("[1] - Comprar Produtos");
		System.out.println("[2] - Gerenciar Estoques");
		System.out.println("[3] - Sair");
		System.out.println("Digite a opção: ");
		opcaoMenu = scan.next().charAt(0);
		
		switch(opcaoMenu) {
			case '1':
				System.out.println("Digite o nome do cliente: ");
				nomeCliente = scan.next().toUpperCase();	//por o nome dele em maiusculo o 1 nome
				System.out.println("Você se define como [M] Masculino - [F] - Feminino - [O] - Outro");
				generoCliente = scan.next().toUpperCase().charAt(0);
			
				if(voltaGenero(generoCliente) == "Masculino") {
					System.out.printf("Seja bem vindo a loja Sr %s!",nomeCliente);
				}
				
				
			break;
			
			case '2':
				System.out.println("WIP");	//Work in progress
			break;
			
			case '3':
				System.out.println("Obrigado por visitar a loja, adoramos sua visita!");
			break;
		}
	}

		
	public static String voltaGenero(char generoCliente) {
	
		String tipo;
		if(generoCliente == 'M') {
			tipo = "Masculino";
		} else if(generoCliente == 'F') {
			tipo = "Feminino";
		} else if(generoCliente == 'O') {
			tipo = "Outros";
		} else {
			tipo = "N/D"; //sem dados
		}
		
		return tipo;
	}
	
	public static void pulaLinha() {
		System.out.println("\n");
	}
	
	public static void criarDetalhe() {
		System.out.println("-----");
	}
}
