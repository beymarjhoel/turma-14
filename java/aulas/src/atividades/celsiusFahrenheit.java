package atividades;

import java.util.Scanner;

public class celsiusFahrenheit {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double celsius, res;
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = scan.nextDouble();
		
		res = (celsius * 9/5) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é: " + Math.round(res) + "ºF");
		
	}
}
