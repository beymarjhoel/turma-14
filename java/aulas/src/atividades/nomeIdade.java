package atividades;

import java.util.Scanner;

public class nomeIdade {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);//instanciar = criar
		
		String nome;
		int dataNascimento;
		
		System.out.println("Digite o nome do usuário: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		dataNascimento = leia.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + (2020-dataNascimento));
	}
}