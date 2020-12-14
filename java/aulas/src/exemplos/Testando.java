package exemplos;

import java.util.Random;
import java.util.Scanner;

public class Testando {

	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIAVEIS

		String cliente[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
							 "Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
							 "Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
							 "Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
							 "FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco José Pires", "Gabriel Enrique Cabral Silva",
							 "Gabriel Sérgio Nascimento Santos Gonçalves", "Gideão da Silva Idelfonso", "GILSON AMORIM DE MATOS",
							 "Guilherme Gonçalves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
							 "Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
							 "José Jorge Hauck Júnior", "Juliana Santos André", "Kélven Cleiton de Araújo Brandão",
							 "Laís Lima Santos", "Lucas anseloni barros", "Lucas Gonçalves da SIlva", "luis felipe da silva",
							 "Luiz Felipe da Silva Magalhães", "Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima",
							 "Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Verônica Navarro Almenara",
							 "Vinicius Alves Miranda" };

		char genero[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M',
						  'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F','M' };
		
		int[] conta = new int[40];
		int[] tipoConta = new int[40];
		double[] saldoConta = new double[40];
		double[] movimento = new double[10];
		char[] tipoMovimento = new char[10];
		
		int opcaoMenuPrincipal;
		int numeroConta = 0;
		int encontra = 0;
		int escolha = 0, clienteLocalizado;
		int contador = 0;
		int quantidadeMovimentacao = 4;// QUANTIDADE DE MOVIMENTAÇÕES MAXIMAS
		char opcao = 'S';// opcao
		char opcaoTipo;
		int movimentacaoDisponivel = 0;
		//VARIAVEIS VERONICA
		int[] talao = new int[40];
		int talaoCheque=0;
		char opcaoTalao;
		//variavel beymar
		char opcaoEmpresa;
		double emprestimo[] = new double[10];
		double saldoEmprestimo = 0;
	
		Scanner leia = new Scanner(System.in);

		inicializaVetor(conta, tipoConta, saldoConta,talao);

		System.out.print("DIGITE O NÚMERO DA CONTA: ");
		clienteLocalizado = leia.nextInt();

		for (int x = 0; x < 40; x++) {
			if (clienteLocalizado == conta[x]) {
				escolha = x; // fazer essa obs
				encontra = 1;
			}
		}

