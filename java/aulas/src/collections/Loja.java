package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> item = new ArrayList<>();
		
		item.add("Jogo de Xadrez");
		item.add("Jogo de Damas");
		item.add("Jogo de Dominó");
		item.add("Jogo Detetive");
		item.add("Jogo Monopoly");
		
		System.out.println("Itens cadastrados no estoque: " + item);
		
		System.out.println("\nPrimeiro item [" + item.get(0) + "] será removido!");
		item.remove(0);
		
		System.out.println("\nItens do estoque atualizado: " + item);
		
		System.out.println("\nTodos os itens do estoque:\n");
		for(String estoque : item) {
			System.out.println("Item: " + estoque);
		}
		
	}
	
}
