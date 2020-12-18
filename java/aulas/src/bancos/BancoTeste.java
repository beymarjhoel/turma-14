package bancos;

import java.util.Scanner;

public class BancoTeste {

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
		
	}
}
