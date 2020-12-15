package objetos;

import java.util.Scanner;

public class LojaLoka {

	public static void main(String args[]) {
	
	Scanner leia = new Scanner(System.in);

	Pessoa cliente = new Pessoa();
	
	
	String produto = "vestido";
	int qtde = 10;
	double valorProduto = 100.00;
	
	System.out.println("BOM DIA, DIGITE O SEU NOME: ");
	cliente.nome = leia.next();
	System.out.println("VOCÊ É MASCULINO, FEMININO OU OUTROS: ");
	cliente.genero = leia.next().toUpperCase().charAt(0);
	
	System.out.printf("BOM DIA %s" + cliente.nome);
	System.out.println("PRODUTO DISPONIVEL NO MOMENTO: ");
	System.out.printf("PRODUTO: %s, quantidade %d, valor R$: %.2f", produto,qtde, valorProduto);
	
	
	}
}
