package herancaEncapsulamento;

import java.util.Scanner;

public class TesteAdministrador {

	public static void main(String args[]) {
		
		String nome, endereco, telefone;
		double ajudaDeCusto;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------ TESTE DE CADASTRO ADMINISTRADOR ------");
		System.out.print("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.print("Digite seu endereço: ");
		endereco = scan.nextLine();
		System.out.print("Digite seu telefone: ");
		telefone = scan.nextLine();
		System.out.print("Digite o valor da sua ajuda de custo: ");
		ajudaDeCusto = scan.nextDouble();
		
		Administrador a1 = new Administrador(nome, endereco, telefone, ajudaDeCusto);
		System.out.println("\n-----------------------------------------------------------\n");
		
		System.out.println("------ DADOS DO ADMINISTRADOR ------");
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Endereço: " + a1.getEndereco());
		System.out.println("Telefone: " + a1.getTelefone());
		System.out.println("Valor da ajuda de custo: R$" + a1.getAjudaDeCusto());
		
	}
	
}
