package banco;

import java.util.Scanner;

public class BancoG4 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		//linha();
		//System.out.println("		SEJA BEM-VINDO AO SEU BANCO DIGITAL G&4		");
		//linha();
		//pula();
		linha();
		System.out.println("█\tSERVIÇOS DISPONÍVEIS		 █");
		linha();
		System.out.println("\n▬▬▬▬▬▬▬▬▬▬▬▬▬▬ MENU ▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
		System.out.print("[1] - Conta Poupança\n");
		System.out.print("[2] - Conta Corrente\n");
		System.out.print("[3] - Conta Especial\n");
		System.out.print("[4] - Conta Empresa\n");
		System.out.print("[5] - Conta Universitária\n");
		System.out.print("[6] - Sair do banco\n");
		pula();
		System.out.print("Opção: ");
		opcao = scan.nextInt();
	}
	
	
	
	
	
	
	public static void pula() {
		System.out.print("\n");
	}
	
	public static void linha() {
		System.out.print("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
	}
	
}