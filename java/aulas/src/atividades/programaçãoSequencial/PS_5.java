package atividades.programaçãoSequencial;

import java.util.Scanner;

public class PS_5 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, ponderada1 = 2, ponderada2 = 3, ponderada3 = 5, media;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno:  ");
		nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno: ");
		nota3 = scan.nextDouble();
		
		media = ((nota1*ponderada1) + (nota2*ponderada2) + (nota3*ponderada3)) / (ponderada1+ponderada2+ponderada3);
			
		System.out.println("\nA média do aluno é: " + media);
		
	}
	
}
