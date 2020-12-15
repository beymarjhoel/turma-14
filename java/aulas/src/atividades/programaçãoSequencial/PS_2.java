package atividades.programaçãoSequencial;

import java.util.Scanner;

public class PS_2 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, totalDias;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em dias: ");
		totalDias = scan.nextInt();
		
		idadeAnos = totalDias / 365;
		totalDias = totalDias % 365;
		idadeMeses = totalDias / 30;
		totalDias = totalDias % 30;
	
		idadeDias = totalDias;
		
		System.out.println("\nAno(s): " + idadeAnos);
		System.out.println("Mês(s): " + idadeMeses);
		System.out.println("Dia(s): " + idadeDias);
		
	}
}
