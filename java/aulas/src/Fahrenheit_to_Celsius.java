import java.util.Scanner;

public class Fahrenheit_to_Celsius {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	
		double fahrenheit, res;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fahrenheit = scan.nextDouble();
		
		res = (fahrenheit - 32) * 5/9;
		
		System.out.println("A temperatura em Celsius é: " + Math.round(res) + " ºC");
	}
}
