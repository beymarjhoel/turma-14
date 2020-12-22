package herancaEncapsulamento;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String args[]) {
		
		String nome, endereco, telefone;
		double valorVendas, comissao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------ TESTE DE CADASTRO VENDEDOR ------");
		System.out.print("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.print("Digite seu endereço: ");
		endereco = scan.nextLine();
		System.out.print("Digite seu telefone: ");
		telefone = scan.nextLine();
		System.out.print("Digite seu valor de vendas: ");
		valorVendas = scan.nextDouble();
		System.out.print("Digite seu valor de comissão(%): ");
		comissao = scan.nextDouble();
		
		Operario o1 = new Operario(nome, endereco, telefone, valorVendas, comissao);
		System.out.println("\n-----------------------------------------------------------\n");
		
		System.out.println("------ DADOS DO VENDEDOR ------");
		System.out.println("Nome: " + o1.getNome());
		System.out.println("Endereço: " + o1.getEndereco());
		System.out.println("Telefone: " + o1.getTelefone());
		
		System.out.println("Salário: " + o1.calculoSalario(valorVendas, comissao));
		
	}
	
}
