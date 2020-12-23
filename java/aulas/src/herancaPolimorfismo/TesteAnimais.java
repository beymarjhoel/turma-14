package herancaPolimorfismo;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		char somD, somH, somS, correrD, correrH, subindo;
		
		System.out.println("------ TESTE CADASTRO CACHORRO ------");
		System.out.print("Digite o nome do cachorro: ");
		nome = scan.next();
		System.out.print("Digite a idade do cachorro: ");
		idade = scan.nextInt();
		System.out.print("Cachorro está emitindo som ? [S ou N]: ");
		somD = scan.next().toUpperCase().charAt(0);
		System.out.print("Cachorro está correndo? [S ou N]: ");
		correrD = scan.next().toUpperCase().charAt(0);
		
		Cachorro dog = new Cachorro(nome, idade);
		dog.emitirSom(somD);
		dog.correr(correrD);
		createLines(60,"ꟷ");
		
		System.out.println("------ TESTE CADASTRO CAVALO ------");
		System.out.print("Digite o nome do cavalo: ");
		nome = scan.next();
		System.out.print("Digite a idade do cavalo: ");
		idade = scan.nextInt();
		System.out.print("Cavalo está emitindo som ? [S ou N]: ");
		somH = scan.next().toUpperCase().charAt(0);
		System.out.print("Cavalo está correndo? [S ou N]: ");
		correrH = scan.next().toUpperCase().charAt(0);
		
		Cavalo horse = new Cavalo(nome, idade);
		horse.emitirSom(somH);
		horse.correr(correrH);
		createLines(60,"ꟷ");
		
		System.out.println("------ TESTE CADASTRO PREGUIÇA ------");
		System.out.print("Digite o nome da preguiça: ");
		nome = scan.next();
		System.out.print("Digite a idade da preguiça: ");
		idade = scan.nextInt();
		System.out.print("Preguiça está emitindo som ? [S ou N]: ");
		somS = scan.next().toUpperCase().charAt(0);
		System.out.print("Preguiça está subindo em alguma árvore? [S ou N]: ");
		subindo = scan.next().toUpperCase().charAt(0);
		
		Preguica sloth = new Preguica(nome, idade);
		sloth.emitirSom(somS);
		sloth.subirArvores(subindo);
		createLines(60,"ꟷ");
	
		System.out.println("------ DADOS DOS ANIMAIS ------\n");
		System.out.println("Nome do cachorro: " + dog.getNome());
		System.out.println("Idade do cachorro: " + dog.getIdade());
		System.out.println("Cachorro " + dog.emitirSom(somD));
		System.out.println("Cachorro " + dog.correr(correrD));
		
		System.out.println("\nNome do cavalo: " + horse.getNome());
		System.out.println("Idade do cavalo: " + horse.getIdade());
		System.out.println("Cavalo " + horse.emitirSom(somH));
		System.out.println("Cavalo " + horse.correr(correrH));
		
		System.out.println("\nNome da preguiça: " + sloth.getNome());
		System.out.println("Idade do preguiça: " + sloth.getIdade());
		System.out.println("Preguiça " + sloth.emitirSom(somS));
		System.out.println("Preguiça " + sloth.subirArvores(subindo));
		
		scan.close();
		createLines(60,"ꟷ");
	}
	
	public static void createLines(int lineSize, String type) {
		System.out.println();
		for(int counter = 0; counter <= lineSize; counter++) {
			System.out.print(type);
		}
		System.out.println();
	}
	
}
