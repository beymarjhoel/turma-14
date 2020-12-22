package herancaEncapsulamento;

import java.util.Scanner;

public class TesteEmpregado {

	public static void main(String args[]) {

		String nome, endereco, telefone;
		int setor;
		double salarioBase, impostos;

		Scanner scan = new Scanner(System.in);
		Empregado e1 = new Empregado();

		System.out.println("------ TESTE DE CADASTRO DO EMPREGADO ------");

		System.out.print("Digite seu nome: ");
		nome = scan.next();
		e1.setNome(nome);

		System.out.print("Digite seu endereço: ");
		scan.nextLine();
		endereco = scan.nextLine();
		e1.setEndereco(endereco);

		System.out.print("Digite seu telefone: ");
		telefone = scan.next();
		e1.setTelefone(telefone);

		System.out.print("Digite seu setor de " + e1.getNome() + ": ");
		setor = scan.nextInt();
		e1.setCodigoSetor(setor);

		System.out.print("Digite o salário base de " + e1.getNome() + ": R$");
		salarioBase = scan.nextDouble();
		e1.setSalarioBase(salarioBase);

		System.out.print("Digite o valor dos impostos(%): ");
		impostos = scan.nextDouble();
		e1.setImposto(impostos);

		System.out.println("\n-----------------------------------------------------------\n");

		System.out.println("------ DADOS DO EMPREGADO ------");
		System.out.println("Nome: " + e1.getNome());
		System.out.println("Endereço: " + e1.getEndereco());
		System.out.println("Telefone: " + e1.getTelefone());
		System.out.println("Setor: " + e1.getCodigoSetor());
		System.out.println("Salário final: R$" + e1.calcularSalario(e1.getSalarioBase(), e1.getImposto()));

	}

}