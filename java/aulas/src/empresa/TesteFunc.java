package empresa;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TesteFunc {
	
	public static void main(String args[]) {
		//INSTANCIAÇÃO COMPLETA DE UM OBJETO
		Scanner scan = new Scanner(System.in);
		//USAR UMA INTERFACE, Lista do tipo funcionario, list é uma interface, arraylist simula um VETOR
		List<Funcionario> lista = new ArrayList<>();	//VETOR ARRAYLIST
		System.out.print("QUANTOS FUNCIONARIOS VOCÊ VAI CADASTRAR? ");
		int qtde = scan.nextInt();
		
		for(int contador = 1; contador <= qtde; contador++) {
			System.out.printf("FUNCIONÁRIO %d - DIGITE OS DADOS:\n", contador);
			System.out.println("TERCEIRO [S] OU [N]? ");
			char op = scan.next().toUpperCase().charAt(0);	//VARIAVEL
			System.out.print("DIGITE O NOME: ");
			String nome = scan.next();	//nextLine() COMPLETO
			System.out.print("HORAS MENSAIS: ");
			int horas = scan.nextInt();						//VARIAVEL
			System.out.print("VALOR HORA: ");
			double valor = scan.nextDouble();				//VARIAVEL
			//VAI TRATAR COMO FUNCIONARIO, E VAI TRABALHAR COMO TERCEIRO
			if (op == 'S') {
				System.out.print("DIGITE O ADICIONAL DO TERCEIRO: ");
				double adicional = scan.nextDouble();
				
				lista.add(new Terceiro(nome,horas,valor,adicional)); //JÁ DISSE Q ERA FUNCIONARIO LÁ EM CIMA <>
			} else {
				//O TIPO FUNCIONARIO N TEM VALOR ADICIONAL
				lista.add(new Funcionario(nome,horas,valor));	
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		//PARA EXIBIR NA TELA
		//LISTA É DO TIPO FUNCIONARIO
		for(Funcionario func : lista) {//ESTOU VARRENDO A LISTA INTEIRA, FALA O TIPO, DA UM NOME, E DIZER O NOME DA LISTA
			System.out.println(func.getNome() + " - " + func.getHorasMensais() + " - " + func.getValorHora() + " - SALÁRIO: " + func.pagamentoSalario());
		}
		
		/*
		Funcionario normal = new Funcionario("João", 44, 10.00);
		Terceiro folguista = new Terceiro("Maria", 20, 10.00, 50.25);
		
		System.out.printf("O funcionario %s recebe o salário: %.2f\n", normal.getNome(), normal.getSalario());
		System.out.printf("O funcionario %s recebe o salário: %.2f\n", folguista.getNome(), folguista.getSalario());
		*/
		
	}
}