package lista_arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int contador;
		int numerosPares[] = new int[6];
		int numerosImpares[] = new int [6];
		int numero[] = new int[6];
		int somaPares = 0, quantidadeImpares = 0;
		
		for(contador = 0; contador < 6; contador++) {
			System.out.print("Digite o " + (contador+1) + "� n�mero: ");
			numero[contador] = scan.nextInt();
			if(numero[contador] % 2 == 0) {
				numerosPares[contador] = numero[contador];
				somaPares = somaPares + numerosPares[contador];
			} else {
				numerosImpares[contador] = numero[contador];
				quantidadeImpares = quantidadeImpares + 1;
			}
		}

		System.out.print("\n");
		
		System.out.print("Os n�meros pares digitados: "); 
		for(contador = 0; contador < 6; contador++) {
			if(numerosPares[contador] != 0) {
				System.out.print(numerosPares[contador] + " ");
			}	
		}
		
		System.out.print("\n");
		
		System.out.print("Os n�meros �mpares digitados: ");
		for(contador = 0; contador < 6; contador++) {
			if(numerosImpares[contador] != 0) {
				System.out.print(numerosImpares[contador] + " ");
			}
			
		}
		
		System.out.print("\n");
		
		System.out.print("A soma dos n�meros pares digitados: " + somaPares + "\n");
		System.out.print("A quantidade de n�meros �mpares digitados: " + quantidadeImpares + "\n");
		
	}
	
}