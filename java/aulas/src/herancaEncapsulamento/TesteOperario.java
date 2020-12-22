package herancaEncapsulamento;

import java.util.Scanner;

public class TesteOperario {
	
	public static void main(String args[]) {
		
		String nome, endereco, telefone;
		double valorProducao, comissao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------ TESTE DE CADASTRO OPERÁRIO ------");
		System.out.print("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.print("Digite seu endereço: ");
		endereco = scan.nextLine();
		System.out.print("Digite seu telefone: ");
		telefone = scan.nextLine();
		System.out.print("Digite seu valor de produção: ");
		valorProducao = scan.nextDouble();
		System.out.print("Digite seu valor de comissão(%): ");
		comissao = scan.nextDouble();
		
		Operario o1 = new Operario(nome, endereco, telefone, valorProducao, comissao);
		System.out.println("\n-----------------------------------------------------------\n");
		
		System.out.println("------ DADOS DO OPERÁRIO ------");
		System.out.println("Nome: " + o1.getNome());
		System.out.println("Endereço: " + o1.getEndereco());
		System.out.println("Telefone: " + o1.getTelefone());
		System.out.println("Salário: " + o1.calculoSalario(valorProducao, comissao));
	}
	
}
