//this
package bancos;
 
import java.util.Scanner;

public class EmpresaTeste {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		char opcaoEmpresa;
		double emprestimo;
		int numeroConta;
		String cpf;
		char opcaoMovimento = 0;
		
		System.out.println("Bem vindo! \n");
		System.out.print("Digite seu n�mero da conta: ");
		numeroConta = scan.nextInt();
		System.out.print("Digite seu CPF: ");
		cpf = scan.next();
			
		ContaEmpresa cliente = new ContaEmpresa(numeroConta,cpf,10000);	//limite de 10.000
		System.out.println("\nConta Empresa criada com sucesso!\n");
		
			do {	
				System.out.print("\nMENU: \n\n");
				System.out.print("[1] - MOVIMENTO\n");
				System.out.print("[2] - SALDO\n");
				System.out.print("[3] - EMPR�STIMO\n");
				System.out.print("[4] - SAIR\n");
				System.out.print("\nOP��O: ");
				opcaoEmpresa = scan.next().toUpperCase().charAt(0);
				
				switch(opcaoEmpresa) {
					case '1':
						
						System.out.println("\nMovimento do tipo Cr�dito - [C] ou D�bito [D]?");
						System.out.print("Op��o: ");
						opcaoMovimento = scan.next().toUpperCase().charAt(0);
							
						if(opcaoMovimento == 'C') {
							System.out.print("\nDigite o valor do CR�DITO: ");
							double valorCredito = scan.nextDouble();
							cliente.credito(valorCredito);	
							System.out.println("\nSaldo neste momento: R$" + cliente.getSaldo());
							
						} else if (opcaoMovimento == 'D') {
							System.out.print("\nDigite o valor do D�BITO: ");
							double valorDebito = scan.nextDouble();
							cliente.debito(valorDebito);	
							System.out.println("Saldo neste momento: R$" + cliente.getSaldo());
							
						}
					break;
					
					case '2':
						System.out.println("\nSaldo neste momento: R$" + cliente.getSaldo());
					break;
					
					case '3':
						if(cliente.getEmprestimoEmpresa() > 0) {
							System.out.println("Saldo de empr�stimo: R$ " + cliente.getEmprestimoEmpresa());
							System.out.print("Quanto gostaria de usar do seu empr�stimo: R$ ");
							emprestimo = scan.nextDouble();
							
							cliente.pediEmprestimo(emprestimo);
							System.out.println("\nEmpr�stimo aprovado!");
							System.out.println("Saldo do empr�stimo atual: R$" + cliente.getEmprestimoEmpresa());
							System.out.println("\nSaldo neste momento: R$" + cliente.getSaldo() + "\n");
							
						} else {
							System.out.println("\nEmpr�stimo negado..");
						}
						
					break;
					
					case '4':
						System.out.println("\nSaindo..");
					break;
					
					}
						
			} while(opcaoEmpresa != '4');
		
			System.out.println("\nObrigado por utilizar nossos servi�os!");
		
	}
}