package testes;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class Colecoes {

	public static void main(String args[]) {
		
		Collection<String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");
	
		for(String name : nomes) {
			System.out.println("LISTA DE NOMES: " + name);
		}
		
	}
	
}
