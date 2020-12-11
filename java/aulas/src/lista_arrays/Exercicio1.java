package lista_arrays;

public class Exercicio1 {

	public static void main(String[] args) {

		int A[] = {1, 0, 5, -2, -5, 7};

		int variavel;
		
		variavel = A[0] + A[1] + A[5];
				
		System.out.println("Valor da soma A[0] + A[1] + A[5] é: " + variavel + "\n");
				
		A[4] = 100;
		
		for(int kc = 0; kc < 6; kc++) {
			System.out.println(A[kc]);
		}
				
	}

}
