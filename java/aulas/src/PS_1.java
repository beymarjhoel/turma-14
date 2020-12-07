/*
 *1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias
 * e mostre-a expressa apenas em dias. 
 */
import java.util.Scanner;

public class PS_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int anos, mes, dias, totalDias = 0;
			
		System.out.println("Digite sua idade(somente em anos): ");
		anos = scan.nextInt();
		System.out.println("Digite a sua idade(somente meses): ");
		mes = scan.nextInt();
		System.out.println("Digite sua idade(somente em dias): ");
		dias = scan.nextInt();
		
		totalDias = totalDias + (anos*365);
		totalDias = totalDias + (mes*30);
		totalDias = totalDias + dias;
		
		System.out.println("O total expresso em dias é: " + totalDias);
	}
}
