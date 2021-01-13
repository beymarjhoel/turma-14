package projeto_loja;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DragonPlatinum {

	public static void main(String args[]) {
		
		char escolha, genero, confirmacao;
		String nome, codigoProdutoEscolhido, codigo, cpf;
		int anoNascimento;
		
		Scanner scan = new Scanner(System.in);
		List<Produto> estoque = new ArrayList<>();
		
		estoque.add(new Produto("Jogo de Xadrez", "DGP-001", 40.00, 10));
		estoque.add(new Produto("Jogo de Damas", "DGP-002", 30.00, 10));
		estoque.add(new Produto("Jogo Cartas Uno", "DGP-003", 10.00, 10));
		estoque.add(new Produto("Quebra-Cabeças", "DGP-004", 20.00, 10));
		estoque.add(new Produto("Jogo Monopoly", "DGP-005", 50.00, 10));
		estoque.add(new Produto("Jogo Detetive", "DGP-006", 80.00, 10));
		estoque.add(new Produto("Jogo Dominó", "DGP-007", 20.00, 10));
		estoque.add(new Produto("Jogo Enigmas", "DGP-008", 40.00, 10));
		estoque.add(new Produto("Batalha Naval", "DGP-009", 80.00, 10));
		estoque.add(new Produto("Jogo de Cartas", "DGP-010", 10.00, 10));
	
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("★★");
		System.out.println("★★  D R A G O N  P L A T I N U M");
		System.out.println("★★");
		System.out.println("★★ Jogando juntos, todos ganhamos");
		System.out.println("★★");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
	
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.print("\n>_: ");
		escolha = scan.next().charAt(0);
	
		switch(escolha) {
			case '1':
				System.out.print("\nNome do cliente: ");
				nome = scan.next();
				System.out.print("Gênero do cliente [M - Masculino | F - Feminino | O - Outro]: ");
				genero = scan.next().toUpperCase().charAt(0);
					while (genero != 'M' && genero != 'F' && genero != 'O') {
						System.out.print("Opção inválida! Tente de novo [M - Masculino | F - Feminino | O - Outro]: ");
						genero = scan.next().toUpperCase().charAt(0);
					}
				System.out.print("Informe o ano de nascimento: ");
				anoNascimento = scan.nextInt();
					while (anoNascimento <= 1899) {		// 1900+ 
						System.out.print("Opção inválida! Tente de novo, informe o ano de nascimento: ");
						anoNascimento = scan.nextInt();
					}
				System.out.print("Informe seu CPF (xxx.xxx.xxx.xx): ");
				cpf = scan.next();
					while (cpf.length() != 11) {		//11 caracteres
						System.out.print("Opção inválida! Tente de novo, informe seu CPF: ");
						cpf = scan.next();
					}
					
				Cliente cliente = new Cliente(nome, genero, anoNascimento, cpf);
				
				System.out.println("\nCADASTRO REALIZADO COM SUCESSO!!!!\n");	
				System.out.printf("\nSeja muito bem-vind%s a loja %s!\n\n", voltaGenero(genero), nome);
				System.out.println("Produtos:\n");
				System.out.println("CÓDIGO\t\tPRODUTO\t\t\tPREÇO\t\tQUANTIDADE");
				linha(80,"▬");
					for (Produto lista : estoque) {
						System.out.println(lista.getCodigoProduto() + "\t\t" + lista.getNomeProduto() + "\t\t"+ lista.getPrecoUnitario() + "\t\t"+ lista.getQtdeProdutoEstoque());
					}
				linha(80,"▬");
				System.out.print("Digite o código do produto escolhido: ");
				codigoProdutoEscolhido = scan.next().toUpperCase();	
					for (Produto lista : estoque) {
						if (codigoProdutoEscolhido.contains(lista.getCodigoProduto())) {
							System.out.println("Produto escolhido: " + lista.getNomeProduto());
							
						} 
					}	
			break;
			
			case '2': 
				System.out.println("WIP - WORK IN PROGRESS");
			break;
			
			case '3':
				System.out.println("Até mais, volte sempre!");
			break;
		}
	
	}


	public static String voltaGenero(char generoCliente) {
		String tipo;
		
		if (generoCliente == 'M') {
			tipo = "o";
		} else if (generoCliente == 'F') {
			tipo = "a";
		} else if (generoCliente == 'O') {
			tipo = "x";
		} else {
			tipo = "*";
		}
		
		return tipo;
	}
	
	public static void linha(int tamanho, String simbolo) {
		for(int contador = 0; contador < tamanho; contador++) {
			System.out.print(simbolo);
		}
		System.out.print("\n");
	}
	
}
