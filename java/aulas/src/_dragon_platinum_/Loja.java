package _dragon_platinum_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		String codigoEscolhido;
		char opcao;
		int quantidade, contador;
		
		Scanner scan = new Scanner(System.in);
		List <Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Jogo de Xadrez",  "DGP-001", 40.00, 10));
		produtos.add(new Produto("Jogo de Damas",   "DGP-002", 30.00, 10));
		produtos.add(new Produto("Jogo Cartas Uno", "DGP-003", 10.00, 10));
		produtos.add(new Produto("Quebra-Cabeças",  "DGP-004", 20.00, 10));
		produtos.add(new Produto("Jogo Monopoly",   "DGP-005", 50.00, 10));
		produtos.add(new Produto("Jogo Detetive",   "DGP-006", 80.00, 10));
		produtos.add(new Produto("Jogo Dominó",     "DGP-007", 20.00, 10));
		produtos.add(new Produto("Jogo Enigmas",    "DGP-008", 40.00, 10));
		produtos.add(new Produto("Batalha Naval",   "DGP-009", 80.00, 10));
		produtos.add(new Produto("Jogo de Cartas",  "DGP-010", 10.00, 10));
		
		logo();

		do {
			System.out.print("[1] - COMPRAR PRODUTOS\n[2] - GERENCIAR ESTOQUE\n[3] - SAIR\n\n>_: ");
			opcao = scan.next().charAt(0);

			switch (opcao) {
				case '1':
					System.out.print("\nNome do cliente: ");
					String nome = scan.next();
					System.out.print("Informe seu gênero [M - Masculino | F - Feminino | O - Outro]: ");
					char genero = scan.next().toUpperCase().charAt(0);
						while (genero != 'M' && genero != 'F' && genero != 'O') {
							System.out.print("OPÇÃO INVÁLIDA!\nInforme seu gênero [M - Masculino | F - Feminino | O - Outro]: ");
							genero = scan.next().toUpperCase().charAt(0);
						}
					System.out.print("Informe o ano de nascimento: ");
					int anoNascimento = scan.nextInt();
						while (anoNascimento <= 1899) {		
							System.out.print("OPÇÃO INVÁLIDA!\nInforme o ano de nascimento: ");
							anoNascimento = scan.nextInt();
						}
					System.out.print("Informe seu CPF (xxx.xxx.xxx.xx): ");
					String cpf = scan.next();
						while (cpf.length() != 11) {		
							System.out.print("OPÇÃO INVÁLIDA!\nInforme seu CPF (xxx.xxx.xxx.xx): ");
							cpf = scan.next();
						}
						
					Cliente cliente = new Cliente(nome, genero, anoNascimento, cpf);
					
					System.out.println("\nCADASTRADO REALIZADO COM SUCESSO!\n");
					System.out.printf("Seja muito bem-vind%s a loja %s!\n\n", voltaGenero(genero), nome);
					linha(80,"▬");
					System.out.println("CÓDIGO\t\tPRODUTO\t\t\tPREÇO\t\tQUANTIDADE");
					linha(80,"▬");
					
					for (contador = 0; contador < produtos.size(); contador++) {
						System.out.println(produtos.get(contador).getCodigoProduto() + "\t\t" + 
										   produtos.get(contador).getNomeProduto()   + "\t\t" + 
										   produtos.get(contador).getPrecoUnitario() + "\t\t" +
										   produtos.get(contador).getQuantidadeProdutoEstoque());
					}
					
					linha(80,"▬");
					System.out.print("Digite o código do produto escolhido: ");
					codigoEscolhido = scan.next().toUpperCase();
						
					for (contador = 0; contador < produtos.size(); contador++) {
						if (codigoEscolhido.equals(produtos.get(contador).getCodigoProduto())) {
							System.out.println("Produto escolhido: " + produtos.get(contador).getNomeProduto());
							System.out.print("Selecione a quantidade: ");
							quantidade = scan.nextInt();
								if (quantidade <= 10 && produtos.get(contador).getQuantidadeProdutoEstoque() >= quantidade) {
									if (produtos.get(contador).getQuantidadeProdutoEstoque() > 0) {
										produtos.get(contador).setQuantidadeProdutoEstoque(produtos.get(contador).getQuantidadeProdutoEstoque() - quantidade);
										System.out.println("\nCOMPRA FEITA COM SUCESSO!\n");
									} else if (produtos.get(contador).getQuantidadeProdutoEstoque() <= 0) {
										System.out.println("\nPRODUTO INDISPONÍVEL\n");
									}
								} else {
									System.out.println("\nQUANTIDADE INDISPONÍVEL NO ESTOQUE\n");
						   		}
							
						}
					}
				break;
				
				case '2':
					System.out.println("WIP");
					linha(80,"▬");
					System.out.println("CÓDIGO\t\tPRODUTO\t\t\tPREÇO\t\tQUANTIDADE");
					linha(80,"▬");
					
					for (contador = 0; contador < produtos.size(); contador++) {
						System.out.println(produtos.get(contador).getCodigoProduto() + "\t\t" + 
										   produtos.get(contador).getNomeProduto()   + "\t\t" + 
										   produtos.get(contador).getPrecoUnitario() + "\t\t" +
										   produtos.get(contador).getQuantidadeProdutoEstoque());
					}
					
					linha(80,"▬");
					break;
				
				case '3':
					System.out.println("\nObrigado! Volte sempre!");
					break;
			}
		} while (opcao != '3');

	}

	public static void logo() {
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("★★");
		System.out.println("★★  D R A G O N  P L A T I N U M");
		System.out.println("★★");
		System.out.println("★★ Jogando juntos, todos ganhamos");
		System.out.println("★★");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
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
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.print(simbolo);
		}
		System.out.print("\n");
	}

}
