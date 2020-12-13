package banco;

import java.util.Random;

import java.util.Scanner;

public class BancoG4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

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
							"Vinicius Alves Miranda"};
		
		char genero[] =   { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M',
							'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F','M' };
		
		int[] conta = new int[40];
		int[] tipoConta = new int[40];
		double[] saldoConta = new double[40];
		double[] movimento = new double[10];
		char[] tipoMovimento = new char[10];
		int opcaoMenuPrincipal;		
		int numeroConta;
		//crei
		int escolha;
		int opcaoEmpresa;
		int movimentos;
		double valor;
		char metodo;
		char opcao;
		
		inicializaVetor(conta, tipoConta, saldoConta);
		
		
		
		criarLinha(50, "▬");
		System.out.print("█	            BANCO DIGITAL G&	         █\n");
		criarLinha(50, "▬");
		
		System.out.print("SOLICITAR O NÚMERO DA CONTA: ");
		numeroConta = leia.nextInt();
		
		System.out.print("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬ MENU INICIAL ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n\n");
		System.out.print("[1] - MOVIMENTAÇÃO\n");
		System.out.print("[2] - SALDO\n");
		System.out.print("[3] - SAIR\n");
		opcaoEmpresa = leia.nextInt();

		
		for(movimentos = 10; movimentos > 1; movimentos--) {
			
			switch(opcaoEmpresa) {
				
				case 1:
					System.out.print(movimentos + ": MOVIMENTOS PERMITIDOS.");
					System.out.print("QUAL O VALOR DO MOVIMENTO: R$: ");
					valor = leia.nextDouble();
					System.out.print("CRÉDITO [C] | DÉBITO [D]: ");
					metodo = leia.next().toUpperCase().charAt(0);
					
					if(metodo == 'C') {
						
					} else if(metodo == 'D') {
						
					} else {
						System.out.print("ERRO");	
					}
					
					System.out.print("Deseja continuar? [S] ou [N]: ");
					opcao = leia.next().toUpperCase().charAt(0);
					
				break;
					
				case 2:
					
				break;
				
				
			}//fim switch
			
		
		}//fim do for
		
		
			
		
		
	}// FIM MAIN
	
	public static void criarLinha(int tamanho, String simbolo) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}
	
	
	public static void inicializaVetor(int[] conta, int[] tipoConta, double[] saldoConta) {
		Random sorteia = new Random();
		for (int x = 0; x < 10; x++) {
			conta[x] = (x + 1);
			tipoConta[x] = sorteia.nextInt(4) + 1;
			saldoConta[x] = 0.0;
		}
	
		/*TABELA DE CONTAS
		 
		[1] - Conta Poupança
		[2] - Conta Corrente
		[3] - Conta Especial
		[4] - Conta Empresa
		 */
	}
}