		if (encontra == 0) {
			System.out.print("Cliente não localizado.");
		} else {

			// System.out.print("Gênero que se identifica: [M]Masculino - [F]Feminino -
			// [O]Outros: ");
			// genero = leia.next().toUpperCase().charAt(0);

			if (genero[escolha] == 'M') {
				System.out.println("Seja bem-vindo ao G4 Bank Sr. " + cliente[escolha] + " :)");
			} else if (genero[escolha] == 'F') {
				System.out.println("Seja bem-vinda ao G4 Bank Sra. " + cliente[escolha] + " :)");
			} else {
				System.out.println("Seja bem-vindx ao G4 Bank Srx. " + cliente[escolha] + " :)");
			}
		}

		
		while (encontra == 1) {
			
			if (tipoConta[escolha] == 1) {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\t TIPO:CONTA POUPANÇA");
				/// JJ SUA PARTE VAI AQUI !! 
			} else if (tipoConta[escolha] == 2) {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA CORRENTE");
			} else if (tipoConta[escolha] == 3) {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA ESPECIAL");
			} else if (tipoConta[escolha] == 4) {
				System.out.println("NÚMERO DA CONTA: " + clienteLocalizado + "\tTIPO:CONTA EMPRESARIAL");
			}

			do {
				System.out.print("------------------------------------------\n");
				System.out.print("█	     BANCO DIGITAL G&4		 █\n");
				System.out.print("------------------------------------------\n");
				System.out.print("\n-------------- MENU INICIAL --------------\n\n");
				System.out.print("[1] - MOVIMENTAÇÃO\n");
				System.out.print("[2] - SALDO\n");
				System.out.print("[3] - SAIR\n");
				System.out.print("\nOpção: ");
				opcaoMenuPrincipal = leia.nextInt();

		
				if (opcaoMenuPrincipal == 1) {

					do {

						movimentacaoDisponivel = quantidadeMovimentacao - contador;

						if (movimentacaoDisponivel > 0) {
							
							System.out.printf("\nVocê possui %d transações disponiveis", movimentacaoDisponivel);
							System.out.println();
							System.out.printf("\nO que você deseja fazer: [D]-Débito, [C]-Crédito ou [S]-Sair");
							System.out.print("\nOpção: ");
							opcaoTipo = leia.next().toUpperCase().charAt(0);
							
							if (opcaoTipo == 'D') {
								System.out.print("\nInforme quanto gostaria debitar:  R$ ");
								movimento[contador] = leia.nextDouble();


								if (tipoConta[escolha] == 1) { /// JJ - POUPANCA - PRONTO
									
									if (movimento[contador] <= saldoConta[escolha]) {
										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'D';
										contador++;
										System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);

										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}
									} else {
										
										System.out.printf("Saldo insuficiente. Selecione nova opção.");
									}
								} else if (tipoConta[escolha] == 2) { // VERONICA - CORRENTE 
									if (movimento[contador] <= saldoConta[escolha]) {
										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'D';
										contador++;
										System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);

										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}
									} else {
										/// PARTE INDIVIDUAL VERONICA 
										System.out.printf("Saldo insuficiente.\n");
										
										if(talao[escolha] > 0){
											System.out.printf("Você tem %d talão(ões) de cheque disponível(is).", talao[escolha]);
											System.out.println("\nVocê realmente deseja emitir um novo talão de cheque? (S)Sim - (N)Não: ");
											opcaoTalao = leia.next().toUpperCase().charAt(0);
							
											if(opcaoTalao == 'S'){
												talaoCheque++;
												talao[escolha]--;
												contador++;
												System.out.printf("Talão emitido sob o nº %d", talaoCheque);
											}
											else{
												System.out.printf("Talão não emitido");
											}
										}
										else{
											System.out.printf("O limite de talões de cheque por dia foi atingido.");
										}
										
									}
								} else if (tipoConta[escolha] == 3) { // KELVEN - ESPECIAL
									if (movimento[contador] <= saldoConta[escolha]) {
										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
										tipoMovimento[contador] = 'D';
										contador++;
										System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);

										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}
									} else {
										//PARTE INDIVIDUAL KELVEN 
										System.out.printf("Saldo insuficiente. Selecione nova opção.");
									}
								} else { /// BEYMAR - EMPRESARIAL
									
									if (movimento[contador] <= saldoConta[escolha]) {
										saldoConta[escolha] = saldoConta[escolha] - movimento[contador];
										
										tipoMovimento[contador] = 'D';
										contador++;
										System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcao = leia.next().toUpperCase().charAt(0);

										while (opcao != 'S' && opcao != 'N') {
											System.out.println("Por favor digite [S] ou [N]. Tente novamente! ");
											System.out.print("\nOpção: ");
											opcao = leia.next().toUpperCase().charAt(0);
										}
									} else {
										System.out.print("Saldo insuficiente. \n");
										System.out.print("Deseja solicitar um empréstimo [S] ou [N]?"); 
										//System.out.println("\.......? [S]-Sim ou [N]-Não ");
										System.out.print("\nOpção: ");
										opcaoEmpresa = leia.next().toUpperCase().charAt(0);//opcaoEmpresa
										
										if(opcaoEmpresa == 'S' ) {
											System.out.print("Quanto deseja realizar de empréstimo? ");
											emprestimo[escolha] = leia.nextDouble();
											
											if(emprestimo[escolha] <= saldoEmprestimo) {	// 1000 VALOR SALDO EMPRÉSTIMO
												saldoConta[escolha] = saldoConta[escolha] + saldoEmprestimo;//ADIÇÃO DO EMPRESTIMO
												
												System.out.print("Saldo do Empréstimo atual: " + saldoEmprestimo);
												System.out.printf("\n\nSeu novo saldo é de R$ %.2f", saldoConta[escolha]);
											} else {
												System.out.print("Pedido de empréstimo negado!\n");	//VALOR DE EMPRÉSTIMO PASSOU DE 1000
											}
										} else if (opcaoEmpresa == 'N') {
											System.out.print("Saldo do Empréstimo atual: " + saldoEmprestimo);
											System.out.printf("Seu saldo atual é de R$ %.2f", saldoConta[escolha]);
											// FIM SE
										}
										//emp[escolha]=lei....
										//deb =50 , saldo= 0, emp=100
										
									}
								}
								
								
								
					
								
								
							} else if (opcaoTipo == 'C') {
								System.out.print("\nInforme quanto gostaria creditar:  R$ ");
								movimento[contador] = leia.nextDouble();
								
								saldoConta[escolha] = saldoConta[escolha] + movimento[contador];
								System.out.printf("Seu novo saldo é de R$ %.2f", saldoConta[escolha]);
								tipoMovimento[contador] = 'C';
								contador++;
								System.out.println("\nDeseja Continuar? [S]-Sim ou [N]-Não ");
								System.out.print("\nOpção: ");
								opcao = leia.next().toUpperCase().charAt(0);

								while (opcao != 'S' && opcao != 'N') {
									System.out.println("Por favor digite [S] ou [N]. Tente novamente!");
									System.out.print("\nOpção: ");
									opcao = leia.next().toUpperCase().charAt(0);
								}
							} else if (opcaoTipo == 'S') {
								System.out.printf("saindo...\n");
								opcao = 'N';
							} else {
								while (opcaoTipo != 'D' && opcaoTipo != 'C' && opcaoTipo != 'S') {
									System.out
											.printf("\nO que você deseja fazer: [D]-Débito , [C]-Crédito OU [S]-Sair");
									System.out.print("\nOpção: ");
									opcaoTipo = leia.next().toUpperCase().charAt(0);
								}
							}

						} else {
							System.out.print("\nVocê não possui transações disponiveis, tente no dia seguinte\n");
							opcao = 'N';
						}

					} while (opcao == 'S');

				}

				else if (opcaoMenuPrincipal == 2) {
					linha(45);
					System.out.printf("\nSeu saldo é de R$ %.2f ", saldoConta[escolha]);
					System.out.println();
					linha(45);

				} else if (opcaoMenuPrincipal == 3) {
					System.out.println("Saindo do App, muito obrigado por utilizar nossos serviços!");
					System.exit(0);
				} else {
					
						System.out.println("Por favor digite uma oção válida. Tente novamente!!\n ");
			
				}

			} while (opcaoMenuPrincipal != 3);

		}

	}// FIM MAIN

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("▬");
		}
		System.out.print("\n");
	}

	public static void inicializaVetor(int[] conta, int[] tipoConta, double[] saldoConta,int[] talao) {
		
		Random sorteia = new Random();

		for (int x = 0; x < 40; x++) {
			conta[x] = (x + 1);
			tipoConta[x] = 2;
			//tipoConta[x] = sorteia.nextInt(4) + 1;
			saldoConta[x] = 0.0;
			talao[x]=3;
		}

		/*
		 * TABELA DE CONTAS
		 * 
		 * [1] - Conta Poupança [2] - Conta Corrente [3] - Conta Especial [4] - Conta
		 * Empresa
		 */
	}

}// FIM DO PROGRAMA