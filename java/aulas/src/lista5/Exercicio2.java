package lista5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.print("Digite seu peso: ");
		peso = leia.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = leia.nextDouble();
		
		imc = peso / (altura*altura);   
		
		if(imc < 18.5) {
			System.out.print("Abaixo do peso");
		} else if(imc >= 18 && imc <= 25) {
			System.out.print("Peso normal");
		} else if(imc >= 25.1 && imc <= 30) {
			System.out.print("Acima do peso");
		} else if(imc > 30) {
			System.out.print("Obeso");
		}
		
		System.out.print("Seu IMC é " + Math.round(imc * 100.0)/100.0);
		
		
		
	}

}