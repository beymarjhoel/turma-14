package bancos;

import java.util.Scanner;

public class BancoTesteReserva {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		char opcaoEmpresa;
		double emprestimo;
		int numeroConta;
		String cpf;
		
		System.out.println("Bem vindo! \n");
		System.out.print("Digite seu n�mero da conta: ");
		numeroConta = scan.nextInt();
		System.out.print("Digite seu CPF: ");
		cpf = scan.next();
			
		ContaEmpresa cliente = new ContaEmpresa(numeroConta,cpf,10000);
		
		do {	
			System.out.print("MENU: \n\n");
			System.out.print("[1] - CR�DITO\n");
			System.out.print("[2] - D�BITO\n");
			System.out.print("[3] - SAIR");
			System.out.print("\n\nOP��O: ");
			opcaoEmpresa = scan.next().toUpperCase().charAt(0);
			
			if (opcaoEmpresa == '1') {
				
				System.out.print("Digite o valor do CR�DITO: R$");
				double valorCredito = scan.nextDouble();
				cliente.credito(valorCredito);	
				System.out.println("Saldo neste momento: R$" + cliente.getSaldo());
				System.out.print("Deseja continuar [S] ou [N]?");
				System.out.print("\n\nOP��O: ");
				opcaoEmpresa = scan.next().toUpperCase().charAt(0);
			
				if (opcaoEmpresa == 'N') {
					break;
				}
				
			} else if (opcaoEmpresa == '2') {
				
				System.out.print("Digite o valor do D�BITO: R$");
				double valorDebito = scan.nextDouble();
				cliente.debito(valorDebito);	
				System.out.println("Saldo neste momento: R$" + cliente.getSaldo());
			
				if (valorDebito > cliente.getSaldo() || cliente.getSaldo() < 0){
					//System.out.println("Saldo do empr�stimo atual: " + cliente.getEmprestimoEmpresa());
					System.out.println("Gostaria de usar seu empr�stimo [S] ou [N]?");
					System.out.print("\n\nOP��O: ");
					opcaoEmpresa = scan.next().toUpperCase().charAt(0);
					
					if (opcaoEmpresa == 'S') {
						System.out.println("Saldo do empr�stimo atual: R$" + cliente.getEmprestimoEmpresa());
						System.out.print("Quanto gostaria de usar do seu empr�stimo: R$");
						emprestimo = scan.nextDouble();
						cliente.pediEmprestimo(emprestimo);
						System.out.println("\nUsou seu empr�stimo!");
						System.out.println("Saldo do empr�stimo atual: R$" + cliente.getEmprestimoEmpresa());
						System.out.println("Saldo neste momento: R$" + cliente.getSaldo());
					
					} else if (opcaoEmpresa == 'N') {
						
						System.out.println("\nN�o usou empr�stimo.");
						//System.out.println("Saldo do empr�stimo atual: " + cliente.getEmprestimoEmpresa());
						System.out.println("Saldo neste momento: R$" + cliente.getSaldo());
						
						System.out.print("Deseja continuar [S] ou [N]?");
						opcaoEmpresa = scan.next().toUpperCase().charAt(0);
					
					}
				}
				
			} else if (opcaoEmpresa == '3') {
				
				System.out.println("\nFim do programa.");
			
			}
		} while(opcaoEmpresa == 'S');
		
		
		System.out.println("\n\nObrigado por utilizar nossos servi�os!");
		
		/*
		System.out.println("Digite o n�mero da conta: ");
		int conta = scan.nextInt();
		System.out.println("Digite o CPF da conta: ");
		String cpf = scan.next();
		System.out.println("Digite a data de anivers�rio da conta: ");
		int data = scan.nextInt();
		
		ContaPoupanca pop1 = new ContaPoupanca(conta,cpf,data);	//teste pedindo pro usuario, POO
		
		/
		//conta abstrata, generaliza��o, generalizo para n�o usar. Trata como Conta, mas � ContaCorrente
		//Conta conta1 = new ContaCorrente(147);
		//ContaPoupanca pop1 = new ContaPoupanca(112,"111.111.111.-11",25); //parametros da ContaPoupanca
		/*
		//Para inserir valor de CR�DITO
		System.out.println("Digite o valor do CR�DITO: ");
		double valorCredito = scan.nextDouble();
		pop1.credito(valorCredito);	//passa a variavel como parametro para o metodo credito
		//para imprimir o saldo.
		System.out.println("Saldo neste momento: " + pop1.getSaldo());
		//para colocar o dinheiro, com atributos private
		//pop1.credito(100);
		
		//Para fazer um d�bito
		System.out.println("Digite o valor do d�bito: ");
		double valorDebito = scan.nextDouble();
		pop1.debito(valorDebito);
		System.out.println("Saldo neste momento: " + pop1.getSaldo());

		
		//QUERO TESTAR CONTA POUPAN�A
		
		ContaPoupanca popp1 = new ContaPoupanca(1,"111",1);
		ContaCorrente corre1 = new ContaCorrente(13);
		ContaEspecial chique1 = new ContaEspecial(10,5000.55);
		
		
		
		System.out.println("\nTESTE1\n");
		System.out.println("Saldo conta poupan�a: " + popp1.getSaldo());
		System.out.println("Saldo da conta corrente: " + corre1.getSaldo());
		System.out.println("Saldo da conta especial: " + chique1.getSaldo()+ " limite atual da conta " + chique1.getValorLimite());
		popp1.credito(1000);	//m�todo � o mesmo, mas o objeto � diferente
		corre1.credito(1000);
		chique1.credito(500);
		
		System.out.println("\nTESTE2\n");
		System.out.println("Saldo conta poupan�a: " + popp1.getSaldo());
		System.out.println("Saldo da conta corrente: " + corre1.getSaldo());
		System.out.println("Saldo da conta especial: " + chique1.getSaldo() + " limite atual da conta " + chique1.getValorLimite());
		
		
		System.out.println("\nTESTE3\n");
		popp1.debito(900);
		corre1.debito(1001);
		chique1.debito(2500);
		System.out.println("Saldo conta poupan�a: " + popp1.getSaldo());
		System.out.println("Saldo da conta corrente: " + corre1.getSaldo());
		System.out.println("Saldo da conta especial: " + chique1.getSaldo() + " limite atual da conta " + chique1.getValorLimite());
		
		
		// n existe setSaldo();
		ContaEmpresa lojaBabi = new ContaEmpresa(500,15000);
		ContaCorrente babi = new ContaCorrente(15);
		
		System.out.println("SALDO ATUAL: " + lojaBabi.getSaldo());
		System.out.println("SALDO ATUAL: " + babi.getSaldo());
		
		lojaBabi.credito(1000);
		babi.credito(500);
		
		System.out.println("SALDO ATUALIZADO: " + lojaBabi.getSaldo());
		lojaBabi.pediEmprestimo(200);
		
		lojaBabi.debito(1200);
		babi.debito(550);
		System.out.println("SALDO ATUALIZADO AP�S PAGAR CONTA DE LUZ: " + lojaBabi.getSaldo());
		System.out.println("VALOR DISPON�VEL AINDA PARA EMPR�STIMO: "  + lojaBabi.getEmprestimoEmpresa());
		System.out.println("SALDO CONTA CORRENTE BABI: " + babi.getSaldo());
	
		*/
	}
}
