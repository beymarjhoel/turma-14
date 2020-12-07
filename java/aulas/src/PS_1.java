import java.util.Scanner;

public class PS_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int tempoAnos, ano, mes, dia;
		
		System.out.println("Digite o ano do seu nascimento: ");
		ano = scan.nextInt();
		System.out.println("Digite o mês do seu nascimento: ");
		mes = scan.nextInt();
		System.out.println("Digite o dia do seu nascimento: ");
		dia = scan.nextInt();
	
		tempoAnos = (ano*365)+(mes*30)+dia;
		
		System.out.println("Você viveu " + tempoAnos + " dias.");
	}
}