package projetos.loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String codigos[] = new String[10];
		String produtos[] = {"JOGO DE XADREZ","JOGO DE DAMAS","JOGO DE CARTAS UNO","QUEBRA-CEBEÇA","JOGO MONOPOLY","JOGO DETETIVE","JOGO DE DOMINÓ","JOGO DE ENIGMAS","JOGO DE BATALHA NAVAL","JOGO DE BARALHO DE CARTAS"};
		double precoUnitarios[] = {10,10,10,10,10,10,10,10,10,10};
		int estoque[] = new int[10];
		int carrinho[];
		String sacola;
		int aux = 0;
					
		criarLinha(80, "▬");
		System.out.println("\t\t\t\tDRAGON PLATINUM");
		System.out.println("\t\t\t   [Juntos jogamos melhor!]");

		criarLinha(80, "▬");
		System.out.println();

		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		System.out.print("DIGITE A OPÇÃO: ");
		char opcaoMenu = leia.next().charAt(0);
		
		switch (opcaoMenu) {
			case '1': 
				criarLinha(80, "▬");
				System.out.println("\t\t\t\tDRAGON PLATINUM");
				criarLinha(80, "▬");
				
				System.out.print("Por favor informe o seu nome: ");
				String nomeCliente = leia.next().toUpperCase();
				System.out.print("\nVocê de define como [M] - Masculino, [F] - Feminino ou [O] - Outro : ");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("\nSeja bem-vind%s a loja %s!!!\n",voltaGenero(generoCliente),nomeCliente);
				
				criarLinha(80, "▬");
				System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
				criarLinha(80, "▬");
				
				for (int x=0; x<10; x++) {
					
					estoque[x]=10;
					codigos[x]=(x<9)?"DGP-00"+(x+1):"DGP-0"+(x+1);
					System.out.printf("%s\t\t%.2f\t\t  %d\t\t%s\n",codigos[x],precoUnitarios[x],estoque[x],produtos[x]);
					
				}
				criarLinha(80, "▬");
				System.out.print("Insira o código do produto que deseja comprar: ");
				sacola = leia.next();
				
				for(int x = 0; x < 10; x++) {
					if(codigos[x].equals(sacola)) {
						aux = x;
					}
				}
				
				System.out.println("\nProduto escolhido: " + produtos[aux]);
				
			break;
				
			
			case '2':
			
				System.out.println("WIP");  // work in progress
			break;
			
			case '3':
			
				System.out.println("Volte sempre, adoramos sua visita!!!");
			break;
			
				
		}
			
	}
	
	
	
	

	
	public static void criarLinha(int tamanho, String simbolo) {
			for (int i = 0; i < tamanho; i++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}
	
	public static String voltaGenero(char generoCliente) {
		
		String tipo;
		if (generoCliente == 'M')
		{
			tipo = "o";
		}
		else if (generoCliente == 'F')
		{
			tipo = "a";
		}
		else if (generoCliente == 'O')
		{
			tipo = "x";
		}
		else
		{
			tipo = "*";
		}
			
		
		return tipo;
	
	}
	
}