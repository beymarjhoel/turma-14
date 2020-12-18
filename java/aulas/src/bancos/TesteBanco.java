package bancos;

import java.util.Scanner;

public class TesteBanco {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char op;//visivel em todo o programa - escopo
		char saida;
		int numeroConta=0; //escopo global
		
		System.out.println("BANCO DO ED!!!");
		do {
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			
			if (op == '1') {
			
				System.out.println("1 - Conta Poupan�a");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua op��o: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta) {
					case '1':
						System.out.println("Digite a data de aniversario da conta: ");
						int dataAniversario = leia.nextInt();
						ContaPoupanca poupanca = new ContaPoupanca(numeroConta,cpfConta,dataAniversario);
						System.out.println("Conta Poupan�a criada com sucesso!\n");
						
						System.out.print("\n[1] - Cr�dito\n[2] - D�bito\n[3] - Sair\n");
						
						
						
						
					break;
					
					case '2':
						ContaCorrente corrente = new ContaCorrente(numeroConta,cpfConta);
						System.out.println("Conta Corrente criada com sucesso!\n");
					break;
					
					case '3':
						ContaEspecial especial = new ContaEspecial(numeroConta,10000,10000);
						System.out.println("Conta Especial criada com sucesso!\n");
					break;
					
					case '4':
						ContaEmpresa empresa = new ContaEmpresa(numeroConta,cpfConta, 10000);	//10.000 emprestimo
						System.out.println("Conta Empresa criada com sucesso!\n");
					break;
				
					case '5':
						ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta,10000,10000);
						System.out.println("Conta Universit�ria criada com sucesso!\n");
					break;
					
				}
				
			} else if (op == '2') {
				System.out.println("wip");
			} else {
				
			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			
			if (saida == 'N') {
				break;
			}
		
		} while(true);
				
	}
}